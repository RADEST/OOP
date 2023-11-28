package Modul_9;

public class JajarGenjang extends methodAbstract{
    int alas = 5;
    int tinggi = 4;
    int sisiMiring = 3;

    public int luas(){
        return alas*tinggi;
    }

    public int keliling(){
        return 2*(alas+sisiMiring);
    }
}
