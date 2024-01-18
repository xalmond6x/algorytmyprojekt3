package Hash_2;

import java.util.Random;

    public class Main {
        public static void main(String[] args) {

            LinkedListHash2 hashTable = new LinkedListHash2(10);

            Random random = new Random();
            int numberOfElements = 10;

            for (int i = 0; i < numberOfElements; i++) {
                int randomElement = random.nextInt(100);
                hashTable.add(randomElement);
            }

            hashTable.itemsDisplayedAfterHashing();
        }
    }
