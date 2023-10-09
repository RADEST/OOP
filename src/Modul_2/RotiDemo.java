package Modul_2;

public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();

        Roti croissant = new Roti();
        croissant.beriWarna("Dark Chocolate");
        croissant.beriRasa("Coklat");
        croissant.timbangBerat(60);
        croissant.hargaJual(15000);
        croissant.infoRoti();

        Roti donut = new Roti();
        donut.beriWarna("Pink");
        donut.beriRasa("Strawberry");
        donut.timbangBerat(20);
        donut.hargaJual(3000);
        donut.infoRoti();

        Roti bagel = new Roti();
        bagel.beriWarna("Coklat dan Putih");
        bagel.beriRasa("Vanilla");
        bagel.timbangBerat(40);
        bagel.hargaJual(10000);
        bagel.infoRoti();
    }
}
