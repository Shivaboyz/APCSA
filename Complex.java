public class Complex {
    private double numr; 
    private double numcomp; 

    public Complex(double a, double b) {
        numr = a; 
        numcomp = b; 
    }

    public Complex(double a) {
        this(a,0.0);
    }

    public double abs() {
        double fin = 0.0;
        fin += Math.pow(numr, 2);
        fin += Math.pow(numcomp, 2);
        fin += Math.sqrt(fin);
        return fin;
    }

    public Complex add(Complex other) {
        Complex fin = new Complex((this.numr+other.numr), (this.numcomp+other.numcomp));
        return fin;
    }

    public String toString() {
        String fin = new String();
        fin += numr;
        fin += " + ";
        fin += numcomp;
        fin += "i";
        return fin;
    }

    public Complex multiply(Complex other) {
        double numa = 0.0;
        double numb = 0.0;
        numa = (this.numr*other.numr);
        numb = (this.numcomp*other.numcomp);
        Complex fin = new Complex(numa, numb);
        return fin; 
    }

    public Complex add(double aadd) {
        double numa = 0;
        numa += aadd;
        numa += numr;
        Complex fin = new Complex(numa, numcomp);
        return fin;
    }

    public Complex multiply(double multa) {
        double numa = 0;
        numa += numr;
        numa *= multa;
        Complex fin = new Complex(numa, numcomp);
        return fin;
    }

    public static void main(String[] args) {
        Complex com = new Complex(4.3, 5.3);
        Complex com2 = new Complex(5.5, 6.24);
        System.out.println(com.abs());
        System.out.println(com2.abs());
        System.out.println(com.add(com2));
        System.out.println(com.toString());
        System.out.println(com2.toString());
        System.out.println(com.multiply(com2));


    }

}