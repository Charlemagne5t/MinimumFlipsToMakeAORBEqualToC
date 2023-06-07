import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minFlipsTest1() {
        int a = 2;
        int b = 6;
        int c = 5;
        int output = 3;
        Assert.assertEquals(output, new Solution().minFlips(a, b, c));
    }

    @Test
    public void minFlipsTest2() {
        int a = 4;
        int b = 2;
        int c = 7;
        int output = 1;
        Assert.assertEquals(output, new Solution().minFlips(a, b, c));
    }

    @Test
    public void minFlipsTest3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int output = 0;
        Assert.assertEquals(output, new Solution().minFlips(a, b, c));
    }
}
