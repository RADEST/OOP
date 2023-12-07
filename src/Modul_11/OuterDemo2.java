package Modul_11;

public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("This is the nilai from variable private outerDemo");
            return num;
        }
    }
}
