package Modul_6;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    double lebar;

    public void hitungLuas(){
        super.hitungLuas();
        luas = panjang*lebar;
        System.out.println(super.luas);
    }

    public void hitungKeliling(){
        super.hitungKeliling();
        keliling = (2*panjang)+(2*lebar);
        System.out.println(super.keliling);
    }

    public static void main(String[] args) {
        System.out.println("Persegi Panjang");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 7;
        persegiPanjang.hitungKeliling();
        persegiPanjang.hitungLuas();
    }
}
