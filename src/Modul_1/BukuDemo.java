package Modul_1;

public class BukuDemo {

    public static void main(String[] args) {
        Buku judul = new Buku();
        judul.Bukujudul();
        Buku main = new Buku();
        main.Buku("Li","Cinta yang kusadari",2023, 1, 300000);
        main.info();
        Buku main2 = new Buku();
        main2.Buku("Mine","Cinta yang kutunggu",2023, 1, 300000);
        main2.info();
    }
}
