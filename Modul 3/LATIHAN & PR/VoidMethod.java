public class VoidMethod {
    int hour, minute, second;

    public void duration(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void info(){
        System.out.println("Total Waktu \n" + hour + " jam " + minute + " menit " + second + " detik ");
    }

    public static void main(String[] args) {
        VoidMethod main = new VoidMethod();
        main.duration(1, 30, 15);
        main.info();
    }
}
