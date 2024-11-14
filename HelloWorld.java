import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );

        int choose, result;

        System.out.print("ENTER NUMBER: ");
        choose = scan.nextInt();
        result = (choose * 3) / 2;
        System.out.println(result);
        if ( result%2 == 0 ) {
            System.out.println("PERFECT NUMBER");
        } else {
            System.out.println("WEAK NUMBER");
        }
    }
}
