package com.iostreams.readandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Problem1 {
	public static void readFile(File file) {

        try (FileInputStream fis = new FileInputStream(file)) {

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		File sourceFile = new File("C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\iostreams\\readandwrite\\test.txt");
		File destinationFile = new File("test2.txt");
		
		if(!sourceFile.exists()) {
			System.out.println("File Not Exits");
			return;
		}
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(destinationFile);
			
			int data;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File Copied Succesfully !!");
			
			// to get path of file 
			System.out.println("Destination file location:");
			System.out.println(destinationFile.getAbsolutePath());
			
			System.out.println("source file data");
			 readFile(sourceFile);
			 
			System.out.println("\ndestination file data");
			readFile(destinationFile);

		} catch (Exception e) {
			System.out.println("Error occurred while handling file:");
            e.printStackTrace();
		}
		
		finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
