import java.util.Arrays;
import java.util.Comparator;

//运用了Array.sort 以及重写比较器compare

//把数组排成最小的数
public class PrintMinNumber_45 {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) return "";
        int len = numbers.length;
        String[] str = new String[len];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });
        for(int i = 0; i < len; i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    int [] num = {3, 32, 321};
    String string = "";
    string = PrintMinNumber(num);
        System.out.println(string);
    }
}
