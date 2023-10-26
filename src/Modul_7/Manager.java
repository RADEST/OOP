package Modul_7;

public class Manager extends Karyawan{
    private float jamKerja = 7.5f;

    public float jamKerja(){
        return jamKerja;
    }

    public float getGajiManager(){
        return getGaji() * 2;
    }
    public void setJamKerja(float jamKerja) { //setter
        this.jamKerja = jamKerja;
    }
}
