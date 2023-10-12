package Modul_5;

public class ParamConstructor {
    String nama, nim;
    int semester;
    public ParamConstructor(String nama, String nim, int semester){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
    }

    public void info(){
        System.out.println("Berikut biodata saya"+"\nNama : "+ nama +"\nNIM : "+ nim +"\nSemester : "+ semester);
    }
}
