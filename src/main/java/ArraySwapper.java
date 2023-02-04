public class ArraySwapper {

    private static ArraySwapper instance;

    private ArraySwapper(){}

    public static ArraySwapper getInstance() {
        if (instance == null) {
            instance = new ArraySwapper();
        }
        return instance;
    }

    // Method has unit tests in test directory
    public Object[] swapArray(Object[] array, int countToSwap) {
        validateSwapping(array, countToSwap);
        for (int i = 0; i < countToSwap; i++) {
            replaceFirstElementToEnd(array);
        }
        return array;
    }

    private Object[] replaceFirstElementToEnd(Object[] array) {
        for (int i = 1; i < array.length; i++) {
            Object temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // Method for additional validation
    private void validateSwapping(Object[] array, int countToSwap) {
        if (countToSwap > array.length) {
            throw new IllegalArgumentException(String.format("Number of elements to swap should be smaller than array length.\n" +
                    "Array length = %d; Counter to swap = %d", array.length, countToSwap));
        }
    }
}
