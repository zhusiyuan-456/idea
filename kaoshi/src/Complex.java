public class Complex {
    private double x,y;
    public Complex(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Complex add(Complex q){
        return new Complex(x+q.x,y+q.y);
    }
    public static Complex add(Complex A,Complex B){
        return new Complex(A.x+B.x,A.y+B.y);
    }
    public void print(){
        System.out.println("("+x+","+y+")");
    }
    public String toString(){
        return "("+x+","+y+")";
    }


    public static void main(String[] args) {
        Complex a = new Complex(2.5, 3.1);
        Complex b = new Complex(-3.9, 4.2);
        Complex c = a.add(b); // a regular method
        Complex d = Complex.add(a,b); // use a static function
        d.print(); // write a method print to print out (-1.4,7.3)
        System.out.println(d); // print the same way.
    }
}
