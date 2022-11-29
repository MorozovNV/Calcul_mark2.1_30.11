import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputChars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputChars[i] = input.charAt(i);
        }
        int a = 0;
        int b = 0;
        String buffer = "";
        char operator = ' ';
        int indexOperator = 0;
        char[] operatorBase = {'+', '-', '/', '*'};
        boolean f = false;

        for (int i = 0; i < input.length(); i++) {
            for (char c : operatorBase) {
                if (inputChars[i] == c) {
                    operator = inputChars[i];
                    indexOperator = i;
                    f = true;
                    break;
                }
            }
            if (f) break;
            buffer = buffer + Character.toString(inputChars[i]);
        }

        try {
            a = Integer.parseInt(buffer);
        } catch (NumberFormatException e) {
            System.out.println("pizda");
        }

        buffer = "0";
        for (int i = indexOperator + 1; i < input.length(); i++) {
            buffer = buffer + Character.toString(inputChars[i]);
        }

        try {
            b = Integer.parseInt(buffer);
        } catch (NumberFormatException e) {
            System.out.println("pizda2");
        }
        System.out.println(a);
        System.out.println(operator);
        System.out.println(b);
        System.out.println("______");
        switch (operator){
            case ('+') -> System.out.println(a+b);
            case ('-') -> System.out.println(a-b);
            case  ('*') -> System.out.println(a*b);
            case  ('/') -> System.out.println(a/b);
            default -> System.out.println("Ni_Hu_ia");
        }

        scanner.nextLine();
    }

}
