package Modul_9;

public class PrismaSegitiga extends methodVAbstract{
    int alas = 5;
    int tinggi = 4;
    int tinggiPrisma = 3;

    public int luas(){
        return (int) (2*alas*tinggi + 3*alas*tinggiPrisma);
    }

    public int volume(){
        return (int) (alas*tinggi*tinggiPrisma);
    }
}
