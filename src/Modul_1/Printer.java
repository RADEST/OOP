package Modul_1;
public class Printer {
    String color;
    double usage_month;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setTimeOfUse(double usage_month) {
        this.usage_month = usage_month;
    }
    public double getTimeOfUse() {
        return usage_month;
    }
    public Printer(){
        System.out.println("Printer adalah perangkat elektronik yang digunakan untuk menampilkan data dalam bentuk cetakan.");
    }
    public Printer(double usage_month){
        this.usage_month = usage_month;
        this.usage_month = this.usage_month - this.usage_month * (0.005*6);
    }
    public static void main(String[] args) {
        Printer myPrint = new Printer();
        Printer price$ = new Printer(200.0);
    }
}
