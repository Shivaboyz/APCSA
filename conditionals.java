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
        if (dayOfWeek < 6 || dayOfWeek > 0) {
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

    public static void main(String[] args){
        conditionals cd = new conditionals();
        System.out.println(cd.chimpTrouble(true, true));
        System.out.println(cd.chimpTrouble(false,false));
        System.out.println(cd.chimpTrouble(true,false));
        System.out.println(cd.chimpTrouble(false,true));
        System.out.println();
        System.out.println(cd.negPos(1,-1,false));
        System.out.println(cd.negPos(-1,1,false));
        System.out.println(cd.negPos(1,1,false));
        System.out.println(cd.negPos(-1,-1,false));
        System.out.println(cd.negPos(-4,-5,true));
        System.out.println(cd.negPos(-4,5,true));
        System.out.println(cd.negPos(4,5,true));
        System.out.println(cd.negPos(4,-5,true));
        System.out.println();
        System.out.println(cd.pickUpPhone(false,false,true));
        System.out.println(cd.pickUpPhone(true, true, true));
        System.out.println(cd.pickUpPhone(true, true, false));
        System.out.println(cd.pickUpPhone(false, true, false));
        System.out.println(cd.pickUpPhone(true, false, false));
        System.out.println(cd.pickUpPhone(false, false, false));
        System.out.println();
        System.out.println(cd.setAlarm(1, false));
        System.out.println(cd.setAlarm(5, false));
        System.out.println(cd.setAlarm(0, false));
        System.out.println(cd.setAlarm(2, true));
        System.out.println(cd.setAlarm(4, true));
        System.out.println(cd.setAlarm(6, true));

    }

}