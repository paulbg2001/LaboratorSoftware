package AppLab5;

public class AppLab5 {
    public static void main(String[] args) {
       IntCalculator intCalculator = new IntCalculator(2);
       int result = intCalculator.add(20).subtract(5).multiply(2).result();
        System.out.println("a) " + result);

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(4);
        result = advancedCalculator.divide(2).power(3).root(3).result();
        System.out.println("b) " + result);
    }
}
