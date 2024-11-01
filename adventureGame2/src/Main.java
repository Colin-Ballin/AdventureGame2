import java.util.*;
//surely this will work this time right?
public class Main {
    public static void main(String[] args) {
        //Elements: fire>life>rock>elec>water>fire
        Stack<card> fightDeck = new Stack<>();
        Enemy.initEnemies();
        Stack<card> deck = new Stack<>();
        ArrayList<card> hand = new ArrayList<>();
        card.makingCards();
        deck.add(card.cards.get("Flame"));
        deck.add(card.cards.get("Flame"));
        deck.add(card.cards.get("Flame"));
        deck.add(card.cards.get("Flame"));
        deck.add(card.cards.get("Block"));
        deck.add(card.cards.get("Block"));
        deck.add(card.cards.get("Block"));
        deck.add(card.cards.get("Block"));
        fightDeck = deckShuffle(fightDeck, deck);
        player player = new player(200, 10);
        while (true) {
            combat(encounterMaker(player.getLevel(), Encounter.getRandomElement()), player, hand, deck, fightDeck);
            combat(encounterMaker(player.getLevel(), Encounter.getRandomElement()), player, hand, deck, fightDeck);
            combat(encounterMaker(player.getLevel(), Encounter.getRandomElement()), player, hand, deck, fightDeck);
            if(player.getLevel()<10) {
                player.addLevel();
                player.heal(player.getHealth());
                System.out.println("You leveled up! You now get 3 new cards, and heal to full health, but you will face stronger enemies now");
                card addCard = card.cards.get(card.getRandomCard());
                deck.add(addCard);
                System.out.println(addCard.toString());
                addCard = card.cards.get(card.getRandomCard());
                deck.add(addCard);
                System.out.println(addCard.toString());
                addCard = card.cards.get(card.getRandomCard());
                deck.add(addCard);
                System.out.println(addCard.toString());
            }
            else{
                System.out.println("You're winner!");
                System.exit(0);
            }
            }
    }
    static Scanner scanner = new Scanner(System.in);
    public static void intro(){
        System.out.println("Hello and welcome to the game!");
        System.out.println("You have decided to explore the Dungeon of Death, but are ill prepared for its dangers");
        System.out.println("You have a basic moveset, but will have to loot better cards as you go on");
        System.out.println("Let's begin");
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
    public static Stack<card> deckShuffle(Stack<card> fightDeck, Stack<card> drawDeck){
        fightDeck = (Stack<card>)drawDeck.clone();
        Collections.shuffle(fightDeck);
        return fightDeck;
    }
    public static Encounter encounterMaker(int diff, String element){
        /*int enemyNum = (int)((Math.random()*3)+1);
        if(diff<3){
            enemyNum = diff;
        }
        Enemy one;
        Enemy two;
        Enemy three;
        if(enemyNum == 1) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get("");
            three = Enemy.enemies.get("");
        }
        else if(diff%enemyNum == 0&&enemyNum == 2) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + diff / enemyNum);
            three = Enemy.enemies.get("");

        }
        else if(diff%enemyNum == 0&&enemyNum == 3) {
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + diff / enemyNum);
            three = Enemy.enemies.get(element + diff / enemyNum);

        }
        else if(enemyNum == 2 && diff%enemyNum == 1){
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get("");

        }
        else if(enemyNum == 3 && diff%enemyNum == 1){
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get(element + (diff / enemyNum));


        }
        else{
            one = Enemy.enemies.get(element + diff / enemyNum);
            two = Enemy.enemies.get(element + (diff / enemyNum)+1);
            three = Enemy.enemies.get(element + (diff / enemyNum)+1);

        }*/
        Enemy one = Enemy.enemies.get(element + diff);
        Enemy two = Enemy.enemies.get("");
        Enemy three = Enemy.enemies.get("");
        Encounter encounter = new Encounter(diff, one, two, three, element);
        return encounter;
    }
    public static void printCardChoice(ArrayList<card> hand){
        System.out.println("press 1 to choose your first card, 2 for the second, etc");
        for(int x = 0;x<hand.size();x++){
            System.out.println(hand.get(x).toString());
        }
    }
    public static card chooseCard(int x, ArrayList<card> hand){
        return hand.get(x-1);
    }
    public static void printInfo(Enemy enemy, player player){
        System.out.println(enemy.toString());
        System.out.println(player.toString());
    }
    public static void cardAction(card card, Enemy enemy, player player){
        if(card.getUseValues().containsKey("Damage")){
            enemy.takeDamage(card.getUseValues().get("Damage")+player.getDamage());
        }
        if(card.getUseValues().containsKey("Block")){
            player.addArmour(card.getUseValues().get("Block"));
        }
        if(card.getUseValues().containsKey("Heal")){
            player.takeDamage(-1*card.getUseValues().get("Heal"));
        }
        if(card.getUseValues().containsKey("Chill")){
            enemy.reduceDamage(card.getUseValues().get("Chill"));
        }
        if(card.getUseValues().containsKey("Strengthen")){
            player.gainDamage(card.getUseValues().get("Strengthen"));
        }
        if(card.getUseValues().containsKey("Poison")){
            enemy.addDotLength(3);
            enemy.addDotStrength(card.getUseValues().get("Poison"));
        }
        if(card.getUseValues().containsKey("Burn")){
            enemy.addDotLength(3);
            enemy.addDotStrength(card.getUseValues().get("Burn"));
        }
    }

    public static void combat(Encounter battle, player player, ArrayList<card> hand, Stack<card> drawDeck, Stack<card> fightDeck){
        System.out.println("You have encountered a wild "+battle.get1().getName());
        while(battle.get1().getHealth()>0){
            if(fightDeck.size()<5){
                fightDeck=deckShuffle(fightDeck, drawDeck);
            }
            drawHand(hand, fightDeck, 5);
            int cardChoice;
            card card;
            if(battle.get1().getDotLength()>0) {
                battle.get1().takeDamage(battle.get1().getDotStrength());
                battle.get1().shortenDot();
                System.out.println(battle.get1().getName()+"took "+battle.get1().getDotStrength()+" damage from effects");
            }
            if(battle.get1().getHealth()>0) {
                printInfo(battle.get1(), player);
                printCardChoice(hand);
                System.out.println("Please choose your first card");
                cardChoice = scanner.nextInt();
                card = chooseCard(cardChoice, hand);
                cardAction(card, battle.get1(), player);
                clearHand(hand);
            }
            if(battle.get1().getHealth()>0){
                if(player.getArmour()>battle.get1().getDamage()){
                    System.out.println("You blocked the enemy's attack");
                }
                else {
                    player.takeDamage(battle.get1().getDamage());
                    System.out.println(battle.get1().getName() + " hit you for " + battle.get1().getDamage() + " damage!");
                }
                player.removeArmour();
            }
            clearHand(hand);
        }
        System.out.println("You have defeated the "+battle.get1().getName());
    }
}
