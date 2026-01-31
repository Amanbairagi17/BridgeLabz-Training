package com.regex.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    // regex rules
    private static final Pattern METHOD_PATTERN =
            Pattern.compile("(public|private|protected)\\s+\\w+\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import\\s+([\\w\\.]+);");

    public static void main(String[] args) throws IOException {

        Path root = Paths.get("src/com/regex/source/A");

        // Collections
        List<Path> javaFiles = new ArrayList<>();
        Map<FileType, List<File>> categorizedFiles = new HashMap<>();
        Set<String> unusedImports = new HashSet<>();

        for (FileType type : FileType.values())
            categorizedFiles.put(type, new ArrayList<>());

        //Scan all java files
        try (Stream<Path> paths = Files.walk(root)) {
            javaFiles = paths
                    .filter(p -> p.toString().endsWith(".java"))
                    .collect(Collectors.toList());
        }

        System.out.println("Total Java files found: " + javaFiles.size());
        
        // Analyze each file
        for (Path path : javaFiles) {

            File file = path.toFile();
            String content = Files.readString(path);

            boolean hasNamingIssue = false;
            boolean hasUnusedImport = false;

            // method naming check
            Matcher methodMatcher = METHOD_PATTERN.matcher(content);
            if (methodMatcher.find()) {
                hasNamingIssue = true;
            }

            // import extraction
            Matcher importMatcher = IMPORT_PATTERN.matcher(content);

            while (importMatcher.find()) {
                String imp = importMatcher.group(1);

                String className =
                        imp.substring(imp.lastIndexOf(".") + 1);

                if (!content.contains(className + " ")) {
                    unusedImports.add(imp);
                    hasUnusedImport = true;
                }
            }

            // categorization
            if (hasNamingIssue)
                categorizedFiles.get(FileType.ERRORS).add(file);

            else if (hasUnusedImport)
                categorizedFiles.get(FileType.WARNINGS).add(file);

            else
                categorizedFiles.get(FileType.VALID).add(file);
        }

        //  Output summary
        System.out.println("\n CLEANER SUMMARY ");

        categorizedFiles.forEach((type, files) -> {
            System.out.println(type + " → " + files.size());
        });

        System.out.println("\nUnused Imports Detected:");
        unusedImports.forEach(System.out::println);

        // 4️ Stream-based filtering
        System.out.println("\nFiles larger than 2 KB:");

        javaFiles.stream()
                .filter(p -> p.toFile().length() > 2048)
                .forEach(p ->
                        System.out.println(
                                p.getFileName() + " → " +
                                p.toFile().length() + " bytes"));

        System.out.println("\nFiles modified in last 2 days:");

        long twoDaysAgo =
                System.currentTimeMillis() - (2L * 24 * 60 * 60 * 1000);

        javaFiles.stream()
                .filter(p -> p.toFile().lastModified() > twoDaysAgo)
                .forEach(p -> System.out.println(p.getFileName()));
    }
}
