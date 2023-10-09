package Modul_4;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;
    public void kali(){
        int d = a*b*c;
        System.out.println("Hasil kali = " + d);
    }
    public void tambah(){
        int e = a+b+c;
        System.out.println("Total penjumlahan = " + e);
    }
    public void kurang(){
        int f = a-b-c;
        System.out.println("Total perkurangan = " + f);
    }
    public void rata(){
        int g = (a+b+c) / 3;
        System.out.println("Total rata2 = " + g);
    }
    public void bagi(){
        int h = c / 3;
        System.out.println("Pembagian antara " + c + " dengan " + 3 + " adalah " + h);
    }
}
