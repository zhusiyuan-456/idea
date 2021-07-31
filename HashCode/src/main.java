public class main {
    public static void main(String[] args) {
        int a=42;
        System.out.println(((Integer)a).hashCode());
        double b=3.14159;
        System.out.println(((Double)b).hashCode());
        String c="Iris";
        System.out.println(c.hashCode());
    }
}
