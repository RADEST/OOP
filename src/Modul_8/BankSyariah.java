package Modul_8;

public class BankSyariah extends BankUmum{
    protected void rasioBunga() {
        System.out.println("Rasio Bunga sebesar 0%");
    }

    public static void main(String[] args) {
        BankSyariah bankSyariah = new BankSyariah();
        bankSyariah.rasioBunga();
    }
}
