package Modul_6;

public class Programmer extends Pegawai {
    public static void main(String[] args) {
        double lemburPerjam = 50000;
        double gajiPerbulan;
        Pegawai pegawai = new Pegawai();
        gajiPerbulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println(gajiPerbulan);
    }
}
