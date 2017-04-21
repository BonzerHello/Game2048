package ch.bfh.domain;

/**
 * Created by tilli_000 on 20.04.2017.
 */
public class Kachel {

    private int value;

    public Kachel(){
        this.value = 0;
    }

    public Kachel(int value){

        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
