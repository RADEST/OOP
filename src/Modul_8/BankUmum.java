package Modul_8;

public class BankUmum extends Bank{
    protected void rasioBunga(){
        System.out.println("Rasio Bunga sebesar 20%");
    }

    public static void main(String[] args) {
        BankUmum bankUmum = new BankUmum();
        bankUmum.rasioBunga();
    }
}
