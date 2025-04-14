package OOPS_BY_KUNAL.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerates");
    }
}
