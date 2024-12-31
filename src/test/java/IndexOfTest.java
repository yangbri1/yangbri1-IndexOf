
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IndexOfTest {
    public static IndexOf io;
    @BeforeClass
    public static void setUp(){
        io = new IndexOf();
    }

    /**
     * in an int array {0, 1, 2, 7, 4}, the value 7 should be at position 3.
     */
    @Test
    public void indexTest1(){
        int[] input = {0, 1, 2, 7, 4};
        int target = 7;
        int expected = 3;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }
    /**
     * in an int array {9, 5, 8, 7, 1}, the value 9 should be at position 0.
     */
    @Test
    public void indexTest2(){
        int[] input = {9, 5, 8, 7, 1};
        int target = 9;
        int expected = 0;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }
    /**
     * in an int array {9, 5, 8, 7, 1}, the value 3 does not exist, so getIndex should return -1.
     */
    @Test
    public void indexTest3(){
        int[] input = {9, 5, 8, 7, 1};
        int target = 3;
        int expected = -1;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }
}
