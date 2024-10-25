package Les2;

public class NewArray implements NewInterface {
    private final long[] array;
    private int a;

    public NewArray(int size) {
        this.array = new long[size];
        this.a = 0;
    }
    public boolean delete(long value) {
        int i;
        for (i = 0; i < this.a; i++) {
            if (array[i] == value) {
                break;
            }
        }

        if (i == a - 1) {
            return false;
        } else {
            for (int j = i; j < a - 1; j++) {
                array[j] = array[j + 1];
            }
            a--;
            return true;
        }
    }

    public boolean find(long searchValue) {
        for (int i = 0; i < this.a; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }

        return false;
    }

    public void insert(long value) {
        array[a] = value;
        a++;
    }



    public void display() {
        for (int i = 0; i < a; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public void getSize() {
        int count = 0;
        for (int i = 0; i < a; i++) {
            count ++;
        }
        System.out.println(count);
    }

    public void getMax() {
        int maxElem = 0;
        for (int i = 0; i < a; i++){
            if (array[i] > maxElem) {
                maxElem = (int) array[i];
            }
        }
        System.out.println(maxElem);
    }

    public void getMin() {
        long minElem = array[0];
        for (int i = 0; i < a; i++){
            if(array[i] < minElem){
                minElem = (int) array[i];
            }
        }
        System.out.println(minElem);
    }
}