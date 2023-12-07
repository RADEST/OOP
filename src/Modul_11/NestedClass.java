package Modul_11;

class NestedClass {
    String nama="Rafli Ahmad Destiansyar";
    String nim="L200224274";
    public void printNama(){
        System.out.println("Nama\t: "+nama);
    }
    public void printNim(){
        System.out.println("NIM\t\t: "+nim);
    }
    static class StaticNestedClass{
        static String jurusan="Informatika";
    }
    class InnerClass{
        public void printJurusan(){
            System.out.println("Jurusan\t: "+StaticNestedClass.jurusan);
        }
    }

    public static void main(String[] args) {
        NestedClass nested = new NestedClass();
        NestedClass.InnerClass inner = nested.new InnerClass();
        nested.printNama();
        nested.printNim();
        inner.printJurusan();
    }
}
