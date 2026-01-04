package com.linkedlist.socialmediafriendconnection;

public class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;   // Head of friend list
    UserNode next;// Node for connection

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}

