package Modul_9;

public class Balok extends methodVAbstract{
    int panjang = 5;
    int lebar = 4;
    int tinggi = 3;

    public int luas(){
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }

    public int volume(){
        return panjang*lebar*tinggi;
    }
}
