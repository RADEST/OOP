public class InstanceVariable {
    int nilai; //variable global
    int usia = 0;
    void firstMethod(){
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    void secondMethod(){
        int beratLahir = 3;
        int beratBadan;
        beratBadan = beratLahir + (usia / 2);
        System.out.println("Berat badan saya: " + beratBadan);
    }

    public static void main(String[] args) {
        InstanceVariable main = new InstanceVariable();
        main.firstMethod();
        main.secondMethod();
    }
}
