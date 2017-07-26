package models;

/**
 * Created by paulharrington on 7/25/17.
 */
public class Suit {

    private String unicode;

    private String name;

    public Suit( String unicode, String name){
        this.unicode = unicode;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUnicode() {
        return unicode;
    }
}
