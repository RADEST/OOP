package Modul_3;

public class MethodParameter {
    String nama;
    public String setNama (String nama){
        return this.nama = nama;
    }

    public static void main(String[] args) {
        MethodParameter main = new MethodParameter();
        main.setNama("Luffy");
        System.out.println(main.nama);
    }
}
