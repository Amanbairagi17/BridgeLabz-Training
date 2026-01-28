package com.reflactions.dynamicobjectcreation;

class Ram {
    private String name;

    public Ram() {
        this.name = "Aman";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}
public class CreateObjectDynamically {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("Ram");

        // Create object dynamically
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Student student = (Student) obj;
        student.display();
    }
}
