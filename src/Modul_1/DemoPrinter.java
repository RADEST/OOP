package Modul_1;

public class DemoPrinter {
    public static void main(String[] args) {
        Printer maboy = new Printer();
        maboy.setColor("White");
        System.out.println("Your printer color is " + maboy.getColor());
        maboy.setTimeOfUse(3.0);
        System.out.println("It has been used for " + maboy.getTimeOfUse() + " months");
        maboy.setTimeOfUse(200.0);
        System.out.println("The price is around " + maboy.getTimeOfUse()+" dollars");
        Printer maboy2 = new Printer(200.0);
        System.out.println("but now selling price is " + maboy2.usage_month + " dollars");
        System.out.println("BUILD SUCCESSFUL (total time: 0 seconds)");
    }
}
