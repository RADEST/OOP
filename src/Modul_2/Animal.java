package Modul_2;

public class Animal {
    String name;
    int leg;
    String food;
    String type;

    void setName(String newName){
        name = newName;
        System.out.println("Modul_2.Animal Name : " + name);
    }

    void setLeg(int legAnimal){
        leg = legAnimal;
        System.out.println("Number of Feet : " + leg);
    }

    void setFood(String newFood){
        food = newFood;
        System.out.println("Food : " + food);
    }

    void setType(String typeAnimal){
        type = typeAnimal;
        System.out.println("Modul_2.Animal Type : " + type +"\n");
    }
}