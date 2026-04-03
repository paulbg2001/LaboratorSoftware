package AppLab5;

public class IntCalculator {
    protected int state;

    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int number){
         state += number;
         return this;
    }

    public IntCalculator subtract(int number){
        state -= number;
        return this;
    }

    public IntCalculator multiply(int number){
        state *= number;
        return this;
    }

    public int result(){
        return state;
    }

    public void clear(){
        state = 0;
    }
}
