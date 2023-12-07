package Modul_11;

public class OuterDemo {
    int num;

    //inner class
    private class InnerDemo{
        public void print(){
            System.out.println("This is an inner class");
        }
    }
    //akses method inner class dari outer class
    void displayInner(){
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}
