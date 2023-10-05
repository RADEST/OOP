public class Car {
int cadence;
int gear;
int up;

void changeCadence(int cadenceCar){
    cadence = cadenceCar;
}

void speedUp(int upCar){
    up = upCar;
}

void changeGear(int gearCar){
    gear = gearCar;
}

void printInfo(){
    System.out.println(
            "Cadence car : " + cadence + "\n"
            + "Speed car : " + up + "\n"
            + "Car's gear : " + gear + "\n");
}
}
