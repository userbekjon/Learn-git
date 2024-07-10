public class Main {
    public static void main(String[] args) {
        
    }

    public static int Ekub(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            } else{
                a= b-a;
            }
        }
        return a;
    }
}