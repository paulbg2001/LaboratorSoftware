package AppLab5;

import AppLab5.advanced.NewDoubleCalculator;
import AppLab5.advanced.NewIntCalculator;

public class AppLab5 {
    public static void main(String[] args) {
       IntCalculator intCalculator = new IntCalculator(2);
       int result = intCalculator.add(20).subtract(5).multiply(2).result();
        System.out.println("a) " + result);

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(4);
        result = advancedCalculator.divide(2).power(3).root(3).result();
        System.out.println("b) " + result);

        NewIntCalculator newIntCalculator = new NewIntCalculator(10);
        result = (Integer) newIntCalculator.add(5).subtract(3).multiply(2).result();
        System.out.println("5.5.2 a) " + result);

        NewDoubleCalculator newDoubleCalculator = new NewDoubleCalculator(10);
        Double result2 = (Double) newDoubleCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("5.5.2 b) " + result2);
    }
}
