package Modul_2;

public class BankAccount {
    double saldo = 0.00;
    int no_rekening;
    String nama;

    public void cekSaldo(double saldo){
        this.saldo = saldo;
    }
    public void menabung(double saldo) {
        this.saldo += saldo;
    }
    public void menarik(double saldo) {
        this.saldo -= saldo;
    }


    public void transfer(double saldo){
        this.saldo -= saldo;
    }
    public int setNo(int no){return this.no_rekening = no;}
    public String setNama(String nama){return this.nama = nama;}
}
