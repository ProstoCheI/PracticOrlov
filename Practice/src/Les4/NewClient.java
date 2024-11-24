package Les4;
import java.util.Random;

public class NewClient {
    public static void main(String[] args) {
        Random random = new Random();

        long start;
        long end;

        int size = 10000;
        BubbleSort bubbleArray = new BubbleSort(size);
        InsertionSort insertionArray = new InsertionSort(size);
        SelectionSort selectionArray = new SelectionSort(size);

        for (int i = 0; i < size; i++) {
            bubbleArray.insert(random.nextLong(10000));
            insertionArray.insert(random.nextLong(10000));
            selectionArray.insert(random.nextLong(10000));
        }

        System.out.println("Bubble");
        bubbleArray.display();
        start = System.currentTimeMillis();
        bubbleArray.bubbleSort();
        end = System.currentTimeMillis();
        bubbleArray.display();
        System.out.printf("Время выполнения: %d млс \n", end - start);

        System.out.println("\nInsertion");
        insertionArray.display();
        start = System.currentTimeMillis();
        insertionArray.insertionSort();
        end = System.currentTimeMillis();
        insertionArray.display();
        System.out.printf("Время выполнения: %d млс \n", end - start);

        System.out.println("\nSelection");
        selectionArray.display();
        start = System.currentTimeMillis();
        selectionArray.selectionSort();
        end = System.currentTimeMillis();
        selectionArray.display();
        System.out.printf("Время выполнения: %d млс \n", end - start);
    }
}
