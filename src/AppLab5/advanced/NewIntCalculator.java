package AppLab5.advanced;

public class NewIntCalculator extends ACalculator {

    @Override
    public void init() {
        state = 0;
    }

    public NewIntCalculator(int number) {
        state = number;
    }

    public NewIntCalculator add(int number){
        state = (Integer) state + number;
        return this;
    }

    public NewIntCalculator subtract(int number){
        state = (Integer) state - number;
        return this;
    }

    public NewIntCalculator multiply(int number){
        state = (Integer) state * number;
        return this;
    }
}
