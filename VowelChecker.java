import java.util.Scanner;
public class VowelChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a character: ");
char input = scanner.next().charAt(0);  
     switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(input + " is a vowel.");
                break;
            default:
                System.out.println(input + " is not a vowel.");
                break;
        }

        scanner.close();
    }
}
