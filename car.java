package tech.codingclub;

public class car {

    int maxspeed = 300;
    int currentSpeed = 0;
    String numberPlate;

    public static int wheelCount = 4;

    public car() {

    }

    void accelerate(){
        System.out.println("SPEEDING UP!!! "+ numberPlate);
        currentSpeed+=10;
    }

    public car(String numberPlate){
        this.numberPlate = numberPlate;
    }

    public car(String numberPlate, int currentSpeed){
        this.numberPlate = numberPlate;
        this.currentSpeed = currentSpeed;
    }

    public static void printAboutWheel(){

        System.out.println("Car has : "+wheelCount+" wheels");
    }

    public void increaseSpeed(int i){

        if(i<0) return;

        currentSpeed += i;

        if(currentSpeed>=maxspeed)
            currentSpeed = maxspeed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public static void main(String[] args) {

        car audi = new car("AUDI 007");
        System.out.println("Initial Speed audi : "+audi.currentSpeed);
        audi.accelerate();
        audi.wheelCount = 8;
//        audi.accelerate();
//        audi.accelerate();
        System.out.println("Current Speed audi : "+audi.currentSpeed);

        car BMW = new car("BMW 707",40);
        System.out.println("Initial Speed bmw : "+BMW.currentSpeed);

        BMW.accelerate();
        BMW.currentSpeed += 100;
        System.out.println("Current Speed bmw : "+BMW.currentSpeed);

        System.out.println("Audi wheel count : "+audi.wheelCount);
        System.out.println("BMW wheel count : "+BMW.wheelCount);

//        System.out.println("Car has : "+car.wheelCount+" wheels");
        audi.printAboutWheel();
        BMW.printAboutWheel();
        car.printAboutWheel();

        car.wheelCount = 4;
        System.out.println("Audi wheel count now : "+audi.wheelCount);
        System.out.println("BMW wheel count now : "+BMW.wheelCount);
    }
}
