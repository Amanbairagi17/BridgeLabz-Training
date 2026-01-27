package com.iostreams.imagetobytearray;

import java.io.*;

public class Problem5 {
    public static void main(String[] args) {

        File originalImage = new File("C:\\Users\\Deep Computers\\OneDrive\\Pictures\\Pictures\\Pictures\\SAVE_20240816_051929.jpg");
        File copiedImage = new File("output.jpg");

        try {
            // image to byte array
            FileInputStream fis = new FileInputStream(originalImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            System.out.println("Image converted to byte array.");
            System.out.println("Byte array size: " + imageBytes.length);

           
            //byte array to image
            ByteArrayInputStream bais =
                    new ByteArrayInputStream(imageBytes);

            FileOutputStream fos = new FileOutputStream(copiedImage);

            while ((data = bais.read()) != -1) {
                fos.write(data);
            }

            bais.close();
            fos.close();

            System.out.println("New image file created successfully.");

            // -------------------------------
            // VERIFY FILES
            // -------------------------------
            if (originalImage.length() == copiedImage.length()) {
                System.out.println("✅ Images are identical (same size).");
            } else {
                System.out.println("❌ Images differ.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
