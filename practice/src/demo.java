interface C{
    public void f();
}
class D implements C{
    @Override
    public void f() {
        System.out.println(333);
    }
}
abstract  class E implements C{
//    @Override
//    public void f() {
//        System.out.println(777);
//    }
}
class W extends E{
    @Override
    public void f() {
        System.out.printf("nima");
    }
}
public class demo{
    public static void main(String[] args) {
        D d=new D();
        d.f();
        W w=new W();
        w.f();

    }
}