package Les2;
import java.util.Random;

public class NewClient {
    public static void main(String[] args) {
        Random random = new Random();

        int s = random.nextInt(50);
        NewInterface array = new NewArray(s);

        for (int i = 0; i < s; i++) {
            array.insert(random.nextLong(50));
        }

        array.display();
        long Found = random.nextLong(s);
        if (array.find(Found)) {
            System.out.println("Значение " + Found + " было найдено.");
        } else {
            System.out.println("Не удалось найти значение. " + Found);
        }
        System.out.println("Количество элементов в массиве:");
        array.getSize();
        System.out.println("Максимальный элемент массива:");
        array.getMax();
        System.out.println("Минимальный элемент массива:");
        array.getMin();
    }
}
