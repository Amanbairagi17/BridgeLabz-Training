package com.compartmentnavigationsystem;

public class TrainCompanion {
    private CompartmentNode head;
    private CompartmentNode tail;
    private CompartmentNode current;

    // Add compartment at end
    void addCompartment(String name, boolean pantry, boolean wifi) {
        CompartmentNode node = new CompartmentNode(name, pantry, wifi);

        if (head == null) {
            head = tail = current = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        System.out.println("Added compartment: " + name);
    }

    // Remove current compartment
    void removeCurrent() {
        if (current == null) {
            System.out.println("No compartment to remove");
            return;
        }

        System.out.println("Removed: " + current.name);

        if (current == head) head = current.next;
        if (current == tail) tail = current.prev;

        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;

        current = (current.next != null) ? current.next : current.prev;
    }

    // Move forward
    void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            showCurrent();
        } else {
            System.out.println("No next compartment");
        }
    }

    // Move backward
    void movePrev() {
        if (current != null && current.prev != null) {
            current = current.prev;
            showCurrent();
        } else {
            System.out.println("No previous compartment");
        }
    }

    // Show current compartment
    void showCurrent() {
        if (current == null) {
            System.out.println("No compartment");
            return;
        }
        System.out.println("Current: " + current.name +
                " | Pantry: " + current.hasPantry +
                " | WiFi: " + current.hasWifi);
    }
    

    // Show adjacent compartments
    void showAdjacent() {
        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));
        System.out.println("Next: " +
                (current.next != null ? current.next.name : "None"));
    }
    

    // Search service
    void searchService(String service) {
        CompartmentNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((service.equalsIgnoreCase("pantry") && temp.hasPantry) ||
                (service.equalsIgnoreCase("wifi") && temp.hasWifi)) {
                System.out.println(service + " available at: " + temp.name);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println(service + " not found in train");
        }
    }
}
