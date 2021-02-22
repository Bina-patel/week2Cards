import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
    }

    public String toString() {
        return faceName + " of " + suit;
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getFaceNames()
    {
        return Arrays.asList("two","three","four","five","six","seven","eight",
                "nine","ten","jack","queen","king","ace");
    }
    public void setFaceName(String faceName) {
        List<String> FaceNames = getFaceNames();
        if (FaceNames.contains(faceName)) {
            this.faceName = faceName;
        } else {
            throw new IllegalArgumentException(faceName + "is not valid, use from it" + FaceNames);
        }
    }


    public String getSuit()
    {
        return suit;
    }

    public static List<String> getSuits(){
        return Arrays.asList("hearts", "diamonds", "clubs", "spades");
    }
    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = getSuits();
        if (validSuits.contains(suit)) {
            this.suit = suit;}
        else {
            throw new IllegalArgumentException(suit + "is not valid" + validSuits);
        }
    }

    public String getCardColour()
    {
//        if(suit.equals("hearts") || suit.equals("diamonds")){
//            return "red";}
//            else {
//                return "black";
//        }

   // }
        if(faceName.equalsIgnoreCase("One") || faceName.equalsIgnoreCase("two")){
            return "red";}
            else {
                return "black";
        }         //We can also write equal ognore case or toLowercase

             }

             public int getFaceValue(){
        return getFaceNames().indexOf(faceName)+2;
             }
}