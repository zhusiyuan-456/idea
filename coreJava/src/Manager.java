public class Manager extends Employee {
public Manager(String name,int id){
    super(name,id);
}



    @Override
    public int getCompany(){
        System.out.println("go fuck yourself");
        return 0;
    }

    public static void main(String[] args) {
        Manager boo=new Manager("nima",1);
        boo.IncreaseID(1);
        System.out.println(boo.getId());
        Employee a=new Employee("peter",2);
        boo.getCompany();
        //if(a instanceof Manager) System.out.println("fuck");;
    }
}
