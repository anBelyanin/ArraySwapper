import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArraySwapper swapper = ArraySwapper.getInstance();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        swapper.swapArray(array, 3);
        System.out.println(Arrays.toString(array));
    }
}
