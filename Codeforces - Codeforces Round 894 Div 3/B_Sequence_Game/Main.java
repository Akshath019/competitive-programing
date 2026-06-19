import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] v = new long[n];
            for (int i = 0; i < n; i++)
                v[i] = Long.parseLong(st.nextToken());

            List<Long> res = new ArrayList<>();
            res.add(v[0]);
            for (int i = 1; i < n; i++) {
                if (v[i-1] > v[i]) {
                    res.add(v[i]);
                    res.add(v[i]);
                } else {
                    res.add(v[i]);
                }
            }

            sb.append(res.size()).append('\n');
            for (int i = 0; i < res.size(); i++) {
                if (i > 0) sb.append(' ');
                sb.append(res.get(i));
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}