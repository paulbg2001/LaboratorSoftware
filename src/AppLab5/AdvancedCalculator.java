package AppLab5;

import static java.lang.Math.pow;

public class AdvancedCalculator extends IntCalculator{

    public AdvancedCalculator(int state) {
        super(state);
    }

    public AdvancedCalculator divide(int number){
        state /= number;
        return this;
    }

    public AdvancedCalculator power(int number) {
        state = (int) pow(state, number);
        return this;
    }

    public AdvancedCalculator root(int number) {
        state = (int) pow(state, 1.0 / number);
        return this;
    }
}
