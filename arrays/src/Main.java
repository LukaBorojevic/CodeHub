
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
ArrayHelper helper = new ArrayHelper();
        int index = 2;
        int value = helper.getValueAtIndex(numbers, index);

       helper.print(helper.calculateSum(numbers));
       helper.print(value);

      int[] evenIndexElements = helper.getEvenIndexElements(numbers);
      helper.printAllValues(evenIndexElements);
    }

}

