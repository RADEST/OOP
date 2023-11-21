package Modul_8;

public class Elang extends Hewan{
    public void jalan(){
        System.out.println("Elang bisa berjalan" + " dan terbang di angkasa");
    }

    public static void main(String[] args) {
        Elang e = new Elang();
        e.jalan();
    }
}
