package Modul_8;

//public class Kucing extends Hewan{
//    public void jalan(){
//        System.out.println("Kucing bisa berjalan dengan" + " dan berlari");
//    }

//    public static void main(String[] args) {
//        Kucing k = new Kucing();
//        k.jalan();
//    }
//}
public class Kucing extends Pet{
    String makananFav;
    public String perilaku(){
        return "Meeooww... Meeooww...";
    }
    public String makananFav(){
        return "Menyukai ikan";
    }
//    public static void main(String[] args) {
//        Kucing k = new Kucing();
//        k.beriNama("Tom");
//        System.out.println(k.pangilNama());
//        System.out.println(k.makananFav());
//        System.out.println(k.perilaku());
//    }
}