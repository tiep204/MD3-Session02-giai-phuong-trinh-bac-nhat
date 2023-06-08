import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập số c: ");
        int c = Integer.parseInt(scanner.nextLine());
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("phương trình có 1 nghiệm duy nhất:"+x);
        }else {
            if (b==0){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình của bạn vô nghiệm");
            }
        }
    }
}