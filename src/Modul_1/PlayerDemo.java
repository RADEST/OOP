package Modul_1;

public class PlayerDemo extends Player{
    public static void main(String[] args) {
        PlayerDemo pedo = new PlayerDemo();
        System.out.println(pedo.nama());
        PlayerDemo pd = new PlayerDemo();
        pd.setNama("Rafli Ahmad");
        System.out.println(pd.getNama());
        PlayerDemo pd2 = new PlayerDemo();
        pd2.setNama("Li Mine");
        System.out.println(pd2.getNama());
    }
}
