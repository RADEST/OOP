package Modul_5;

public class ConstructorAccess {
    public static void main(String[] args) {
//        Constructor cons = new Constructor();
//        Constructor cons2 = new Constructor("Rafli",274,"Perumahan Taman Pratama");
//        ParamConstructor param = new ParamConstructor("Rafli", "274", 3);
//        param.info();
        Buku book = new Buku();
        Buku book2 = new Buku("Rafli Ahmad","Aku Sayang Dia",
                2023,1,150000);
        Buku book3 = new Buku("Rafli Ahmad","Bagaimana Mendekati Dia",
                2023,2,120000);
        Buku book4 = new Buku("Rafli Ahmad","Apakah Aku Menganggu Dia",
                2023,1,90000);
        Buku book5 = new Buku("Rafli Ahmad",
                "Aku Tidak Mengerti Kenapa Rasa Cinta ini Tidak Bisa Menghilang",
                2023,2,80000);
        Buku book6 = new Buku("Rafli Ahmad","Aku Overthinking",
                2023,4,150000);
        Buku book7 = new Buku("Rafli Ahmad","Aku Tidak Bisa Move On",
                2023,1,180000);
        Buku book8 = new Buku("Rafli Ahmad","Dan Terjadi Lagi yang Kutakutkan",
                2023,2,200000);
        Buku book9 = new Buku("Rafli Ahmad","Aku Ingin Berubah",
                2023,8,50000);
        Buku book10 = new Buku("Rafli Ahmad","Aku Ingin Menjadi Lebih Baik",
                2023,1,100000);
        book2.info();
        book3.info();
        book4.info();
        book5.info();
        book6.info();
        book7.info();
        book8.info();
        book9.info();
        book10.info();
        Buku book11 = new Buku("Created by Pencinta Buku Solid ");
    }

}
