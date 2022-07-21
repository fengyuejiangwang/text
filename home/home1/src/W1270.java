import java.util.Scanner;
import java.math.*;
public class W1270 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
  int a=scanner.nextInt();
        if(check(a)==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static int check(int a){
        int[] arr=new int[10];		//相当于数组中的元素全标记为False
        for(int i=0;i<10;i++)
        {
            arr[i]=0;
        }
        int index;		//用于存放下标
        while (a > 0)
        {
            index = a% 10;		//取模作为下标值
            if (arr[index]==1)		//下标index对应的元素被访问过
                return 0;
            arr[index] = 1;		//下标index对应的元素未被访问过，标记为访问
            a/= 10;
        }
        return 1;

    }
}

