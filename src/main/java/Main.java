import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3"));
        Function a = w -> {
            for (int i = 0; i < w.size(); i++) {
                w.set(i, new StringBuilder(w.get(i)).reverse().toString());
            }
            return w;
        };
        System.out.println(a.mirrorStrings(strings));
    }
}