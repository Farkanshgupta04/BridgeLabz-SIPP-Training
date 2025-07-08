import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds; // Simplified friend list
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
    }
}

class SocialNetwork {
    User head;

    void addUser(User u) {
        u.next = head;
        head = u;
    }

    void addFriend(int userId1, int userId2) {
        User u1 = findUser(userId1);
        User u2 = findUser(userId2);
        if (u1 != null && u2 != null && !u1.friendIds.contains(userId2)) {
            u1.friendIds.add(userId2);
            u2.friendIds.add(userId1);
        }
    }

    void removeFriend(int userId1, int userId2) {
        User u1 = findUser(userId1);
        User u2 = findUser(userId2);
        if (u1 != null && u2 != null) {
            u1.friendIds.remove(Integer.valueOf(userId2));
            u2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    void findMutualFriends(int id1, int id2) {
        User u1 = findUser(id1);
        User u2 = findUser(id2);
        if (u1 != null && u2 != null) {
            System.out.println("Mutual Friends:");
            for (int id : u1.friendIds) {
                if (u2.friendIds.contains(id)) {
                    User mutual = findUser(id);
                    System.out.println(mutual.name + " (ID: " + id + ")");
                }
            }
        }
    }

    void displayFriends(int id) {
        User u = findUser(id);
        if (u != null) {
            System.out.println(u.name + "'s Friends:");
            for (int fid : u.friendIds) {
                User f = findUser(fid);
                System.out.println("→ " + f.name + " (ID: " + f.userId + ")");
            }
        }
    }

    void searchByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.name + ", ID: " + temp.userId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    User findUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();
        network.addUser(new User(1, "Arjun", 25));
        network.addUser(new User(2, "Neha", 22));
        network.addUser(new User(3, "Vikram", 23));
        network.addUser(new User(4, "Anjali", 24));

        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        network.addFriend(2, 4);

        network.displayFriends(2);
        network.findMutualFriends(1, 2);
    }
}