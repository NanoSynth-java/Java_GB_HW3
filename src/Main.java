import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1. Пусть дан произвольный список целых чисел, удалить из него чётные числа

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,32,13,40,555,9,72,0,900,101,17,2,14,45,15));
//        System.out.println(numbers);
//        numbers.removeIf(number -> number % 2 == 0);
//        System.out.println(numbers);

        // Задача №2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,33,13,40,55));
        System.out.println(numbers);

        int min = numbers.get(0);
        int max = numbers.get(0);
        float average = 0;
        float lookingForAverage = 0;

        for (Integer number:
                numbers) {
            lookingForAverage += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        average = lookingForAverage / numbers.size();
        System.out.printf("Минимальное число в ArrayList: %d", min);
        System.out.printf("\nМаксимальное число в ArrayList: %d", max);
        System.out.printf("\nСреднее число в ArrayList: %.1f", average);
    }
}