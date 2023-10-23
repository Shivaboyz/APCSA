public class Cylinder{

private Circle base;
private double height;

public Cylinder (double radius, double height){

    this.base = new Circle(radius);
    this.height = height;
}


public double vol(){

    return base.Area() * height;

}



public double sa(){

    return (height * base.circumf()) + (2 * base.Area());
}

}