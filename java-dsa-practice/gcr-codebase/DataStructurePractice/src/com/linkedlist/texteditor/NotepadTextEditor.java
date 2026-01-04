package com.linkedlist.texteditor;

public class NotepadTextEditor {
	public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        editor.addState("Hello Java");
        editor.displayCurrent();

        System.out.println("\nFull History:");
        editor.displayHistory();
    }
}
