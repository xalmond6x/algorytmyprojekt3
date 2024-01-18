package Hash_1;

import java.util.ArrayList;
import java.util.List;

public class LinkedListHash {

        private final int size;
        private final List<Integer>[] items;

        public LinkedListHash(int size) {
            this.size = size;
            items = new List[size];
        }

        public void add(int value) {
            int index = hashFunction(value);

            if (items[index] == null) {
                items[index] = new ArrayList<>();
            }

            items[index].add(value);
        }

        public boolean contains(int value) {
            int index = hashFunction(value);

            if (items[index] != null) {
                return items[index].contains(value);
            }

            return false;
        }

        public void itemsDisplayedAfterHashing() {
            System.out.println("\nElementy Hash_1:");
            for (int i = 0; i < size; i++) {
                System.out.print("Slot " + i + ": ");
                if (items[i] != null) {
                    for (int item : items[i]) {
                        System.out.print(item + " ");
                    }
                }
                System.out.println();
            }
        }

        private int hashFunction(int value) {
            return Math.abs(value % size);
        }
    }

