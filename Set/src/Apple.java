import java.util.*;


class MyCode {
    /**
     * 1. Question: Why the amap size is 3? Instead of 4 even though we called put() method 3 times
     *    Answer:Because only new three objects that  means they have 3 different memory address,the 
     jvm defaul hashCode() compute them with their address,so a2=a don't allocate new address.
     *
     * 2. Fixed the code(Apple class) to let the map treat the apples with the same color as the same key. So the amap size will be 1. Output should be "map size is 1"
     * * DO NOT Change the main method
     */
    public static void main(String[] args){
        Apple a = new Apple("red", 10);
        Apple a1 = new Apple("red", 10);
        Apple a2 = a;
        Apple a3 = new Apple("red", 20);

        Map<Apple, String> amap = new HashMap<>();
        amap.put(a,"one apple");
        amap.put(a1,"two apples");
        amap.put(a2,"three apples");
        amap.put(a3,"four apples");

        System.out.printf("map size is %s \n", amap.size());
    }
}


class Apple {
    private int price;
    private String color;

    public Apple(String color,int price) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }
    @Override
    public int hashCode(){
        int B=32;
        int hash=0;
        hash=hash*B+color.hashCode();
        hash=hash*B+price;
        return hash;
    }
    @Override
    public boolean equals(Object apple) {
        Apple a = (Apple) apple;
        if (this == a)
            return true;
        if (a == null)
            return false;
        if (this.getClass() != a.getClass())
            return false;
        return this.color.equals(a.color);

    }
}