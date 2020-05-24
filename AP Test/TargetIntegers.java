public class TargetIntegers {
    
    
    
    public static int getInt() {
        return 1;
    }
    
    public static boolean isTarget(int x) {
        return runSimulations();
    }
    
    public static boolean runSimulations(int sampleSize) {
        int positiveCounterFirstHalf = 0;
        for (int i = 0; i < sampleSize / 2; i++) {
            int intToTest = getInt();
            if (isTarget(intToTest)) {
                if (intToTest > 0) {
                    positiveCounterFirstHalf++;
                }
            } else {
                i--;
            }
        }
        int positiveCounterSecondHalf = 0;
        for (int i = 0; i < sampleSize / 2; i++) {
            int intToTest = getInt();
            if (isTarget(intToTest)) {
                if (intToTest > 0) {
                    positiveCounterSecondHalf++;
                }
            } else {
                i--;
            }
        }
        return positiveCounterFirstHalf > positiveCounterSecondHalf;
    }
}
