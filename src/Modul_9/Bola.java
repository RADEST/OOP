package Modul_9;

public class Bola extends methodVAbstract{
    int jari = 5;

    public int luas(){
        return (int) (4*Math.PI*jari*jari);
    }

    public int volume(){
        return (int) ((4/3)*Math.PI*jari*jari*jari);
    }
}
