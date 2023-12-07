package Modul_11;

public class Myclass {
    public static void main(String[] args) {
        //membuat object outer class
        OuterDemo outer = new OuterDemo();
        //mengakses method outer class
        outer.displayInner();
    }
}
