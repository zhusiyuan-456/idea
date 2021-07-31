import java.util.HashMap;

public class WaterMelon {
    public int price;
    public String color;

    public WaterMelon(int price, String color) {
        this.color = color;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int B = 5201314;
        int hash = 0;
        hash = hash * B + price;
        hash = hash * B + color.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
       WaterMelon waterMelon=(WaterMelon)o;
       return this.price==waterMelon.price;
    }

    public static void main(String[] args) {
        WaterMelon waterMelon1 = new WaterMelon(10, "green");
        WaterMelon waterMelon2 = new WaterMelon(10, "green");
        WaterMelon waterMelon3 = new WaterMelon(10, "green");
        WaterMelon waterMelon4 = new WaterMelon(10, "green");
        HashMap<WaterMelon, Integer> watermelon = new HashMap<>();
        watermelon.put(waterMelon1, 1);
        watermelon.put(waterMelon2, 2);
        watermelon.put(waterMelon3, 3);
        watermelon.put(waterMelon4, 4);
        System.out.println(watermelon.size());
    }

}
