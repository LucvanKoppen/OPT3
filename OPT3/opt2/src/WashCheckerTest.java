//import org.junit.Assert;
//import org.junit.Test;
//
//public class WashCheckerTest {
//
//    @Test
//    public void testIsWashValid_ValidWash() {
//        boolean result = WashingMachineChecker.isWashingMachineValid(4, true, 15);
//        Assert.assertTrue(result);
//    }
//
//    @Test
//    public void testIsWashValid_InvalidDuration() {
//        boolean result = WashingMachineChecker.isWashingMachineValid(6, true, 10);
//        Assert.assertFalse(result);
//    }
//
//    @Test
//    public void testIsWashValid_NotPaid() {
//        boolean result = WashingMachineChecker.isWashingMachineValid(3, false, 12);
//        Assert.assertFalse(result);
//    }
//
//    @Test
//    public void testIsWashValid_After6PM() {
//        boolean result = WashingMachineChecker.isWashingMachineValid(5, true, 18);
//        Assert.assertFalse(result);
//    }
//}