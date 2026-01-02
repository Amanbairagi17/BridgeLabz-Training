package com.linkedlist.moviemanagementsystem;

public class MovieLinkedList {
	private MovieNode head;
	private MovieNode tail;
	
	//added node at beginning
	 public void addAtBeginning(String t, String d, int y, double r) {
	        MovieNode node = new MovieNode(t, d, y, r);
	        if (head == null) {
	            head = tail = node;
	            return;
	        }
	        node.next = head;
	        head.prev = node;
	        head = node;
	   }
	 
	 //added at end
	 public void addAtEnd(String t, String d, int y, double r) {
		 MovieNode node = new MovieNode(t, d, y, r);
		 if(tail == null) {
			 tail = head = node;
			 return;
		 }
		 
		 tail.next = node;
		 node.prev = tail;
		 tail = node;
		 
	 }
	 
	// Add at specific position (1-based)
	    public void addAtPosition(int pos, String t, String d, int y, double r) {
	        if (pos <= 1) {
	            addAtBeginning(t, d, y, r);
	            return;
	        }

	        MovieNode temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            addAtEnd(t, d, y, r);
	            return;
	        }

	        MovieNode node = new MovieNode(t, d, y, r);
	        node.next = temp.next;
	        node.prev = temp;
	        temp.next.prev = node;
	        temp.next = node;
	    }
	    
	 // Remove by movie title
	    public void removeByTitle(String title) {
	        MovieNode temp = head;

	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                if (temp == head) head = temp.next;
	                if (temp == tail) tail = temp.prev;

	                if (temp.prev != null) temp.prev.next = temp.next;
	                if (temp.next != null) temp.next.prev = temp.prev;

	                return;
	            }
	            temp = temp.next;
	        }
	    }
	    
	 // Search by director
	    public void searchByDirector(String director) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.director.equalsIgnoreCase(director)) {
	                printMovie(temp);
	            }
	            temp = temp.next;
	        }
	    }
	    
	 // Search by rating
	    public void searchByRating(double rating) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.rating >= rating) {
	                printMovie(temp);
	            }
	            temp = temp.next;
	        }
	    }

	    // Update rating by title
	    public void updateRating(String title, double newRating) {
	        MovieNode temp = head;
	        while (temp != null) {
	            if (temp.title.equalsIgnoreCase(title)) {
	                temp.rating = newRating;
	                return;
	            }
	            temp = temp.next;
	        }
	    }

	    // Display forward
	    public void displayForward() {
	        MovieNode temp = head;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.next;
	        }
	    }

	    // Display reverse
	    public void displayReverse() {
	        MovieNode temp = tail;
	        while (temp != null) {
	            printMovie(temp);
	            temp = temp.prev;
	        }
	    }

	    private void printMovie(MovieNode m) {
	        System.out.println(
	            m.title + " | " + m.director + " | " + m.yearOfRelease + " | Rating: " + m.rating
	        );
	    }
}
