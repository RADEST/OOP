package Modul_8;

public class TestPolymorphism {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.beriNama("TOM");
        System.out.println(k.pangilNama());
        System.out.println(k.makananFav());
        System.out.println(k.perilaku());
        Anjing a = new Anjing();
        a.beriNama("BULL");
        System.out.println(a.pangilNama());
        System.out.println(a.makananFav());
        System.out.println(a.perilaku());
    }
}
