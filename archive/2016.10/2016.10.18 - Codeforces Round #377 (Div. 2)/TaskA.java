package solutions;

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
