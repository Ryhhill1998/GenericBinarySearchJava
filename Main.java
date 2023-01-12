import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(11);
        System.out.println(getIndexBinarySearch(6, numbers));
        System.out.println();

        ArrayList<Character> letters = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            letters.add(i);
        }
        System.out.println(getIndexBinarySearch('p', letters));
    }

    private static <E extends Comparable<? super E>> int getIndexBinarySearch(E elementToFind, List<E> numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        int foundIndex = -1;

        while (start <= end) {
            int midIndex = (start + end) / 2;
            int comparison = numbers.get(midIndex).compareTo(elementToFind);

            if (comparison == 0) {
                foundIndex = midIndex;
                break;
            } else if (comparison > 0) {
                end = midIndex - 1;
            } else {
                start = midIndex + 1;
            }
        }

        return foundIndex;
    }
}