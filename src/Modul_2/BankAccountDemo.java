package Modul_2;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setNo(274);
        account.setNama("Rafli");
        account.cekSaldo(100000);
        System.out.println(account.nama + " with number rekening " + account.no_rekening + ",checking his saldo ammount of " + account.saldo);
        double saving = 50000;
        account.menabung(saving);
        System.out.println(account.nama + " with number rekening " + account.no_rekening +  ",saving an ammount of " + saving + " and right now, his saldo ammount to " + account.saldo);
        double withdraw = 30000;
        account.menarik(withdraw);
        System.out.println(account.nama + " with number rekening " + account.no_rekening +  ",withdraw an ammount of " + withdraw +  " and right now, his saldo ammount to " + account.saldo);
        double transfer = 100000;
        account.transfer(transfer);
        System.out.println(account.nama + " with number rekening " + account.no_rekening +  ",transfer an ammount of " + transfer +  " and right now, his saldo ammount to " + account.saldo);
    }
}
