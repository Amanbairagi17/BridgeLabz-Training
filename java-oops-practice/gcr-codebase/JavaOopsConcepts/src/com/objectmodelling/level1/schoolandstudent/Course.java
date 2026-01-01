package com.objectmodelling.level1.schoolandstudent;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String title;
    private List<Student> students = new ArrayList<Student>();
    
    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }
    
    public String getTitle() {
        return title;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    

	public void viewStudents() {
        for(Student student : students) System.out.println(student.getName() + " ");
    }
	
//	@Override
//	public String toString() {
//		return "Course [title=" + this.title + ", students=" + this.students + "]";
//	}
}
