package Modul_6;

public class Persegi extends BangunDatar{
    double sisi;

    public void hitungLuas(){
        super.hitungLuas();
        luas = sisi*sisi;
        System.out.println(super.luas);
    }

    public void hitungKeliling(){
        super.hitungKeliling();
        keliling = sisi*4;
        System.out.println(super.keliling);
    }

    public static void main(String[] args) {
        System.out.println("Persegi");
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        persegi.hitungKeliling();
        persegi.hitungLuas();
    }
}
