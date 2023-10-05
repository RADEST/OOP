public class AnimalDemo {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        Animal buffalo = new Animal();
        tiger.setName("Tiger");
        tiger.setLeg(4);
        tiger.setFood("Raw Meat");
        tiger.setType("Carnivore");
        buffalo.setName("Buffalo");
        buffalo.setLeg(4);
        buffalo.setFood("Grass");
        buffalo.setType("Herbivore");
    }
}