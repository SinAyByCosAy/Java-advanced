package tech.codingclub;

public class electricCar extends car {

    private double batteryleft = 100;

    public electricCar(){
        super();
    }

    public electricCar(String numberPlate){
        super(numberPlate);
    }

    public electricCar(String numberPlate, int currentSpeed){
        super(numberPlate, currentSpeed);
    }

    public double batteryPercentageLeft(){
        return batteryleft;
    }

    public void accelerate(){
        super.accelerate();
        batteryleft = batteryleft - 0.5;
    }

    public static void main(String[] args) {

        electricCar tesla = new electricCar("Tesla 001",500);
        tesla.accelerate();
        electricCar.printAboutWheel();

        System.out.println("Tesla speed : "+tesla.getCurrentSpeed()+ " Battery Left = "+tesla.batteryPercentageLeft());
    }
}
