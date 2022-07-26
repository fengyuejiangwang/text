import java.io.BufferedReader;
        import java.io.FileWriter;
        import java.io.InputStreamReader;
        import java.io.PrintStream;
        import java.time.Year;
        import java.util.Scanner;

public class W1298 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int k=1,sq=2*n-1;
       int[][] a=new int[sq][sq];
       while(k<=n){          //一轮一轮的扫描
            for(int i=k-1;i<=sq-k;i++){
                for(int j=k-1;j<=sq-k;j++){
                    a[i][j]=k;
                }
            }
            k++;
        }
        for(int i=0;i<sq;i++){
            for(int j=0;j<sq;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}



