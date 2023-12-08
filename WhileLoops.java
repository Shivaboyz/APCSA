public class WhileLoops {

    public int addOdds(int n) {
        int count = 1;
        int sum = 0;
        while (count <= n) {
            sum += count;
            count += 2;
        }
        return sum;
    }

    public int sumDigits(int num) {
        int sum = 0;

        while (num >= 1) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }

    public int howManyYears(double startpop, double endpop) {
        double deltapop = startpop;
        int yearcount = 0;
        while (deltapop < endpop) {
            deltapop *= 1.0113;
            yearcount++;
        }
        return yearcount;
    }

    public void printSum(int num) {
        int queue = 1;
        int sum = 0;
        while (queue != num) {
            sum += queue;
            System.out.print(queue + " + ");
            queue++;
        }
        System.out.println(num + " = " + (sum + num));
    }

    public boolean isPerfectSquare(int num) {
        int adder = 1;
        int sum = 0;
        while (sum < num) {
            sum += adder;
            adder += 2;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        WhileLoops loooops = new WhileLoops();
        System.out.println("addOdds method");
        System.out.println(loooops.addOdds(67));
        System.out.println(loooops.addOdds(54));
        System.out.println(loooops.addOdds(102));
        System.out.println();
        System.out.println("sumDigits method");
        System.out.println(loooops.sumDigits(2025));
        System.out.println(loooops.sumDigits(10298));
        System.out.println(loooops.sumDigits(154248422));
        System.out.println();
        System.out.println("howManyYears method");
        System.out.println(loooops.howManyYears(111.2, 120));
        System.out.println(loooops.howManyYears(111.2, 150));
        System.out.println(loooops.howManyYears(193.4, 788.7));
        System.out.println();
        System.out.println("printSum method");
        loooops.printSum(6);
        loooops.printSum(79);
        loooops.printSum(8);
        System.out.println();
        System.out.println("isPerfectSquare method");
        System.out.println(loooops.isPerfectSquare(25));
        System.out.println(loooops.isPerfectSquare(49));
        System.out.println(loooops.isPerfectSquare(168));
        System.out.println(loooops.isPerfectSquare(70));

    }
}