
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int index = 2;
        int value = ArrayHelper.getValueAtIndex(numbers, index);
        System.out.println("Value at index " + index + " is: " + value);
    }
}

