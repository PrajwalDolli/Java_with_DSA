package OOPS_BY_KUNAL.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

//        car.acc();
//        car.start();
//        car.stop();

//        Media carMedia=new Car();
//        carMedia.stop();
        //op:I stop engine like a normal Car
        //so now we create separate class

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngine(); // Missing Argument
        car.start();
    }
}
