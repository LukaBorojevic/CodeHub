public class Calculator {
    public int[] MinMax (int[] array)
    {
        int[] sortedArray = array.clone();

        for(int i = 0; i < sortedArray.length - 1; i++)
        {
            for(int j = 0; j< sortedArray.length -1 -i;j++)
            {
                if(sortedArray[j]<sortedArray[j+1])
                {
                    int temp = sortedArray[j];
                    sortedArray[j]=sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }
        int min = sortedArray[0] + sortedArray[1] + sortedArray[2];
        int max = sortedArray[4] + sortedArray[3] + sortedArray[2];
        return new int[]{min,max};

    }
}
