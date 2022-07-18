import java.util.*;

public class W237 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
       int[] arr=new int[a];
       for(int i=0;i<a;i++){
           arr[i]= scanner.nextInt();
       }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int most = 0;
        int result = 0;
        Set<Integer> set = map.keySet();//类似list，存取无序，会去除重复项
        Iterator<Integer> it = set.iterator();//迭代器迭代Set和arraylist
        while(it.hasNext()){
            Integer key = it.next();
            Integer value = map.get(key);
            if(value >=most) {
                most = value;
                result = key;
            }

        }
        System.out.println(result);
    }
}
