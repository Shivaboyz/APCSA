public class ForLoops {

    public int addEvens(int n) {
        int sum = 0;
        for(int i = 2; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }

    public void printSquaresBack(int n) {
        for(int i = n; i > 1; i--) {
            System.out.print(((int)Math.pow(i,2)) + ", ");
        }
        System.out.println(1);
    }

    public void sillyNumbers(){
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<10; j++) {
                for(int k = 0; k<3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void sillyNumbers2(){
        for(int i = 4; i>0; i--) {
            for(int j = 9; j>0; j--) {
                for(int k = 0; k<9; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void dollarsAndStars() {
        
    }

    public static void main(String[] args) {
        ForLoops fl = new ForLoops();
        System.out.println("addEvens method");
        fl.addEvens(815);
        fl.addEvens(8561);
        fl.addEvens(745);
        System.out.println("printSquaresBack method");
        fl.printSquaresBack(8);
        fl.printSquaresBack(10);
        fl.printSquaresBack(5);
        System.out.println("sillyNumbers method");
        fl.sillyNumbers();
        System.out.println("sillyNumbers2 method");
        fl.sillyNumbers2();
        System.out.println("dollarsAndStars Method");
        fl.dollarsAndStars();



    }

}

