import java.util.ArrayList;
import java.util.Scanner;

public class CardExperiment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Card aceOfSpades = new Card("two","diamonds");
        Card binuOfNishu = new Card("ace","hearts");


      //  binuOfNishu.setSuit("Heart");
       // System.out.printf("%s is a %s card%n" ,aceOfSpades ,aceOfSpades.getCardColour());
    //    System.out.printf("%s is a %s card%n" ,binuOfNishu ,binuOfNishu.getCardColour());
        System.out.printf("%s is a %s card%n with value of %d %n" ,binuOfNishu ,binuOfNishu.getCardColour(),binuOfNishu.getFaceValue());


     //   System.out.println(binuOfNishu);
        //showing why we might want to use the formatted print
        double cost = 17.12;
        double saleCost = cost*.74;
        double tax = saleCost*1.13;
        System.out.println("$" + saleCost);
        System.out.printf("$%.2f", saleCost);

        //little experiment showing why we put datatype's into our List's
        //or other datastructures
        ArrayList genericArrayList = new ArrayList();
        genericArrayList.add(1234);
        genericArrayList.add("Fred");
        genericArrayList.add(aceOfSpades);
        //it assumes that the datatype to be "Object"

        for (int i=0; i<genericArrayList.size(); i++)
            System.out.println(genericArrayList.get(i).getClass());

        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(aceOfSpades);
        cardArrayList.add(binuOfNishu);

        for (Card card : cardArrayList)
         //   System.out.println(card.getSuit());
        System.out.println(card.getFaceName());    //we can write one of it 


        //Create an instance of a DeckOfCards
        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck);

    }
}
