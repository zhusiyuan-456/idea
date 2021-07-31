public class demo {
    public static void main(String[] args) {


    }
}
class Airplane{
    private double fuelamount;
    public Airplane(double fuel){
        fuel=fuelamount;
    }
    public void fly(){
        System.out.printf("flap,flap");
        fuelamount--;
    }
}

class PassengerPlane extends Airplane{
    private double coffee;
    public PassengerPlane(double f, double coffee){
        super(f);
        this.coffee=coffee;
        coffee--;
    }

}