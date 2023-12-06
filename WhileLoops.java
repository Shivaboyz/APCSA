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
        int tensnum = 10;
        int sum = 0;
        int adder = 0;
        while (((10*num)/tensnum) > 0) {
            adder = (num%tensnum);
            adder /= (tensnum/10);
            sum += adder;
            tensnum *= 10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop) {
        startpop *= 1000000;
        endpop *= 1000000;
        int yearcount = 0;
        while (startpop >= endpop) {
            startpop *= 1.0113;
            yearcount ++;
        }
        return yearcount;
    }

    public void printSum(int num) {
        int queue = 1;
        int sum = 0;
        while (queue != num) {
            sum += queue;
            System.out.print(queue + " + ");
            queue ++;
        }
        System.out.println(" = " + (sum+num));
    }

    public boolean isPerfectSquare(int num) {
        int queuenum = 1;
        int adder = 1;
        int sum = 0;
        while (queuenum != num){
            sum += adder;
            adder += 2;
            queuenum ++;
        }

        if (queuenum == num) {
            return true;
        }

        else {
            return false;
        }
    }


    public static void main(String[] args) {

        WhileLoops loooops = new WhileLoops();
        System.out.println("addOdds method");
        System.out.println(loooops.addOdds(67));
        System.out.println(loooops.addOdds(54));
        System.out.println(loooops.addOdds(102));
        System.out.println("sumDigits method");
        System.out.println(loooops.sumDigits(2025));
        System.out.println(loooops.sumDigits(10298));
        System.out.println(loooops.sumDigits(198));
        System.out.println("howManyYears method");
        System.out.println(loooops.howManyYears(120,150));
        System.out.println(loooops.howManyYears(169,256));
        System.out.println(loooops.howManyYears(776,890));
        System.out.println("printSum method");
        loooops.printSum(36);
        loooops.printSum(79);
        loooops.printSum(99);
        System.out.println("isPerfectSquare method");
        
    }
}