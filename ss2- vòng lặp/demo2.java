import java.util.Scanner;

// Nhập số nguyên bất kỳ
// in ra menu và thực hiện chức năng sau
// 1 Tìm số uốc cửa số vừa nhập
// 2 Tính tổng casc upwsc//
// 3 tìm các số chia hết cho 3 và 5 trong khoảng 1 đến n
// Thoát
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============ MENU ============");
        System.out.println("Mời bạn nhập số bất kỳ : ");
        int num = Integer.parseInt(scanner.nextLine());
        int soUoc = 0;
        int tongUoc = 0;
        int chiaHet;

        for (int i = 1; i <= num ; i++) {
            if ( num % i == 0) {
                soUoc ++;
                tongUoc = tongUoc + i;

            }
        }
        System.out.print( "Các số chia hết cho 3 và 5 trong khoảng 1 đén " +num+" là :"   );
        for (int j = 1; j <= num ; j++){
            if ( j % 3 == 0 && j % 5 == 0){
                System.out.print(j+",");
            }

        }
        System.out.println();
        System.out.println("Số ước của " +num+ " là :" +soUoc );
        System.out.println("Tổng số ước của " +num+ " là :" +tongUoc );
    }
}
