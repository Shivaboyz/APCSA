public class Factorial {

    public long calcFactorial(long num) {
        long sum = 1;
        for (int i = 1; i <= num; sum *= i, i++) {}
        return sum;
    }





    public static void main(String[] args) {
        Factorial ft = new Factorial();
        System.out.println("calcFactorial method");
        for(int j = 1; j < 21; j++){
            System.out.println(ft.calcFactorial(j));
        }

    }


}