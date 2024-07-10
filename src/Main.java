public class Main {
    public static void main(String[] args) {
        evenNumbers(10);
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