import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập khoảng cho trước :");
        System.out.println("Khoảng bắt đầu từ : ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Đến : ");
        int y = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= y ; i++) {
            if ( i % 2 == 0 && i >= x ) {
                sum += i;

            }


        }
        System.out.println("Tổng là : " +sum);

        }
    }

