package Modul_9;

public class PersegiPanjang extends methodAbstract{
    int panjang = 5;
    int lebar = 4;

    public int luas(){
        return panjang*lebar;
    }

    public int keliling(){
        return 2*(panjang+lebar);
    }
}
