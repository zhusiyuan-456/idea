interface Age {
    int x = 23;

    void getAge();
}


public class myClass{
    Age age=new Age() {
        @Override
        public void getAge() {
            System.out.println("this is an anonymous class");
        }
    };
}

