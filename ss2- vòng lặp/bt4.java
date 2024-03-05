import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.println("Hiễn thị 20 số nguyên tố đầu tiên là : ");
        while (count < 20){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if ( num % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.print(+num+",");
                count ++;
            }
            num++;
        }


    }
}
