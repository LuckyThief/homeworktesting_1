import org.example.CashbackHackService;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCorrectValue_1() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectValue_2() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectValue_3() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectValue_4() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectValue_5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(expected, actual);
    }
}
