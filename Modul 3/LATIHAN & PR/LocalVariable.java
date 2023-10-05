public class LocalVariable {
    public void hitungUsia(){
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }

//    void beratBadan(){
//    int beratLahir = 3;
//    int beratBadan;
//    beratBadan = beratLahir + (usia / 2);
//    System.out.println("Berat badan saya: " + beratBadan);
//
//    } error karena usia tidak di variable global

    public static void main(String[] args) {
        LocalVariable main = new LocalVariable();
        main.hitungUsia();
    }
}