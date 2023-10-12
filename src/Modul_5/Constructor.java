package Modul_5;

public class Constructor {
    String nama;
    int nim;
    String alamat;
    public Constructor(){
        System.out.println("Default Constructor");
    }
    public Constructor(String nama,int nim,String alamat){
        System.out.println(nama+" dengan nim "+nim+" tinggal di "+alamat);
    }
}
