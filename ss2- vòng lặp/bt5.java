public class bt5 {
    public static void main(String[] args) {
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho cả 5 , 7 và 11 là :");
        int n = 1;
        while (n>0){
            for (int i = 0; i < n; i++) {
                if (n % 5 != 0){
                    n++;
                    break;
                }
                if (n % 7 != 0){
                    n++;
                    break;
                }
                if (n % 11 != 0){
                    n++;
                    break;
                }
                System.out.println(+n);
                return;

            }

        }
    }
}
