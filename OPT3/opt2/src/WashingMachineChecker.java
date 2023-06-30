public class WashingMachineChecker {

    public static boolean isWashingMachineValid(double weight, double height, boolean isNoisy, double width) {
        if (weight > 20.0 && (height == 1.0 || height == 1.25 || height == 1.5) && !isNoisy && width > 1.25) {
            return true;
        } else {
            return false;
        }
    }
}

