package Modul_3;

public class StaticVariable {
    public static char akreditasi;
    public static final String jurusan = "Informatika";

    void firstMethod(){
        System.out.println(jurusan);
    }

    void secondMethod(){
        System.out.println("Akreditasi : " + akreditasi);
    }

    public static void main(String[] args) {
        StaticVariable.akreditasi = 'B';
        StaticVariable main = new StaticVariable();
        main.firstMethod();
        main.secondMethod();
    }
}
