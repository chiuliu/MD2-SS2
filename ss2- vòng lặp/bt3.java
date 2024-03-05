public class bt3 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là : ");
        int num = 2 ;
        while (num <= 100){
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if ( num % i == 0 || num >= 100){
                    flag = false;
                    break;
                }

            }
            if (flag){
                System.out.print(+num+ ",");
            }
            num++;

        }

    }
}
