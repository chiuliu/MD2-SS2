import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình vuông");
            System.out.println("3. Tính chu vi và diện tích tam giác");
            System.out.println("4. Tính chu vi và diện tích hình tròn");
            System.out.println("0. Thoát");
            System.out.print("Chọn loại hình muốn tính: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateRectangle(scanner);
                    break;
                case 2:
                    calculateSquare(scanner);
                    break;
                case 3:
                    calculateTriangle(scanner);
                    break;
                case 4:
                    calculateCircle(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static void calculateRectangle(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " + area);
    }

    public static void calculateSquare(Scanner scanner) {
        System.out.print("Nhập độ dài cạnh của hình vuông: ");
        double side = scanner.nextDouble();

        double perimeter = 4 * side;
        double area = side * side;

        System.out.println("Chu vi của hình vuông là: " + perimeter);
        System.out.println("Diện tích của hình vuông là: " + area);
    }

    public static void calculateTriangle(Scanner scanner) {
        System.out.print("Nhập chiều dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập chiều dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        double p = perimeter / 2; // Nửa chu vi của tam giác
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

        System.out.println("Chu vi của tam giác là: " + perimeter);
        System.out.println("Diện tích của tam giác là: " + area);
    }

    public static void calculateCircle(Scanner scanner) {
        final double PI = 3.14159265359;

        System.out.print("Nhập bán kính của hình tròn: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Chu vi của hình tròn là: " + perimeter);
        System.out.println("Diện tích của hình tròn là: " + area);
    }
}