package com.tabhistorymanager;

class Tab {
    private PageNode current;

    //visit current string 
    void visit(String url) {
    	//create new node 
        PageNode newPage = new PageNode(url);

        //if it is not null 
        if (current != null) {
            current.next = newPage;
            newPage.prev = current;
        }
        //then move it to current
        current = newPage;
        System.out.println("Visited: " + url);
    }

    //visit to previous url
    void back() {
    	//if current an current.next is not null then move 
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    //visit to next url
    void forward() {
    	//if current an current.next is not null then move back
    	if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    //get current url
    PageNode getCurrent() {
        return current;
    }
}
