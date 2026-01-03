package com.linkedlist.taskscheduler;

public class TaskSchedulerLinkedlist {
    private TaskNode head;
    private TaskNode current;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String due) {
        TaskNode newNode = new TaskNode(id, name, priority, due);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    
    // Add at end
    public void addAtEnd(int id, String name, int priority, String due) {
        TaskNode newNode = new TaskNode(id, name, priority, due);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    
    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String due) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, due);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, due);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
    // Remove task by ID
    public void removeById(int id) {
        if (head == null) return;

        // Only one node
        if (head.taskId == id && head.next == head) {
            head = null;
            current = null;
            return;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        if (head.taskId == id) {
            while (prev.next != head) {
                prev = prev.next;
            }
            head = head.next;
            prev.next = head;
            return;
        }

        while (curr != head) {
            if (curr.taskId == id) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    

    // View current task and move to next
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println(
            "Task ID: " + current.taskId +
            ", Name: " + current.taskName +
            ", Priority: " + current.priority +
            ", Due: " + current.dueDate
        );

        current = current.next;
    }
    

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(
                temp.taskId + " | " +
                temp.taskName + " | Priority: " +
                temp.priority + " | Due: " +
                temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    
    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(
                    temp.taskId + " | " +
                    temp.taskName + " | Due: " +
                    temp.dueDate
                );
            }
            temp = temp.next;
        } while (temp != head);
    }
}
