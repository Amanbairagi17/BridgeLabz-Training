package com.linkedlist.onlineticketreservationsystem;

public class TicketReservationSystem  {
    private TicketNode head;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) return;

        // Single node case
        if (head.ticketId == id && head.next == head) {
            head = null;
            return;
        }

        // Removing head
        if (head.ticketId == id) {
            TicketNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            return;
        }

        // Removing middle or last
        TicketNode curr = head;
        while (curr.next != head && curr.next.ticketId != id) {
            curr = curr.next;
        }

        if (curr.next.ticketId == id) {
            curr.next = curr.next.next;
        }
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String customer) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customer)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Search by movie name
    public void searchByMovie(String movie) {
        if (head == null) return;

        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Count total tickets
    public int totalTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    //print ticket detail
    private void printTicket(TicketNode t) {
        System.out.println(
            "TicketID: " + t.ticketId +
            ", Customer: " + t.customerName +
            ", Movie: " + t.movieName +
            ", Seat: " + t.seatNumber +
            ", Time: " + t.bookingTime
        );
    }
}

