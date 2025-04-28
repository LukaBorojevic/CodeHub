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
}
