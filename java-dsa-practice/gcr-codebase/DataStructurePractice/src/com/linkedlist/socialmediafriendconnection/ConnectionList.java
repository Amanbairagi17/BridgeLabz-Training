package com.linkedlist.socialmediafriendconnection;

public class ConnectionList {
    private UserNode head;

    // Add user
    public void addUser(int id, String name, int age) {
        UserNode user = new UserNode(id, name, age);
        user.next = head;
        head = user;
    }

    // Find user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search user by name
    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.userId + " " + temp.name);
            }
            temp = temp.next;
        }
    }

    // Add friend connection (both sides)
    public void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = addFriendToList(u1.friends, id2);
        u2.friends = addFriendToList(u2.friends, id1);
    }

    private FriendNode addFriendToList(FriendNode head, int id) {
        FriendNode node = new FriendNode(id);
        node.next = head;
        return node;
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = removeFromFriendList(u1.friends, id2);
        u2.friends = removeFromFriendList(u2.friends, id1);
    }

    private FriendNode removeFromFriendList(FriendNode head, int id) {
        if (head == null) return null;

        if (head.friendId == id) return head.next;

        FriendNode curr = head;
        while (curr.next != null && curr.next.friendId != id) {
            curr = curr.next;
        }
        if (curr.next != null) {
            curr.next = curr.next.next;
        }
        return head;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count friends
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Find mutual friends
    public void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friends;

        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }
}

