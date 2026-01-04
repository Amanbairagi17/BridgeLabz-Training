package com.linkedlist.socialmediafriendconnection;

public class SocialMediaPlatform {
	public static void main(String[] args) {

        ConnectionList sm = new ConnectionList();

        sm.addUser(1, "Aman", 21);
        sm.addUser(2, "Rohan", 22);
        sm.addUser(3, "Neha", 20);
        sm.addUser(4, "Priya", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(3, 4);

        sm.displayFriends(1);
        sm.displayFriends(3);

        sm.mutualFriends(1, 2);

        sm.countFriends();

        sm.removeFriend(1, 3);

        System.out.println("\nAfter Removing Friend:");
        sm.displayFriends(1);
    }
}
