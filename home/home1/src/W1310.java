import java.util.Scanner;

public class W1310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a=input.nextInt();
       int c=factors(a);
        System.out.println(c);
    }
    public static int factors(int a){
        int sum=0,i=0;
        while ( a>=0 && i<10)
        {
            if (a % 13 == 0 || a % 17 == 0)
            {
                sum = sum + a;
                i = i + 1;
            }
            a = a - 1;
        }
        return sum;

    }
    }
