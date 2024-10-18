import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        //Elements: fire>life>rock>elec>water>fire
        Stack<card> fightDeck = new Stack<>();
        Stack<card> deck = new Stack<>();
        ArrayList<card> hand = new ArrayList<>();
        Enemy one = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Enemy two = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Enemy three = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Encounter testBattle = new Encounter(1, one, two, three, "fire");
    }
    public static void drawHand(ArrayList<card> hand, Stack<card> deck, int drawNum){
        for(int x = 0;x<drawNum;x++){
            hand.add(deck.pop());
        }
    }
    public static void clearHand(ArrayList<card> hand){
        while(hand.size()>0){
            hand.remove(0);
        }
    }
    public static void deckShuffle(Stack<card> fightDeck, Stack<card> drawDeck){
        fightDeck = (Stack<card>)drawDeck.clone();
        Collections.shuffle(fightDeck);
    }
    public static void encounterMaker(int diff, String element){

    }

    public static void combat(Encounter battle, player player, ArrayList<card> hand, Stack<card> drawDeck, Stack<card> fightDeck){
        while(player.getHealth()>0){

        }
    }
}
