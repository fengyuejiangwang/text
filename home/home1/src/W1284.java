import java.util.Scanner;

public class W1284 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k);
            for(int p=i-1;p>0;p--)
                System.out.print(p);
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k);
            for(int p=i-1;p>0;p--)
                System.out.print(p);
            System.out.println();
        }
    }
}
