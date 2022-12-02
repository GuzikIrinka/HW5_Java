import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class hw {

    static String[] sort(String[] str, int n) {
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String>>();

        for (int i = 0; i < n; i++) {

            map.putIfAbsent(str[i].length(),
                    new ArrayList<String>());
            map.get(str[i].length()).add(str[i]);
        }

        int temp = 0;

        for (Entry<Integer, ArrayList<String>> e : map.entrySet()) {

            for (int i = 0; i < e.getValue().size(); i++) {

                str[temp] = e.getValue().get(i);
                temp++;
            }
        }
        return str;
    }

    // печататем отсортированный массив в строку
    static void printArraystring(String str[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }

    public static void main(String args[]) {
        String[] arr = { "If", "you", "can", "dream", "about", "it", "you", "can", "do", "it" };
        int n = arr.length;

        // функция для выполнения сортировки
        arr = sort(arr, n);

        // печать результата
        printArraystring(arr, n);
    }
}
