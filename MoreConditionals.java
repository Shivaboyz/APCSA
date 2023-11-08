public class MoreConditionals {

    public boolean isLeapYear(int year) {
        if (((year%4) == 0) && (((year%400) == 0) || ((year%100) != 0))) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 < year2) {
            return true;
        }

        if ((year1 == year2) && (month1 < month2)) {
            return true;
        }

        if ((year1 == year2) && (month1 == month2) && (day1 < day2)) {
            return true;
        }

        else {
            return false;
        }
    }

    public int findBestFit(int space, int size1, int size2) {

    }

    public static void main(String[] args) {
        MoreConditionals mc = new MoreConditionals();
        // leap year
        System.out.println("isLeapYear");
        System.out.println("2000 " + mc.isLeapYear(2000));
        System.out.println("2004 " + mc.isLeapYear(2004));
        System.out.println("2003 " + mc.isLeapYear(2003));
        System.out.println("2100 " + mc.isLeapYear(2100));
        // is sooner
        System.out.println("isSooner");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + mc.isSooner(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + mc.isSooner(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + mc.isSooner(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + mc.isSooner(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + mc.isSooner(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + mc.isSooner(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + mc.isSooner(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + mc.isSooner(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + mc.isSooner(4,8,2010, 1,2,2010));
        // find best fit
        System.out.println("findBestFit");
        



    }
}