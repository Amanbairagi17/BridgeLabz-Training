package com.linkedlist.texteditor;

public class TextEditorHistory  {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int size;
    private final int MAX_SIZE = 10;

    // Add new text state
    public void addState(String text) {
        TextState newState = new TextState(text);

        // If undo was used, clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Limit history size
        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current text
    public void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }

    // Display full history (for debugging)
    public void displayHistory() {
        TextState temp = head;
        System.out.print("History: ");
        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.content + "] ");
            } else {
                System.out.print(temp.content + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
