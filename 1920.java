import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int [N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int [] B = new int[M];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(st1.nextToken());
        }
        for(int i = 0; i < N; i++){
            int cnt = 0;
            for(int j = 0; j < M; j++){
                if(A[j] == B[i]){
                    cnt++;

                }
            }System.out.println(cnt);

        }


    }

}
