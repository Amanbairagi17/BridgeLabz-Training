package com.objectmodelling.level1.universitysystemmanagement;

public class Professor {
	//Attributes
	private int id;
    private String name;

    // constructor
    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // return name
    public String getProfessorName() {
        return name;
    }

//	@Override
//	public String toString() {
//		return "Professor [id=" + id + ", name=" + name + "]";
//	}
}