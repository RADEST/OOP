package Modul_6;

public class SegiTigaSamaSisi extends Segitiga {
    double sisi;

    public void hitungLuas(){
        super.hitungLuas();
        luas = (alas*tinggi)/2;
        System.out.println(super.luas);
    }
    public void hitungKeliling(){
        super.hitungKeliling();
        keliling = alas+(2*sisi);
        System.out.println(super.keliling);
    }

    public static void main(String[] args) {
        System.out.println("Segitiga Sama Kaki");
        SegiTigaSamaSisi segiTigaSamaSisi = new SegiTigaSamaSisi();
        segiTigaSamaSisi.alas = 6;
        segiTigaSamaSisi.tinggi = 10;
        segiTigaSamaSisi.sisi = 20;
        segiTigaSamaSisi.hitungKeliling();
        segiTigaSamaSisi.hitungLuas();
    }
}
