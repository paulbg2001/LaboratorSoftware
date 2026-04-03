package AppLab5.advanced;

public abstract class ACalculator {
    protected Object state;

    public abstract void init();

    public Object result(){
        return state;
    }

    public ACalculator clear(){
        this.init();
        return this;
    }
}
