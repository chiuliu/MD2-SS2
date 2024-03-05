import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========MENU==========");
        System.out.println("Mời bạn chọn các loại hình : ");
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the square triangle.");
        System.out.println("3. Print isosceles triangle.");
        System.out.println("0. Exit.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");

                    }
                    System.out.println();

                }
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");

                    }
                    System.out.println();

                }
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 5 - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i * 2; k++) {
                        System.out.print("*");
                    }
                    System.out.println();


                }


        }
    }
}
