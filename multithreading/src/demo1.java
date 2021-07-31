public class demo1 {
    private int day,year;
    public demo1(int day,int year){
        this.year=year;
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public demo1(){}
    public void find(String a){
        String res=" ";
        int count=1,i=1;
        for (int j=0;j<a.length();j++){
            if (i<a.length() && a.charAt(i)==a.charAt(i-1)){
                count++;

            }else {
                res=res+a.charAt(i-1)+count;
                count =1;
            }
            i++;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        (new demo1()).find("aaabbbccccaa");
    }
}
