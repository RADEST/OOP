package Modul_5;

public class Game {
    String namaGame;
    String genreGame;
    int tahunRilis;

    public Game(){
        System.out.println("Top Games Awards");
    }
    public Game(String namaGame,String genreGame,int tahunRilis){
        this.namaGame = namaGame;
        this.genreGame = genreGame;
        this.tahunRilis = tahunRilis;
    }
    public void info(){
        System.out.println("Nama Game : "+ namaGame +"\nGenre Game : "+ genreGame +"\nTahun Rilis : "+ tahunRilis);
    }
}
