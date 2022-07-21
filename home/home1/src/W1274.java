import java.util.Arrays;
import java.util.Scanner;

public class W1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] chars= st.toCharArray();//将字符串转换为字符串数组
        for(int i=chars.length-1;i>=0;i--) {
            System.out.print(chars[i]);
        }

    }
}
