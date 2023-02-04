import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testArrayElementsSwappingWithNormalCounter() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        final int counterToSwap = 3;
        final Integer[] resultArray = {4, 5, 6, 7, 8, 1, 2, 3};
        ArraySwapper swapper = ArraySwapper.getInstance();
        swapper.swapArray(array, counterToSwap);
        Assert.assertArrayEquals(resultArray, array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArraySwappingWithIllegalCounter() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        final int counterToSwap = array.length + 1;
        ArraySwapper swapper = ArraySwapper.getInstance();
        swapper.swapArray(array, counterToSwap);
    }
}
