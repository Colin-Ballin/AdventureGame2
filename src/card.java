

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
        card draw = new card("Null", "Draw", drawFunctions, drawStats, 1);


        // Null Cards


        HashMap<String, Integer> bombStats = new HashMap<>();
        bombStats.put("Damage", 50);
        bombStats.put("Area", 1);
        String[] bombFunctions = {"Draw"};
        card bomb = new card("Null", "Bomb", bombFunctions, bombStats, 4);




        // Fire cards


        HashMap<String, Integer> emberStats = new HashMap<>();
        emberStats.put("Damage", 5);
        String[] emberFunctions = {"Damage"};
        card ember = new card("Fire", "Ember", emberFunctions, emberStats, 0);




        HashMap<String, Integer> flameStats = new HashMap<>();
        flameStats.put("Damage", 10);
        flameStats.put("Burn", 1);
        String[] flameFunctions = {"Damage", "Burn"};
        card flame = new card("Fire", "Flame", flameFunctions, flameStats, 1);




        HashMap<String, Integer> fireballStats = new HashMap<>();
        fireballStats.put("Damage", 20);
        fireballStats.put("Burn", 3);
        String[] fireballFunctions = {"Damage", "Burn"};
        card fireball = new card("Fire", "Fireball", fireballFunctions, fireballStats, 2);




        HashMap<String, Integer> wallOfFireStats = new HashMap<>();
        wallOfFireStats.put("Block", 30);
        wallOfFireStats.put("Burn", 4);
        String[] wallOfFireFunctions = {"Damage", "Burn"};
        card wallOfFire = new card("Fire", "Wall Of Fire", wallOfFireFunctions, wallOfFireStats, 3);




        HashMap<String, Integer> eruptionStats = new HashMap<>();
        eruptionStats.put("Damage", 100);
        eruptionStats.put("Burn", 10);
        String[] eruptionFunctions = {"Damage", "Burn"};
        card eruption = new card("Fire", "Eruption", eruptionFunctions, eruptionStats, 4);




        HashMap<String, Integer> blazingHellStats = new HashMap<>();
        blazingHellStats.put("Damage", 200);
        blazingHellStats.put("Burn", 30);
        String[] blazingHellFunctions = {"Damage", "Burn"};
        card blazingHell = new card("Fire", "Blazing Hell", blazingHellFunctions, blazingHellStats, 5);


        //Rock cards


        HashMap<String, Integer> rockThrowStats = new HashMap<>();
        rockThrowStats.put("Damage", 4);
        String[] rockThrowFunctions = {"Damage"};
        card rockThrow = new card("Rock", "Rock Throw", rockThrowFunctions, rockThrowStats, 0);




        HashMap<String, Integer> stoneStrikeStats = new HashMap<>();
        stoneStrikeStats.put("Damage", 12);
        String[] stoneStrikeFunctions = {"Damage"};
        card stoneStrike = new card("Rock", "Stone Strike", stoneStrikeFunctions, stoneStrikeStats, 1);




        HashMap<String, Integer> stalagmiteSmashStats = new HashMap<>();
        stalagmiteSmashStats.put("Damage", 24);
        String[] stalagmiteSmashFunctions = {"Damage"};
        card stalagmiteSmash = new card("Rock", "Stalagmite Smash", stalagmiteSmashFunctions, stalagmiteSmashStats, 2);




        HashMap<String, Integer> shaleStormStats = new HashMap<>();
        shaleStormStats.put("Damage", 25);
        shaleStormStats.put("Area", 1);
        String[] shaleStormFunctions = {"Damage", "Area"};
        card shaleStorm = new card("Rock", "Shale Storm", shaleStormFunctions, shaleStormStats, 3);




        HashMap<String, Integer> boulderThrowStats = new HashMap<>();
        boulderThrowStats.put("Damage", 50);
        String[] boulderThrowFunctions = {"Damage"};
        card boulderThrow = new card("Rock", "Boulder Throw", boulderThrowFunctions, boulderThrowStats, 3);




        // Aqua cards


        HashMap<String, Integer> splashStats = new HashMap<>();
        splashStats.put("Damage", 4);
        String[] splashFunctions = {"Damage"};
        card splash = new card("Aqua", "Splash", splashFunctions, splashStats, 0);


        HashMap<String, Integer> jetStreamStats = new HashMap<>();
        jetStreamStats.put("Damage", 12);
        String[] jetStreamFunctions = {"Damage"};
        card jetStream = new card("Aqua", "Jet Stream", jetStreamFunctions, jetStreamStats, 1);




        HashMap<String, Integer> iceSpikeStats = new HashMap<>();
        iceSpikeStats.put("Damage", 30);
        iceSpikeStats.put("Chill", 5);
        String[] iceSpikeFunctions = {"Damage", "Chill"};
        card iceSpike = new card("Aqua", "Ice Spike", iceSpikeFunctions, iceSpikeStats, 3);




        HashMap<String, Integer> iceWallStats = new HashMap<>();
        iceWallStats.put("Block", 50);
        iceWallStats.put("Chill", 2);
        String[] iceWallFunctions = {"Block", "Chill"};
        card iceWall = new card("Aqua", "Ice Wall", iceWallFunctions, iceWallStats, 3);




        HashMap<String, Integer> freezeStats = new HashMap<>();
        freezeStats.put("Chill", 10);
        String[] freezeFunctions = {"Chill"};
        card freeze = new card("Aqua", "Freeze", freezeFunctions, freezeStats, 2);




        HashMap<String, Integer> permafrostStats = new HashMap<>();
        permafrostStats.put("Damage", 75);
        permafrostStats.put("Chill", 15);
        String[] permafrostFunctions = {"Damage", "Chill"};
        card permafrost = new card("Aqua", "Permafrost", permafrostFunctions, permafrostStats, 5);






        // Life cards


        HashMap<String, Integer> bandageStats = new HashMap<>();
        bandageStats.put("Heal", 10);
        String[] bandageFunctions = {"Heal"};
        card bandage = new card("Life", "Bandage", bandageFunctions, bandageStats, 1);


        HashMap<String, Integer> poisionDartStats = new HashMap<>();
        poisionDartStats.put("Damage", 6);
        poisionDartStats.put("Poison", 3);
        String[] poisionDartFunctions = {"Damage", "Poison"};
        card poisionDart = new card("Life", "Poison Dart", poisionDartFunctions, poisionDartStats, 1);




        HashMap<String, Integer> throwACobraStats = new HashMap<>();
        throwACobraStats.put("Damage", 15);
        throwACobraStats.put("Poison", 8);
        String[] throwACobraFunctions = {"Damage", "Poison"};
        card throwACobra = new card("Life", "Throw A Cobra", throwACobraFunctions, throwACobraStats, 2);




        HashMap<String, Integer> trenStats = new HashMap<>();
        trenStats.put("Strengthen", 4);
        String[] trenFunctions = {"Strengthen"};
        card tren = new card("Life", "Tren", trenFunctions, trenStats, 1);




        HashMap<String, Integer> steroidsStats = new HashMap<>();
        steroidsStats.put("Strengthen", 15);
        steroidsStats.put("Heal", -35);
        String[] steroidsFunctions = {"Strengthen", "Heal"};
        card steroids = new card("Life", "Steroids", steroidsFunctions, steroidsStats, 2);




        HashMap<String, Integer> forceOfNatureStats = new HashMap<>();
        forceOfNatureStats.put("Damage", 40);
        forceOfNatureStats.put("Heal", 40);
        String[] forceOfNatureFunctions = {"Damage", "Heal"};
        card forceOfNature = new card("Life", "Force of nature", forceOfNatureFunctions, forceOfNatureStats, 4);






        // lightning cards
        HashMap<String, Integer> lightningStormStats = new HashMap<>();
        lightningStormStats.put("Damage", 4);
        lightningStormStats.put("MultiStrike", 3);
        String[] lightningStormFunctions = {"Damage", "MultiStrike"};
        card lightningStrom = new card("Elec", "Lightning Storm", lightningStormFunctions, lightningStormStats, 1);




        HashMap<String, Integer> zapStats = new HashMap<>();
        zapStats.put("Damage", 4);
        String[] zapFunctions = {"Damage"};
        card zap = new card("Elec", "Zap", zapFunctions, zapStats, 0);




        HashMap<String, Integer> thunderSlamStats = new HashMap<>();
        thunderSlamStats.put("Damage", 24);
        String[] thunderSlamFunctions = {"Damage"};
        card thunderSlam = new card("Elec", "Thunder Slam", thunderSlamFunctions, thunderSlamStats, 2);




        HashMap<String, Integer> forkedLightningStats = new HashMap<>();
        forkedLightningStats.put("Damage", 24);
        forkedLightningStats.put("Area", 1);
        String[] forkedLightningFunctions = {"Damage", "Area"};
        card forkedLightning = new card("Elec", "Forked Lightning", forkedLightningFunctions, forkedLightningStats, 3);




        HashMap<String, Integer> shockingShieldStats = new HashMap<>();
        shockingShieldStats.put("Damage", 2);
        shockingShieldStats.put("Area", 1);
        shockingShieldStats.put("Block", 12);
        String[] shockingShieldFunctions = {"Damage", "Area", "Block"};
        card shockingShield = new card("Elec", "Shocking Shield", shockingShieldFunctions, shockingShieldStats, 1);




    }








   /*
   List of cards


   Strike - 1 cost deals 10 damage - +Strike+ - 1 cost do 17 damage










    */
} 

