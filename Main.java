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
    }

    private static int getIndexBinarySearch(int numberToFind, List<Integer> numbers) {
        int start = 0;
        int end = numbers.size() - 1;
        int foundIndex = -1;

        while (start <= end) {
            int midIndex = (start + end) / 2;

            if (numbers.get(midIndex) == numberToFind) {
                foundIndex = midIndex;
                break;
            } else if (numbers.get(midIndex) > numberToFind) {
                end = midIndex - 1;
            } else {
                start = midIndex + 1;
            }
        }

        return foundIndex;
    }
}