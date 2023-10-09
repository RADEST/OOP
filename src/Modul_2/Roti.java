package Modul_2;

public class Roti {
String warna;
String rasa;
int berat;
double harga;

void beriWarna(String warnaRoti){
    warna = warnaRoti;
}

void beriRasa(String rasaRoti) {
    rasa = rasaRoti;
}

void timbangBerat(int beratRoti){
    berat = beratRoti;
}

void hargaJual(double hargaRoti){
    harga = hargaRoti;
}

void infoRoti(){
    System.out.println(
            "Warna Modul_2.Roti : " + warna + "\n" +
            "Rasa Modul_2.Roti : " + rasa + "\n" +
            "Berat Modul_2.Roti : " + berat + "gr" +"\n" + "Harga Modul_2.Roti : Rp." + harga +"\n");
}
}
