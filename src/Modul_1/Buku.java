package Modul_1;

public class Buku {
    String namaPengarang; //instance variable
    int tahunTerbit;      //instance variable
    int cetakanKe;
    double hargaJual;
    public static String judulBuku;
    public static final String Announcement = "Top Books Awards";

    public void Bukujudul() {
        System.out.println(Announcement);
    }

    public void Buku(String namaPengarang,String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }

    public void info(){
        System.out.println("Nama Pengarang : "+ namaPengarang +"\nJudul Buku : "+ judulBuku +"\nTahun Terbit : "
                + tahunTerbit +"\nCetakan Ke : "+ cetakanKe +"\nHarga Jual : "+ hargaJual);}
}