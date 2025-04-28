public class ArrayHelper {
    public void printAllValues(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Value at index " + i + " is " + array[i] + "");

        }
    }
    public int getValueAtIndex(int[] array, int index) {
        return array[index];
    }
    public int calculateSum(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        return a;
    }
    public void print(int value){
        System.out.println(value);
    }
}
