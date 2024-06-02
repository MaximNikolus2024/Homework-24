import java.util.Scanner;

public class Homework24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();


        String[] splits = userInput.split(" ");
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i]);
        }

        int size = userInput.length();

        String first = userInput.substring(0, 1);

        String last = userInput.substring(size - 1, size);

        System.out.println(first);

        String result = first + first;

        System.out.println(result);

        int sizeOfString = userInput.length();

        System.out.println(sizeOfString);

        String result2 = first + last;

        System.out.println(result2);


    }
}
