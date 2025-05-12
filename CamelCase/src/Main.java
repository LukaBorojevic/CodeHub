import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        CamelCase camelCase = new CamelCase();
        int result = camelCase.camelCase(sentence);

        System.out.println("Number of words is:" + result);
    }
}