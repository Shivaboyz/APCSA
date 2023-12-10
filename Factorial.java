public class Factorial {

    public long calcFactorial(long num) {
        long sum = 1;
        for (int i = 1; i <= num; sum *= i, i++) {}
        return sum;
    }

    public double calcE () {
        double oldE = 0;
        double newE = 1;
        int count = 1;

        while ((newE - oldE) > 0.001) {
            oldE = newE;
            newE += (1.0/calcFactorial(count));
            count++;
        }

        return newE;
    }

    public double calcEX (int num) {
        double oldE = 0;
        double newE = 1;
        int count = 1;

        while ((newE - oldE) > 0.001) {
            oldE = newE;
            newE += ((Math.pow(num, count))/(calcFactorial(count)));
            count++;
        }

        return newE;
    }



    public static void main(String[] args) {
        Factorial ft = new Factorial();
        System.out.println("calcFactorial method");
        for(int j = 1; j < 21; j++){
            System.out.println(ft.calcFactorial(j));
        }
        System.out.printf("\ne is %2.3f \n \n", ft.calcE());

        for(int i = 1; i <= 5; i++) {
            System.out.printf("e to the power of %d = %2.3f \n", i, ft.calcEX(i));
        }

    }


}