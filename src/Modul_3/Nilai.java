package Modul_3;

public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
//    double nilaiUTS;
//    double nilaiUAS;
//    double nilaiTugas;
    double nilaiTotal;
    String nama;

    public void nilai(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    public double mean(){
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        return nilaiTotal;
    }

    public String setNama(String nama){return this.nama = nama;}

    public static void main(String[] args) {
        Nilai main = new Nilai();
        main.nilai(95, 100, 90);
        main.setNama("Rafli");
        double mean = main.mean();
        System.out.println("Nilai UTS dari " + main.nama+ " adalah " + main.nilaiUTS);
        System.out.println("Nilai UAS dari " + main.nama+ " adalah " + main.nilaiUAS);
        System.out.println("Nilai Tugas dari " + main.nama + " adalah " + main.nilaiTugas);
        System.out.println("Nilai rata-rata dari " + main.nama + " adalah " + mean);
    }
}
