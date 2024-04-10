import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj długość boku: ");
        int x = input.nextInt();
        System.out.println("Dwa trójkąty obok siebie:");
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < x; j++) {
                if (i == x - 1 || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print(" ");
           
            for (int j = 0; j < x; j++) {
                if (i == x- 1 || j == x-1 || j == x - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}