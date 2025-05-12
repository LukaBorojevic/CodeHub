public class FindAverage {
    public double getRowAwerage(int[][] array, int row) {
        if (row >= array.length || row < 0) {
            throw new IllegalArgumentException("Invalid row index");
        }
        double sum = 0;
        for (int i = 0; i < array[row].length; i++) {
            sum += array[row][i];
        }
        return sum / array[row].length;
    }
}
