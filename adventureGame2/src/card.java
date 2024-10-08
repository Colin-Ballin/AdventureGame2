import java.util.Stack;
import java.util.HashMap;

public class card {

    private String element;

    private String name;

    private String[] functions;

    //contains a list of all the functions a card does and each
    // string is assocaited with a number you accuesss using a hashmap which
    // removes the usevalue int

    // list of different effects include
    // Damage (deal damage)---- Block (temp shield blocking damage)
    // Draw (draw a card)---- Heal(gain heath)
    //Strengthen (increase future damage) We can make this for more than just damage
    // Weaken(reduces damage enemy deals) ---- Poison (DOT for enemy)
    // Multi-Strike (hit multiple times) - Burn(other DOT for enemy)
    // Area (AOE) - Vary(range of values +- use values)(can use for any values
    // individually but can only work in combo with cards using only
    // (Damage, Block, MultiStrike, and Heal)

    private HashMap<String, Integer> useValues;

    private int cost;

    private int useValue;

    public card(String element, String name, String[] functions, HashMap<String, Integer> useValues, int cost){
        this.element = element;
        this.name = name;
        this.useValues = useValues;
        this.functions = functions;
        this.cost = cost;

    }

    public String getElement(){
        return element;
    }

    public String getName(){
        return name;
    }

    public String[] getFunctions(){
        return functions;
    }

    public HashMap<String, Integer> getUseValues(){
        return useValues;
    }

    public int getCost(){
        return cost;
    }

    public static void makingCards(){
        // Basic cards
        HashMap<String, Integer> strikeStats = new HashMap<>();
        strikeStats.put("Damage", 10);
        String[] strikeFunctions = {"Damage"};
        card strike = new card("Null", "Strike", strikeFunctions, strikeStats, 1);


        HashMap<String, Integer> blockStats = new HashMap<>();
        strikeStats.put("Block", 8);
        String[] blockFunctions = {"Block"};
        card block = new card("Null", "Block", blockFunctions, blockStats, 1);


        HashMap<String, Integer> drawStats = new HashMap<>();
        drawStats.put("Draw", 2);
        String[] drawFunctions = {"Draw"};
        card draw = new card("Null", "draw", drawFunctions, drawStats, 1);



        // lightning cards
        HashMap<String, Integer> zapStats = new HashMap<>();
        zapStats.put("Damage", 4);
        zapStats.put("MultiStrike", 3);
        String[] zapFunctions = {"Damage", "MultiStrike"};
        card zap = new card("Elec", "Zap", zapFunctions, zapStats, 1);


    }




    /*
    List of cards

    Strike - 1 cost deals 10 damage - +Strike+ - 1 cost do 17 damage





     */
}