package Modul_9;

public class Segitiga extends methodAbstract{
    int alas = 5;
    int tinggi = 4;

    public int luas(){
        return (alas*tinggi)/2;
    }

    public int keliling(){
        return alas+tinggi+(int) Math.sqrt((alas*alas)+(tinggi*tinggi));
    }
}
