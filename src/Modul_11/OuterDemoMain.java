package Modul_11;

public class OuterDemoMain {
    public static void main(String[] args) {
        //membuat object OuterDemo
        OuterDemo2 outer = new OuterDemo2();
        //membuat object InnerDemo
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
