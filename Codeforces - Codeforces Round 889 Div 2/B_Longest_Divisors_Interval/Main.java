import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());

            int i = 1;
            while (n % i == 0) {
                i++;
            }

            sb.append(i - 1).append('\n');
        }

        System.out.print(sb.toString());
    }
}