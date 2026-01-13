package com.parceltracker;

public class ParcelTracker {
    private StageNode head;

    // Initialize default delivery chain
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Forward tracking
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is lost. No tracking available.");
            return;
        }

        StageNode temp = head;
        System.out.print("Tracking Path: ");

        while (temp != null) {
            System.out.print(temp.geString());
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add custom checkpoint after a stage
    void addCheckpoint(String afterStage, String newStage) {
        if (head == null) {
            System.out.println("Cannot add checkpoint. Parcel is missing.");
            return;
        }

        StageNode temp = head;

        while (temp != null) {
            if (temp.geString().equalsIgnoreCase(afterStage)) {
                StageNode node = new StageNode(newStage);
                node.next = temp.next;
                temp.next = node;

                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + afterStage);
    }

    // Simulate lost parcel
    void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as LOST.");
    }
}
