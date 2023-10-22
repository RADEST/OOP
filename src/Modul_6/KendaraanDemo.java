package Modul_6;

public class KendaraanDemo{
    public static void main(String[] args) {
        System.out.println("Mobil Description");
        Mobil mobil = new Mobil();
        System.out.println("Jumlah pintu " + mobil.pintu);
        System.out.println("Jumlah roda " + mobil.roda);
        System.out.println("Jenis warnanya = " + mobil.warna);
        System.out.println("Jenis bahan bakarnya = " + mobil.bahanBakar);
        System.out.println("\nPesawat Description");
        Pesawat pesawat = new Pesawat();
        System.out.println("Jumlah pintu " + pesawat.pintu);
        System.out.println("Nama merknya = " + pesawat.merk);
        System.out.println("Jumlah roda " + pesawat.roda);
        System.out.println("Jenis warnanya = " + pesawat.warna);
    }
}
