package com.texteditor;

public class TextEditorApp {
	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.insert("welcome");
		editor.insert("have");
		editor.undo();
		
		editor.insert("to");
		editor.undo();
		editor.redo();
	}
}
