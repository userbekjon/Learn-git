import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println(ekuk(a,b));

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
}