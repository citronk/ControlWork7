import java.util.Arrays;
import java.util.List;

public class Main {
    // Задание 2
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvenNumbers = numbers.stream() // сумма чётных чисел списка
                .filter(number -> number % 2 == 0) // фильтрация, чтобы число было чётное
                .reduce(0, Integer::sum); // суммирование таких чисел
        System.out.println(sumOfEvenNumbers); // 2 + 4 + 6 + 8 + 10 = 30

        int sumOfOddNumbers = numbers.stream() // сумма нечётных чисел списка
                .filter(number -> number % 2 == 1) // фильтрация, чтобы число было нечётное
                .reduce(0, Integer::sum); // суммирование таких чисел
        System.out.println(sumOfOddNumbers); // 1 + 3 + 5 + 7 + 9 = 25
    }
}