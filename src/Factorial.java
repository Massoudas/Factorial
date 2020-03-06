public class Factorial {
    public static long calculateFactorial(int number){
        long factorial=1;
        for(int i=number; i>0; i--){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(35));
    }
}
