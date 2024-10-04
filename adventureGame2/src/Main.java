import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        //Elements: fire>life>rock>elec>water>fire
        Enemy one = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Enemy two = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Enemy three = new Enemy(100, 50, "Fire Dude", "fire", 1);
        Encounter testBattle = new Encounter(1, one, two, three, "fire");
        combat(testBattle);
    }
    public static void combat(Encounter battle){
        
    }
}