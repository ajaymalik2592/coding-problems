package on2016_10.on2016_10_18_Codeforces_Round__377__Div__2_.B___Cormen___The_Best_Friend_Of_a_Man;



import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int N = in.readInt();
        int K = in.readInt();
        int []arr = new int [N];

        for (int i = 0; i < N; i++)
        {
            arr[i]=in.readInt();
        }
        int above = 0;

        for (int i = 1; i < N; i++)
        {
            int val = K - (arr[i] + arr[i-1]);
            if (!(val <=0))
            {
                arr[i] =  arr[i] +  val;
                above += val;
            }
        }


        out.printLine(above);
        out.printLine(Arrays.stream(arr).mapToObj(String::valueOf).reduce((a, b) -> a +" " + b ).get());



    }
}
