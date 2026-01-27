package com.iostreams.efficientreadandwrite;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Problem2 {
	private static long usingBufferReader(File source, File destination) {
		long startTime = System.nanoTime();
		
		BufferedInputStream  bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(source));
			bos = new BufferedOutputStream(new FileOutputStream(destination));
			
			int data;
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			System.out.println("File Copied Succesfully !!");
			
//			// to get path of file 
//			System.out.println("Destination file location:");
//			System.out.println(destinationFile.getAbsolutePath());
//			
//			
//			//print actual data of source file
//			System.out.println("source file data");
//			 readFile(sourceFile);
//			 
//			//print actual data of destination file
//			System.out.println("\ndestination file data");
//			readFile(destinationFile);

		} catch (Exception e) {
			System.out.println("Error occurred while handling file:");
            e.printStackTrace();
		}
		
		finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		long endTime = System.nanoTime();
			
		return endTime - startTime;
		
	}
	private static long withoutBufferReader(File source, File destination) {
		long startTime = System.nanoTime();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(destination);
			
			int data;
			
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File Copied Succesfully !!");
			
//			// to get path of file 
//			System.out.println("Destination file location:");
//			System.out.println(destinationFile.getAbsolutePath());
//			
//			
//			//print actual data of source file
//			System.out.println("source file data");
//			 readFile(sourceFile);
//			 
//			//print actual data of destination file
//			System.out.println("\ndestination file data");
//			readFile(destinationFile);

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
		long endTime = System.nanoTime();
			
		return endTime - startTime;
	}
	public static void main(String[] args) {
		File sourceFile = new File(
	            "C:\\Users\\Deep Computers\\OneDrive\\Desktop\\Java Programming Workspace\\java-collections-practice\\gcr-codebase\\JavaCollectionsPractice\\src\\com\\iostreams\\efficientreadandwrite\\stream.txt"
	        );

	        File destWithoutBuffer =
	                new File("stream_without_buffer.txt");

	        File destWithBuffer =
	                new File("stream_with_buffer.txt");
	        
	        long timeWithoutBuffer =
	                withoutBufferReader(sourceFile, destWithoutBuffer);

	        long timeWithBuffer =
	                usingBufferReader(sourceFile, destWithBuffer);

	        System.out.println("Check result ");
	        System.out.println("Without Buffer : "
	                + timeWithoutBuffer / 1_000_000 + " ms");

	        System.out.println("With Buffer    : "
	                + timeWithBuffer / 1_000_000 + " ms");
	        
	        System.out.println("Copied File 1");
	        destWithBuffer.getAbsoluteFile();
	        
	        
	}
}
