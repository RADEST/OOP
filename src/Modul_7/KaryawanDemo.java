package Modul_7;

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan kl = new Karyawan();
        kl.setNama("Luffy");
        kl.setGaji(2500000);
        kl.setUsia(21);

        System.out.println(kl.getNama());
        System.out.println(kl.getGaji());
        System.out.println(kl.getUsia());
    }
}
