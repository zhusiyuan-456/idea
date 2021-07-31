public class Elephant extends Animal{
    private double noseLong;
    Elephant(String aName,String gender,int life,double nose){
        super(aName,gender,life);
        noseLong=nose;
    }

    public void hasNose(){
        System.out.println("He has a nose "+noseLong+"long");
    }
    public void move(){
        System.out.println("he moves like an elephant");
    }
}
