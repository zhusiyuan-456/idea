import java.math.*;
public class reverse_solution {
    public int reverse(int sb){
        int dig=1;
        for (int i=0;sb/10!=0;i++)
            dig++;
        int after=0;
        for (int i=0;i<dig;i++)
            after +=sb/(int)Math.pow(10,dig-1)*10^dig;
    }
}
