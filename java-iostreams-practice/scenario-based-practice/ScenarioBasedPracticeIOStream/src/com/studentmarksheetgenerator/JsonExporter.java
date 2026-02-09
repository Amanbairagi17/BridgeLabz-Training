package com.studentmarksheetgenerator;


public class JsonExporter {

    public static void export(List<Student> students, String filePath)
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File(filePath), students);
    }
}
