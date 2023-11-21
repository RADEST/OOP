package Modul_8;

public class Pet {
    private String nama;
    public void beriNama(String nama){
        this.nama = nama;
    }

    public String pangilNama() {
        return this.nama;
    }
    public String perilaku(){
        return "Hewan penurut";
    }
}
