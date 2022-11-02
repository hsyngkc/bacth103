package Class;

public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Methodlar
    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;

    }

    void increaseSpeed(int increment) {
        this.speed += increment;

    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {

            this.speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println(model + " Hız "+ speed);
    }
    void printInfo (){
        System.out.println("model\t:"+ this.model);
        System.out.println("color\t:" + this.color);
        System.out.println("type\t:" + this.type);
        System.out.println("speed\t:" + this.speed);
    }
}

