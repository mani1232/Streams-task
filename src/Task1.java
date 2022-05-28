import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Nadia", "Kostya", "Sara","Sanya","Andrey","Sasha").filter((s -> s.startsWith("S")));
        stream.forEach(System.out::println);
    }
}
