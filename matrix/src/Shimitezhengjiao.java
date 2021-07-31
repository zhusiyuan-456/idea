
import java.util.Scanner;


class Test {
    public static void main(String[] args) {
        Shimitezhengjiao shimitezhengjiao = new Shimitezhengjiao();
        shimitezhengjiao.on();
    }
}


public class Shimitezhengjiao {

    Shimitezhengjiao() {
    }


    public void on() {
        Scanner sca = new Scanner(System.in);
        while (true) {
            //提示语
            System.out.println("请输入向量组中向量组的个数:");
            int n = sca.nextInt();
            sca.nextLine();
            System.out.println("请输入向量组:");
            //创建两个组向量，阿尔法和贝塔
            XiangLiang[] aErfa = new XiangLiang[n];
            XiangLiang[] beiTa = new XiangLiang[n];
            //输入值
            for (int i = 0; i < n; i++) {
                String t = sca.nextLine();
                aErfa[i] = new XiangLiang(t);
                beiTa[i] = new XiangLiang(t);
            }
            //打印向量组阿尔法
            System.out.println("输入的向量组为:");
            for (int i = 0; i < n; i++) {
                System.out.println("a" + (i + 1) + ":\t" + aErfa[i]);
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    beiTa[i] = beiTa[i].jian(beiTa[j].shuCheng((aErfa[i].shuLiangJi(beiTa[j])).chu(beiTa[j].shuLiangJi(beiTa[j]))));
                }
            }
            //
            System.out.println("\n正交向量组为:");
            for (int i = 0; i < n; i++) {
                System.out.println("b" + (i + 1) + ":\t" + beiTa[i]);
            }
            //是否继续
            System.out.println("\n按1继续，其它键退出");
            String t = sca.nextLine();
            if (!"1".equals(t)) {
                break;
            }
        }
        //
        sca.close();

    }
}


class Fenshi {

    private int fenzi;

    private int fenmu;

    private boolean zhengfu = true;


    public Fenshi(String str) {
        //用'/'分割字符串
        String[] zm = str.split("/");
        //分割后第一个转化成分子
        fenzi = Integer.parseInt(zm[0]);
        //调整正负号
        if (fenzi < 0) {
            fenzi = -fenzi;
            zhengfu = false;
        }
        //如果有第二个，则把第二个转化成分母，如果没有，则分母为1
        fenmu = zm.length == 2 ? Integer.parseInt(zm[1]) : 1;
        //调整正负号
        if (fenmu < 0) {
            fenmu = -fenmu;
            zhengfu = !zhengfu;
        }
        //约分
        yueFen();
    }


    public Fenshi(Fenshi f) {
        //将分子和分母赋值
        fenzi = f.getFenzi();
        fenmu = f.getFenmu();
        //调整正负号
        if (fenzi < 0) {
            fenzi = -fenzi;
            zhengfu = false;
        }
    }


    public Fenshi(int x) {
        //调整正负号，分子赋值分母为1
        if (x < 0) {
            fenzi = -x;
            zhengfu = false;
        } else {
            fenzi = x;
        }
        fenmu = 1;
    }


    private void yueFen() {
        //如果分子为0的话，直接把分母变成1
        if (fenzi == 0) {
            fenmu = 1;
            return;
        }
        //当分子分母都不是1的时候才约分，否则没必要约
        if (!(fenzi == 1 || fenmu == 1)) {
            int t = Tool.gcd(fenzi, fenmu);
            fenzi /= t;
            fenmu /= t;
        }
    }


    @Override
    public String toString() {
        return (zhengfu ? "" : "-") + (fenmu == 1 ? fenzi : fenzi + "/" + fenmu);
    }


    public int getFenzi() {
        return zhengfu ? fenzi : -fenzi;
    }


    public int getFenmu() {
        return fenmu;
    }

    public Fenshi jia(Fenshi x) {
        //分子直接交叉相成在相加，分母是原来两个数的分母相乘
        return new Fenshi((this.getFenzi() * x.getFenmu() + x.getFenzi() * fenmu) + "/" + (fenmu * x.getFenmu()));
    }


    public Fenshi jian(Fenshi x) {
        //分子直接交叉相成在相减，分母是原来两个数的分母相乘
        return new Fenshi((this.getFenzi() * x.getFenmu() - fenmu * x.getFenzi()) + "/" + (fenmu * x.getFenmu()));
    }


    public Fenshi cheng(Fenshi x) {
        //分子相乘，分母相乘
        return new Fenshi((this.getFenzi() * x.getFenzi()) + "/" + (fenmu * x.getFenmu()));
    }


    public Fenshi chu(Fenshi x) {
        //如果除数为0则抛出异常
        if (x.getFenzi() == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        //除就是乘倒数
        return new Fenshi((this.getFenzi() * x.getFenmu()) + "/" + (fenmu * x.getFenzi()));
    }
}


class XiangLiang {
    /**
     * 保存向量值的分式数组
     */
    private final Fenshi[] fenshis;

    /**
     * <p><b>方法名:</b>{@code XiangLiang}
     * <p><b>功能:</b><br>用字符串构造一个向量，字符串格式为 分式 分式 ... 分式 ，分式之间用空格隔开
     *
     * @param str 满足向量格式的字符串
     * @author 60rzvvbj
     * @data 2020/5/25
     */
    public XiangLiang(String str) {
        //用空格分割字符串
        String[] t = str.split(" ");
        //用分割出来的字符串数组对分式数组赋值
        fenshis = new Fenshi[t.length];
        for (int i = 0; i < t.length; i++) {
            fenshis[i] = new Fenshi(t[i]);
        }
    }


    public XiangLiang(Fenshi[] f) {
        //直接复制一份分式数组
        fenshis = new Fenshi[f.length];
        for (int i = 0; i < f.length; i++) {
            fenshis[i] = new Fenshi(f[i]);
        }
    }


    @Override
    public String toString() {
        String str = "(";
        for (int i = 0; i < fenshis.length; i++) {
            str += fenshis[i] + ",";
        }
        str = str.substring(0, str.length() - 1);
        str += ")";
        return str;
    }


    public Fenshi getFenshi(int index) {
        return fenshis[index];
    }


    public Fenshi[] getFenshis() {
        return fenshis;
    }


    public XiangLiang jia(XiangLiang x) {
        //对应分量相加
        Fenshi[] t = new Fenshi[fenshis.length];
        for (int i = 0; i < fenshis.length; i++) {
            t[i] = fenshis[i].jia(x.getFenshi(i));
        }
        return new XiangLiang(t);
    }

    public XiangLiang jian(XiangLiang x) {
        //对应分量相减
        Fenshi[] t = new Fenshi[fenshis.length];
        for (int i = 0; i < fenshis.length; i++) {
            t[i] = fenshis[i].jian(x.getFenshi(i));
        }
        return new XiangLiang(t);
    }


    public XiangLiang shuCheng(Fenshi f) {
        //每个分量都乘f
        Fenshi[] t = new Fenshi[fenshis.length];
        for (int i = 0; i < fenshis.length; i++) {
            t[i] = fenshis[i].cheng(f);
        }
        return new XiangLiang(t);
    }

    public Fenshi shuLiangJi(XiangLiang x) {
        //对应分量相乘在相加
        Fenshi t = new Fenshi(0);
        for (int i = 0; i < fenshis.length; i++) {
            t = t.jia(fenshis[i].cheng(x.getFenshi(i)));
        }
        return t;
    }

}


class Tool {

    public static int gcd(int a, int b) {
        //让a<b
        if (a > b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        //然后遍历a到1
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }
}