package Modul_11;

public class Outer {
    static class NestedDemo{
        public void myMethod(){
            System.out.println("This is my nested class");
        }

        public static void main(String[] args) {
            Outer.NestedDemo nested = new Outer.NestedDemo();
            nested.myMethod();
        }
    }
}
