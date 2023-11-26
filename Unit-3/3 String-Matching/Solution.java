import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> findAllOccurrences(String pattern, String str) {
        List<Integer> occurrences = new ArrayList<>();
        int index = 0;
        while (true) {
            index = str.indexOf(pattern, index);
            if (index == -1) {
                break;
            }
            occurrences.add(index);
            index += pattern.length();
        }
        return occurrences;
    }

    public static void main(String[] args) {
        String pattern = "abc";
        String str = "abcabcdefabcgaaabc";
        List<Integer> occurrences = findAllOccurrences(pattern, str);

        System.out.println("Occurrences of the pattern '" + pattern + "' in the string '" + str + "':");
        for (int i = 0; i < occurrences.size(); i++) {
            int occurrence = occurrences.get(i);
            System.out.println(occurrence);
        }
    }
}
