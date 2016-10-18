    package solutions;

import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        boolean flag = true;
        int N = in.readInt();
        int M = in.readInt();
        int arr[] = new int[N];
        ArrayList<Integer> grades = new ArrayList<>();

        int idx = 0;
        for (int i = 1; i <= N; i++)
        {
            int n = in.readInt();
            if (n != 0)
                arr[idx++] = i;
        }

        for (int i = 0; i < M; i++)
        {
            grades.add(in.readInt());
        }

        Collections.sort(grades);

            int zbrit = 0;

            for (int i = 0; i < idx; i++)
            {
                int x = arr[i] - zbrit - 1;
                int sol = Collections.binarySearch(grades, x);
                if (sol >= 0)
                {
                    zbrit += grades.get(sol) + 1;
                    grades.remove(sol);
                } else if (sol < -1)
                {
                    zbrit += grades.get(Math.abs(sol + 2)) + 1;
                    grades.remove(Math.abs(sol + 2));
                }

                if (grades.size() == 0)
                {
                    out.printLine(arr[i]);
                    flag = false;
                    break;
                }
            }

            if (flag)
                out.printLine(-1);

    }
}
