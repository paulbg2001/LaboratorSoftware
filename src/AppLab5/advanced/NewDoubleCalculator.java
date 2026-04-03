package AppLab5.advanced;

public class NewDoubleCalculator extends ACalculator{

   @Override
    public void init() {
        state = 0;
    }

    public NewDoubleCalculator(double number) {
       state = number;
    }

    public NewDoubleCalculator add(double number){
        state = (Double) state + number;
        return this;
    }

    public NewDoubleCalculator subtract(double number){
        state = (Double) state - number;
        return this;
    }

    public NewDoubleCalculator multiply(double number){
        state = (Double) state * number;
        return this;
    }
}
