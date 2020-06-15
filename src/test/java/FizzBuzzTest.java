import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizz;
    @Before
    public void setUp(){
        fizz = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        int number = 1;
        String returnVal = fizz.play(number);
        Assert.assertEquals("1", returnVal);
    }

    @Test
    public void testFizz(){
        int number = 3;
        String returnVal = fizz.play(number);
        Assert.assertEquals("Fizz", returnVal);
    }

    @Test
    public  void testFizzDivisibleby3(){
        int number = 9;
        String returnVal = fizz.play(number);
        Assert.assertEquals("Fizz", returnVal);
    }

    @Test
    public void testBuzz(){
        int number = 5;
        String returnVal = fizz.play(number);
        Assert.assertEquals("Buzz", returnVal);
    }

    @Test
    public void testBuzzDivisibleby5(){
        int number = 20;
        String returnVal = fizz.play(number);
        Assert.assertEquals("Buzz", returnVal);
    }

}
