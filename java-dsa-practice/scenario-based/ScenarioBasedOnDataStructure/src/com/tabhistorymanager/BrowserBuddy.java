package com.tabhistorymanager;
import java.util.Stack;

class BrowserBuddy {

    private Tab activeTab; //track activeTab
    private Stack<Tab> closedTabs;//store visited tabs

    BrowserBuddy() {
        activeTab = new Tab();
        closedTabs = new Stack<>();
    }

    void visit(String url) {
        activeTab.visit(url);
    }

    void back() {
        activeTab.back();
    }

    void forward() {
        activeTab.forward();
    }

    //for closing all tabs
    void closeTab() {
        if (activeTab.getCurrent() != null) {
            closedTabs.push(activeTab);
            activeTab = new Tab();
            System.out.println("Tab closed");
        }
    }

    //reopening the closed tab
    void reopenTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab reopened");
        } else {
            System.out.println("No closed tabs");
        }
    }

    //displaying current page
    void showCurrentPage() {
        PageNode current = activeTab.getCurrent();
        System.out.println(
            current == null ? "Empty tab" : "Current page: " + current.url
        );
    }
}
