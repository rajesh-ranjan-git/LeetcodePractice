import java.util.ArrayList;
import java.util.List;

public class FizzBizz_412 {
    public static void main(String[] args) {
        String arr[] = fizzBuzz(15);
        printArray(arr);

        List<String> list = fizzBuzz2(15);
        for (String fruit : list) {
            System.out.print(fruit + ", ");
        }
    }

    static void printArray(String arr[]) {
        System.out.print("arr : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }
    
    public static String[] fizzBuzz(int n) {
        String str[] = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                str[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                str[i - 1] = "Buzz";
            } else {
                str[i - 1] = "" + i;
            }
        }

        return str;
    }
    
    public static List<String> fizzBuzz2(int n) {
        List<String> list=new ArrayList<String>();  
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add("" + i);
            }
        }

        return list;
    }
}
