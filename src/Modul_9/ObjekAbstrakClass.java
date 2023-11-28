package Modul_9;

public class ObjekAbstrakClass {
    public static void main(String[] args) {
//        AbstrakClass ac = new AbstrakClass(2,3,4);
        TurunanAbstrakClass tac = new TurunanAbstrakClass(2,3,2);
        tac.printX();
        System.out.println(tac.kali());
    }
}
