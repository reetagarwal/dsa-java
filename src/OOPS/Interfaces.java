package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Rook r=new Rook();
        r.moves();
        King k=new King();
        k.moves();
    }
}
interface ChessPlayer{
    void moves();//public,abstract by default
}
class Queen implements ChessPlayer{
    public void moves() {//have to write public otherwise it will become of default type
        System.out.println("Up,Down,Left,Right,Diagonal(in all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves() {//have to write public otherwise it will become of default type
        System.out.println("Up,Down,Left,Right");
    }
}
class King implements ChessPlayer{
    public void moves() {//have to write public otherwise it will become of default type
        System.out.println("Up,Down,Left,Right,Diagonal(by 1 step");
    }
}