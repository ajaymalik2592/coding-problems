package on2016_10.on2016_10_18_Codeforces_Round__377__Div__2_.A___Buy_a_Shovel;



import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int K = in.readInt();
        int R = in.readInt();
        for (int i = 1; i <= 1000; i++)
        {
            if (((i*K - R)/ 10) *10 == (i*K - R) || ((i*K)/ 10) * 10 ==  (i*K) )
            {
                out.print(i);
                break;
            }
        }
    }
}
