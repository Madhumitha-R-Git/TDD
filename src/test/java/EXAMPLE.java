
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class EXAMPLE {
    @Test
    void sumoftwoposnumcheck()
    {
        Numcheck obj = new Numcheck(2,4);
        int currval = obj.sum();
        int expectedval = 6;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void sumoftwonegnumcheck()
    {
        Numcheck obj = new Numcheck(-2,-5);
        int currval = obj.sum();
        int expectedval = -7;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void diffoftwoposnumcheck()
    {
        Numcheck obj = new Numcheck(9,4);
        int currval = obj.diff();
        int expectedval = 5;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void diffoftwonegnumcheck()
    {
        Numcheck obj = new Numcheck(-4,-6);
        int currval = obj.diff();
        int expectedval = 2;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void muloftwoposnumcheck()
    {
        Numcheck obj = new Numcheck(3,7);
        int currval = obj.prod();
        int expectedval = 21;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void muloftwonegnumcheck()
    {
        Numcheck obj = new Numcheck(-4,-6);
        int currval = obj.prod();
        int expectedval = 24;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void mulofoneposandonenegnum()
    {
        Numcheck obj = new Numcheck(4,-6);
        int currval = obj.prod();
        int expectedval = -24;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void divoftwoposnumcheck()
    {
        Numcheck obj = new Numcheck(4,2);
        int currval = obj.div();
        int expectedval = 2;
        Assert.assertEquals(expectedval,currval);
    }
    @Test
    void divoftwonegnumcheck()
    {
        Numcheck obj = new Numcheck(-6,-3);
        int currval = obj.div();
        int expectedval = 2;
        Assert.assertEquals(expectedval,currval);
    }

}
