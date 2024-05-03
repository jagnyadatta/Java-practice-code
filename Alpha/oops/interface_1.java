public class interface_1 {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

//interface (blue print)
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, diagonal (by 1 step)");
    }
}