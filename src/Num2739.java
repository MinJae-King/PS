import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2739 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int N =  Integer.parseInt(br.readLine());

        for(int i = 1; i <= 9; i++) {

            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }
    }
}