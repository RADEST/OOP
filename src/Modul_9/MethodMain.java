package Modul_9;

public class MethodMain {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("Luas Persegi: " + psg.luas());
        System.out.println("Keliling Persegi: " + psg.keliling());
        PersegiPanjang psgpjg = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang: " + psgpjg.luas());
        System.out.println("Keliling Persegi Panjang: " + psgpjg.keliling());
        JajarGenjang jjr = new JajarGenjang();
        System.out.println("Luas Jajar Genjang: " + jjr.luas());
        System.out.println("Keliling Jajar Genjang: " + jjr.keliling());
        Segitiga sgt = new Segitiga();
        System.out.println("Luas Segitiga: " + sgt.luas());
        System.out.println("Keliling Segitiga: " + sgt.keliling());
        Lingkaran lkrn = new Lingkaran();
        System.out.println("Luas Lingkaran: " + lkrn.luas());
        System.out.println("Keliling Lingkaran: " + lkrn.keliling());
        Balok blk = new Balok();
        System.out.println("Volume Balok: " + blk.volume());
        System.out.println("Luas Permukaan Balok: " + blk.luas());
        Kubus kbs = new Kubus();
        System.out.println("Volume Kubus: " + kbs.volume());
        System.out.println("Luas Permukaan Kubus: " + kbs.luas());
        Bola bla = new Bola();
        System.out.println("Volume Bola: " + bla.volume());
        System.out.println("Luas Permukaan Bola: " + bla.luas());
        Kerucut krc = new Kerucut();
        System.out.println("Volume Kerucut: " + krc.volume());
        System.out.println("Luas Permukaan Kerucut: " + krc.luas());
        PrismaSegitiga psgsgt = new PrismaSegitiga();
        System.out.println("Volume Prisma Segitiga: " + psgsgt.volume());
        System.out.println("Luas Permukaan Prisma Segitiga: " + psgsgt.luas());
    }
}
