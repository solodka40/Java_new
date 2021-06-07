import java.io.IOException;
import java.util.*;
import java.io.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        //Читаем из файла
        File file = new File("words");
        Scanner in = new Scanner(file);
        String string = in.nextLine();
        //Делим строковый файл на слова, разделенные пробелом
        String[] words = string.split(" ");
        //Считаем, сколько раз каждое слово встречается в файле.
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        // Выводим статистику на консоль
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));

        }
        //Находим наиболее часто встречающееся слово
        int maxValue = Integer.MIN_VALUE;
        for (int value : wordToCount.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
            //Выводим на консоль это слово и число его повторений
        }
        for (String word : wordToCount.keySet()) {
            if (wordToCount.get(word) == maxValue)
                System.out.println("Наиболее часто повторяющееся слово: '" + word + "'. Число повторений: " + wordToCount.get(word));

        }
        //Выведем на экран слова в отсортированном порядке
        System.out.println(" ");
        System.out.println("Слова в алфавитном порядке:");
        SortedSet<String> set = new TreeSet<String>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        for (Object element : set) {
            System.out.println(element.toString());
        }
    }
}
















