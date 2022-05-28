import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        list.put("Apple", 20);
        list.put("Orange", 50);
        list.put("Banana", 20);
        list.put("Cherry", 500);
        list.put("Cranberry", 20);
        list.put("Strawberry", 20);
        String olds = " ";
        int counter = 1;
        for (String s: list.keySet().stream().sorted().toList()) {
            if (s.startsWith(String.valueOf(olds.charAt(0)))){
                System.out.println(counter + ". " + s);
                counter++;
            } else {
                olds = s;
            }
        }
        counter = 1;
        int oldNum = 0;
        for (int num: list.values().stream().sorted().toList()) {
            if (oldNum == num){
                System.out.println(counter + ". " + num);
                counter++;
            } else {
                oldNum = num;
            }
        }
    }
}
