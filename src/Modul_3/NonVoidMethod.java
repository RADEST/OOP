package Modul_3;

public class NonVoidMethod {
    String nama = "Rafli";
    String nim = "C";
    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod main = new NonVoidMethod();
        System.out.println(main.getNama());
        System.out.println(main.getNim());
    }
}
