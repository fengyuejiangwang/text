import java.util.Scanner;

public class W1225 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] a=new int[3];
        int tree=0;
        for(int i=0;i<3;i++)
        {
            a[i]=scanner.nextInt();
        }

        for(int j=0;j<2;j++)
            for(int i=0;i<2-j;i++)
                if(a[i]>a[i+1])
                { tree=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tree;

                }
        System.out.printf("%d %d %d\n",a[0],a[1],a[2]);

            System.out.printf("%d %d %d",a[2],a[1],a[0]);


    }
}
