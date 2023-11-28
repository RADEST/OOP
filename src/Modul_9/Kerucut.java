package Modul_9;

public class Kerucut extends methodVAbstract{
    int jari = 10;
    int tinggi = 4;

    public int luas(){
        return (int) (Math.PI*jari*(jari+Math.sqrt(tinggi*tinggi+jari*jari)));
    }

    public int volume(){
        return (int) (Math.PI*jari*jari*tinggi/3);
    }
}