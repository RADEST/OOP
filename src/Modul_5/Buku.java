package Modul_5;

public class Buku {
    String Annnouncement;
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;
    String Penilai;
    public Buku(){
        System.out.println("Top Books Awards");
    }
    public Buku(String namaPengarang,String judulBuku,int tahunTerbit,int cetakanKe, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    public Buku(String Penilai){
        this.Penilai = Penilai;
        System.out.println(Penilai);
    }
    public void info(){
        System.out.println("Nama Pengarang : "+ namaPengarang +"\nJudul Buku : "+ judulBuku +"\nTahun Terbit : "
                + tahunTerbit +"\nCetakan Ke : "+ cetakanKe +"\nHarga Jual : "+ hargaJual);
    }
}
