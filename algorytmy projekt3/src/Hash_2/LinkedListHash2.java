package Hash_2;

import java.util.LinkedList;

public class LinkedListHash2 {

    private final LinkedList<Integer>[] items;
    private static final double A = (Math.sqrt(5) - 1) / 2;

    public LinkedListHash2(int size) {
        items = new LinkedList[size];
    }

    public void add(int item) {
        int position = getArrayPosition(item);
        LinkedList<Integer> linkedList = getLinkedList(position);
        linkedList.addLast(item);
    }

    public boolean find(int item) {
        int position = getArrayPosition(item);
        LinkedList<Integer> linkedList = getLinkedList(position);
        return linkedList.contains(item);
    }

    public void itemsDisplayedAfterHashing() {
        System.out.println("\nElementy Hash_2:");
        for (int i = 0; i < items.length; i++) {
            System.out.print("Slot " + i + ": ");
            if (items[i] != null) {
                for (int item : items[i]) {
                    System.out.print(item + " ");
                }
            }
            System.out.println();
        }
    }

    private int getArrayPosition(int item) {
        double temp = item * A;
        temp -= Math.floor(temp);
        int position = (int) (items.length * temp);
        return Math.abs(position);
    }

    private LinkedList<Integer> getLinkedList(int position) {
        LinkedList<Integer> linkedList = items[position];
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            items[position] = linkedList;
        }
        return linkedList;
    }
}
