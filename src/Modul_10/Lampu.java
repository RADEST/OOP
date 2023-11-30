package Modul_10;

public class Lampu implements ActivityLampu{
    public int statusLampu;
    public void matikanLampu(){
        if(statusLampu == 0){
            System.out.println("Lampu sudah mati");
        }
        else{
            statusLampu = 0;
            System.out.println("Lampu dimatikan");
        }
    }

    public void hidupkanLampu() {
        if(statusLampu == 2){
            System.out.println("Lampu sudah nyala");
        }
        else{
            statusLampu = 2;
            System.out.println("Lampu dinyalakan");
        }
    }
    public void redupkanLampu() {
        if(statusLampu == 1){
            System.out.println("Lampu sudah redup");
        }
        else{
            statusLampu = 1;
            System.out.println("Lampu diredupkan");
        }
    }

    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
