package testing;

/**
 * Created by tilli_000 on 20.04.2017.
 */
public class Spielfeld {

    private Kachel[][] playGround;
    private int playGroundSize;

    public Spielfeld(int size){
        this.playGroundSize = size;
        this.playGround = new Kachel[size][size];

        //set titles
        for(int i = 0;i<playGroundSize;i++){
            for(int j = 0;j<playGroundSize;j++){
                playGround[i][j] = new Kachel();
            }
        }
    }




    public boolean generateNewKachel(){
        //prüfen ob es noch leere kacheln gibt

        //falls ja -> zufällige aussuchen und Wert setzen 2 oder 4

        return false;

    }

    public void move(String direction){
        //durch Liste gehen und je nach dem in welche Richtung es geht schieben
    }
}
