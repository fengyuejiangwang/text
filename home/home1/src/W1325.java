import java.util.*;

public class W1325 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        int q=sc.nextInt();
        int n = s.length()-q; //向左移几位
        char[] c = s.toCharArray();
        reverse(c,0,n-1);
        reverse(c,n,c.length-1);
        //System.out.println(reverse(c,0,n-1));//翻转前面
        //System.out.println(reverse(c,n,c.length-1));//翻转后面
        System.out.println(reverse(c,0,c.length-1));//翻转整体，如果先整体后分段则是向右位移

    }

    public static char[] reverse(char[] c,int begin,int end){
        char temp;
        while(end>begin){
            temp = c[begin];
            c[begin] = c[end];
            c[end] = temp;
            end--;
            begin++;
        }
        return c;
    }
}
