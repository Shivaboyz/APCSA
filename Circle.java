public class Circle {

    private double radius;

    public Circle(double radius){

        double rad = radius; 

    }
    


    public double get Area(){

        return Math.PI * Math.pow(radius, 2);

    }


    public double getCircumference(){

        return 2*Math.PI*radius;

    }
}

