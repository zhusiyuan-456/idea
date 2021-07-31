public class Student {
    int grade;
    int cls;
    String firstName;
    String LastName;
    public Student(String firstName,String lastName,int cls,int grade){
        this.firstName=firstName;
        this.LastName=lastName;
        this.grade=grade;
        this.cls=cls;
    }
    @Override
    public int hashCode(){
        int B=30;
        int hash=0;
        hash=hash*B+grade;
        hash=hash*B+cls;
        hash=hash*B+firstName.hashCode();
        hash=hash*B+LastName.hashCode();
        return hash;
    }
    @Override
    public boolean equals(Object o){
        if (this==o)
            return true;
        if(o==null)
            return false;
        if (this.getClass()!=o.getClass())
            return false;
        Student s=(Student)o;
        return  this.grade==s.grade &&
                this.cls==s.cls &&
                this.firstName==s.firstName &&
                this.LastName==s.LastName ;

    }

    public static void main(String[] args) {
        Student s=new Student("peter","zhu",12,120);
        System.out.println(s.hashCode());

    }
}
