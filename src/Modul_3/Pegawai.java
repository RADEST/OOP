package Modul_3;

public class Pegawai {
    String nama;
    int nip;
    double gaji;

    public String setNama (String nama){
        return this.nama = nama;
    }

    public int setNip (int nip){
        return this.nip = nip;
    }

    public double setGaji (double gaji) {
        return this.gaji = gaji;
    }

    public static void main(String[] args) {
        Pegawai main = new Pegawai();
        main.setNama("Rafli");
        main.setNip(123);
        main.setGaji(2500000);
        Pegawai maind = new Pegawai();
        maind.setNama("Ahmad");
        maind.setNip(345);
        maind.setGaji(4500000);
        System.out.println(main.nama);
        System.out.println(main.nip);
        System.out.println(main.gaji);
        System.out.println(maind.nama);
        System.out.println(maind.nip);
        System.out.println(maind.gaji);
    }
}
