package solutions;

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
