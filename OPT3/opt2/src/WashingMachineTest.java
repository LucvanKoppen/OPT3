import org.junit.Assert;
import org.junit.Test;

public class WashingMachineTest {

    @Test
    public void testIsWashingMachineValid_Case1() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.0, false, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case2() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.0, false, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case3() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.25, false, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case4() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.25, false, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case5() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.0, true, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case6() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.0, true, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case7() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.25, true, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case8() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.25, true, 1.0);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case9() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.0, false, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case10() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.0, false, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsWashingMachineValid_Case11() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.25, false, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case12() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.25, false, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertTrue(result);
    }

    @Test
    public void testIsWashingMachineValid_Case13() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.0, true, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case14() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.0, true, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case15() {
        WashingMachine washingMachine = new WashingMachine(15.0, 1.25, true, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsWashingMachineValid_Case16() {
        WashingMachine washingMachine = new WashingMachine(25.0, 1.25, true, 1.3);
        boolean result = washingMachine.isValid();
        Assert.assertFalse(result);
    }
}

class WashingMachine {

    private double weight;
    private double height;
    private boolean isNoisy;
    private double width;

    public WashingMachine(double weight, double height, boolean isNoisy, double width) {
        this.weight = weight;
        this.height = height;
        this.isNoisy = isNoisy;
        this.width = width;
    }

    public boolean isValid() {
        if (weight > 20.0 && (height == 1.0 || height == 1.25 || height == 1.5) && !isNoisy && width > 1.25) {
            return true;
        } else {
            return false;
        }
    }
}
