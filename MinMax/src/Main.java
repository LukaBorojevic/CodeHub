import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [5];

        System.out.println("Enter 5 numbers: ");
        for(int i=0; i<5;i++)
        {
            array[i] = scanner.nextInt();

        }
        Calculator calculator = new Calculator();
        int[] result = calculator.MinMax(array);

        System.out.println(result[0] + "  " + result [1]);
    }
}