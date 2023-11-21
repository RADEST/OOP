package Modul_8;

public class BankPasar extends BankUmum{
    protected void rasioBunga() {
        System.out.println("Rasio Bunga sebesar 25%");
    }

    public static void main(String[] args) {
        BankPasar bankPasar = new BankPasar();
        bankPasar.rasioBunga();
    }
}
