import java.util.*;

class CustomHashMap {
    private class Entry {
        int key;
        String value;
        Entry next;

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private Entry[] table = new Entry[SIZE];

    public void put(int key, String value) {
        int hash = key % SIZE;
        Entry head = table[hash];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = table[hash];
        table[hash] = newEntry;
    }

    public String get(int key) {
        int hash = key % SIZE;
        Entry head = table[hash];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int hash = key % SIZE;
        Entry head = table[hash];
        Entry prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) table[hash] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public void printAll() {
        for (int i = 0; i < SIZE; i++) {
            Entry node = table[i];
            while (node != null) {
                System.out.println("Key: " + node.key + ", Value: " + node.value);
                node = node.next;
            }
        }
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, "One");
        map.put(11, "Eleven");
        map.put(21, "Twenty-One");

        System.out.println("Get key 11: " + map.get(11));
        map.remove(11);
        System.out.println("After deleting key 11:");
        map.printAll();
    }
}