package com.texteditor;

import java.util.Stack;

public class Editor {

	StringBuilder sb = new StringBuilder();
	Stack<Action> undoSt = new Stack<>();
	Stack<Action> redoSt = new Stack<>();
	
	//insert word into stack
	public void insert(String word) {
		Action action = new Action(word, "Insert");
		sb.append(word);
		undoSt.push(action);
	}
	
	//format 
	public void format(String word) {
		Action action = new Action(word, "Format");
		undoSt.push(action);
	}
	
	//deleting word form stack
	public void delete() {
		if(undoSt.isEmpty()) {
			System.out.println("No element to delete");
			return;
		}
		String word = undoSt.peek().word;
		Action action = new Action(word, "Delete");
		undoSt.push(action);
	}
	
	//undo operations
	public void undo() {
		if(undoSt.isEmpty()) {
			System.out.println("No action to undo");
			return;
		}
		Action action = undoSt.pop();
		System.out.println("Undo action " + action.action + " " + action.word);
		redoSt.push(action);
	}
	
	//redo operations
	public void redo() {
		if(redoSt.isEmpty()) {
			System.out.println("No action to redo");
			return;
		}
		Action action = redoSt.pop();
		System.out.println("Redo action " + action.action + " " + action.word);
		undoSt.push(action);
	}
	
}
