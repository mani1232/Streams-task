import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> temps = List.of(10, 23, 300, -1, 0, 11, 12, 24, 50, 2, 42, 42, 4, 24);
        for (Integer num: temps.stream().filter(temp -> temp > 10 && temp < 18).toList()) {
            int counter = 0;
            counter++;
            System.out.println(counter + ". " + num);
        }
    }
}
