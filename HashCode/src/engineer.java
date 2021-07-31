import java.util.HashMap;

public class engineer {
    public int salary;
    private int tier;
    public String name,location;
    public engineer(int salary,int tier,String name,String location){
        this.salary=salary;
        this.tier=tier;
        this.name=name;
        this.location=location;
    }
    @Override
    public int hashCode(){
        int B=333;
        int hash=0;
        hash=hash*B+salary;
        hash=hash*B+tier;
        hash=hash*+name.hashCode();
        hash=hash*B+location.hashCode();
        return hash;
    }
    @Override
    public boolean equals(Object o){
        if (this==o)
            return true;
        if (o==null)
            return false;
        if (this.getClass()!=o.getClass()){
            return false;
        }
        engineer e=(engineer)o;
        return this.salary==e.salary &&
                this.location==e.location&&
                this.name==e.name &&
                this.tier==e.tier;
    }

    public static void main(String[] args) {
        engineer sde1=new engineer(10,1,"john","CA");
        engineer sde2=new engineer(10,1,"john","CA");
        engineer sde3=sde2;
        HashMap<engineer,Integer> level=new HashMap<>();
        level.put(sde1,1);
        level.put(sde2,2);
        level.put(sde3,1);
        System.out.println(sde1.hashCode());
        System.out.println(sde2.hashCode());
        System.out.println(level.size());
    }
}
