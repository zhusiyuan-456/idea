public class Employee {
    private int id;
    public String name;
    static int company;

    Employee(String aName,int aID){
        id=aID;
        name=aName;
    }
    public int getId() {
        return id;
    }

    public String getName(String a) {
        return name;
    }

   protected  int getCompany() {
        return company;
    }
    public void IncreaseID(int number){

        this.id+=number;
    }
}
