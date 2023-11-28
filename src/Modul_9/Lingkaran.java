package Modul_9;

public class Lingkaran extends methodAbstract{
    int jari = 5;

    public int luas(){
        return (int) (Math.PI*jari*jari);
    }

    public int keliling(){
        return (int) (2*Math.PI*jari);
    }
}
