import java.util.Scanner;

public class W1283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[a];
        int[] brr=new int[b];
        for(int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i< brr.length;i++)
            brr[i]=sc.nextInt();
 int c=getStringMatch(arr,brr);
                 if(c==-1)
                     System.out.println("No Answer");
                 else
                     System.out.println(c);
    }


        public static int getStringMatch(int[] N, int[] M) {
            int n = N.length;          //文本串的长度
            int m = M.length;          //模式串的长度
            for (int i = 0; i <= n - m; i++) {       //最后一轮子串匹配的起始位置是n-m，如果大于n-m一定不会出现匹配子串
                int j = 0;
                while (j < m && M[j] == N[i + j])
                    j = j + 1;
                if (j == m)
                    return i;
            }
            return -1;
        }

}
