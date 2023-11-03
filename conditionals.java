public class conditionals {


    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }


    public boolean negPos(int num1, int num2, boolean neg){
        if (neg == true) {
            return (num1 < 0 && num2 < 0);
        }

        else {
            return (num1*num2 < 0);
        }

    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        }

        if (isMom == true) {
            return true;
        }

        return isMorning != true;
    }

    public String setAlarm(int dayOfWeek, boolean onVacation){
        if (onVacation == false && (dayOfWeek > 0 && dayOfWeek < 6)) {
            String s = "7:00";
            return s;
        }

        if (onVacation == true && (dayOfWeek == 6 || dayOfWeek == 0)) {
            String s = "off";
            return s;
        }

        else {
            String s = "10:00";
            return s;
        }
    }

    public boolean onesDigitSame(int a, int b, int c) {
        if (((a%10) == (b%10)) || ((b%10) == (c%10)) || ((c%10) == (a%10))) {
            return true;
        }
        else {
            return false;
        }

    }

    public int blackJack(int num1, int num2) {
        if (Math.abs(21-num1) > Math.abs(21-num2)) {
            return num2;
        }

        if (Math.abs(21-num1) < Math.abs(21-num2)) {
            return num1;
        }

        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        conditionals cd = new conditionals();
        System.out.println("chimpTrouble() Method");
        System.out.println(cd.chimpTrouble(true, true));
        System.out.println(cd.chimpTrouble(false,false));
        System.out.println(cd.chimpTrouble(true,false));
        System.out.println(cd.chimpTrouble(false,true));
        System.out.println("negPos() Method");
        System.out.println(cd.negPos(1,-1,false));
        System.out.println(cd.negPos(-1,1,false));
        System.out.println(cd.negPos(1,1,false));
        System.out.println(cd.negPos(-1,-1,false));
        System.out.println(cd.negPos(-4,-5,true));
        System.out.println(cd.negPos(-4,5,true));
        System.out.println(cd.negPos(4,5,true));
        System.out.println(cd.negPos(4,-5,true));
        System.out.println("pickUpPhone() Method");
        System.out.println(cd.pickUpPhone(false,false,true));
        System.out.println(cd.pickUpPhone(true, true, true));
        System.out.println(cd.pickUpPhone(true, true, false));
        System.out.println(cd.pickUpPhone(false, true, false));
        System.out.println(cd.pickUpPhone(true, false, false));
        System.out.println(cd.pickUpPhone(false, false, false));
        System.out.println("setAlarm() Method");
        System.out.println(cd.setAlarm(1, false));
        System.out.println(cd.setAlarm(5, false));
        System.out.println(cd.setAlarm(0, false));
        System.out.println(cd.setAlarm(2, true));
        System.out.println(cd.setAlarm(4, true));
        System.out.println(cd.setAlarm(6, true));
        System.out.println("onesDigitSame() Method");
        System.out.println(cd.onesDigitSame(23,19,13));
        System.out.println(cd.onesDigitSame(23,19,12));
        System.out.println(cd.onesDigitSame(23,19,3));
        System.out.println(cd.onesDigitSame(423,13,3));
        System.out.println(cd.onesDigitSame(23,29,25));
        System.out.println("blackjack() method");
        System.out.println(cd.blackJack(19,21));
        System.out.println(cd.blackJack(21,19));
        System.out.println(cd.blackJack(19,22));
        System.out.println(cd.blackJack(8,8));
        System.out.println(cd.blackJack(25,24));
        System.out.println(cd.blackJack(17,9));
        System.out.println(cd.blackJack(12,18));

    }

}