import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(ekuk(a,b));
        evenNumbers(10);
    }

    public static  int ekuk(int a, int b){
        int kopaytma = a*b;
         while (a != b){
             if (a>b){
                 a -=b;
             }else {
                 b -=a;
             }
         }
         return kopaytma/a;
    }

    public static void evenNumbers(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println(i);
            }
                count = 0;
        }
    }

}