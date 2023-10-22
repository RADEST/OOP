package Modul_6;

public class SegiTigaSamaKaki extends Segitiga {
    double sisiMiring;

    public void hitungLuas(){
        super.hitungLuas();
        luas = (alas*tinggi)/2;
        System.out.println(super.luas);
    }
    public void hitungKeliling(){
        super.hitungKeliling();
        keliling = alas+(2*sisiMiring);
        System.out.println(super.keliling);
    }

    public static void main(String[] args) {
        System.out.println("Segitiga Sama Kaki");
        SegiTigaSamaKaki segiTigaSamaKaki = new SegiTigaSamaKaki();
        segiTigaSamaKaki.alas = 3;
        segiTigaSamaKaki.tinggi = 4;
        segiTigaSamaKaki.sisiMiring = 5;
        segiTigaSamaKaki.hitungKeliling();
        segiTigaSamaKaki.hitungLuas();
    }
}
