public class Animal {
    private String name;
    private String gender;
    public int life;
    Animal(String name,String gender, int life){
        this.name=name;
        this.gender=gender;
        this.life=life;
    }
    public void move(){
        System.out.println("Animals can move");
    }
    protected void LifeLong(){
        if(life>0)
            life--;
       if(life<=0) System.out.println("Now it is dead");
    }
}
