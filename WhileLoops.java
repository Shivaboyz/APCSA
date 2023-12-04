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
        while ((num/tensnum) > 0) {
            sum += ((num%tensnum)/(tensnum/10));
            tensnum *= 10;
        }
        return sum;
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



    }
}