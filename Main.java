public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 8, 9, 11};
        System.out.println(getIndexBinarySearch(5, numbers));
    }

    private static int getIndexBinarySearch(int numberToFind, int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        int foundIndex = -1;

        while (start <= end) {
            int midIndex = (start + end) / 2;

            if (numbers[midIndex] == numberToFind) {
                foundIndex = midIndex;
                break;
            } else if (numbers[midIndex] > numberToFind) {
                end = midIndex - 1;
            } else {
                start = midIndex + 1;
            }
        }

        return foundIndex;
    }
}