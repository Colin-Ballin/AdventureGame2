

import java.util.Stack;
import java.util.HashMap;


public class card {

    public static HashMap<String, card> cards = new HashMap<>();

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

    @Override
    public String toString(){
        String description = "";
        int len = functions.length;
        for(int x = 0; x < len; x ++){
            description = description + functions[x] + ": " + useValues.get(functions[x]) + " ";
        }

        return " Element: " + element + " Name: " + name + " " + description;
    }
    public static void makingCards(){
        // Basic cards
        HashMap<String, Integer> strikeStats = new HashMap<>();
        strikeStats.put("Damage", 100);
        String[] strikeFunctions = {"Damage"};
        card Strike = new card("N/A", "Strike", strikeFunctions, strikeStats, 1);
        cards.put("Strike", Strike);



        HashMap<String, Integer> blockStats = new HashMap<>();
        blockStats.put("Block", 80);
        String[] blockFunctions = {"Block"};
        card Block = new card("N/A", "Block", blockFunctions, blockStats, 1);
        cards.put("Block", Block);




        // Null Cards


        HashMap<String, Integer> bombStats = new HashMap<>();
        bombStats.put("Damage", 500);
        String[] bombFunctions = {"Damage"};
        card Bomb = new card("N/A", "Bomb", bombFunctions, bombStats, 2);
        cards.put("Bomb", Bomb);



        // Fire cards


        HashMap<String, Integer> emberStats = new HashMap<>();
        emberStats.put("Damage", 50);
        String[] emberFunctions = {"Damage"};
        card Ember = new card("Fire", "Ember", emberFunctions, emberStats, 0);
        cards.put("Ember", Ember);



        HashMap<String, Integer> flameStats = new HashMap<>();
        flameStats.put("Damage", 1);
        flameStats.put("Burn", 10);
        String[] flameFunctions = {"Damage", "Burn"};
        card Flame = new card("Fire", "Flame", flameFunctions, flameStats, 1);
        cards.put("Flame", Flame);



        HashMap<String, Integer> fireballStats = new HashMap<>();
        fireballStats.put("Damage", 200);
        fireballStats.put("Burn", 30);
        String[] fireballFunctions = {"Damage", "Burn"};
        card Fireball = new card("Fire", "Fireball", fireballFunctions, fireballStats, 2);
        cards.put("Fireball", Fireball);



        HashMap<String, Integer> wallOfFireStats = new HashMap<>();
        wallOfFireStats.put("Block", 300);
        wallOfFireStats.put("Burn", 40);
        String[] wallOfFireFunctions = {"Damage", "Burn"};
        card WallOfFire = new card("Fire", "Wall Of Fire", wallOfFireFunctions, wallOfFireStats, 3);
        cards.put("WallOfFire", WallOfFire);



        HashMap<String, Integer> eruptionStats = new HashMap<>();
        eruptionStats.put("Damage", 1000);
        eruptionStats.put("Burn", 100);
        String[] eruptionFunctions = {"Damage", "Burn"};
        card Eruption = new card("Fire", "Eruption", eruptionFunctions, eruptionStats, 4);
        cards.put("Eruption", Eruption);



        HashMap<String, Integer> blazingHellStats = new HashMap<>();
        blazingHellStats.put("Damage", 2000);
        blazingHellStats.put("Burn", 300);
        String[] blazingHellFunctions = {"Damage", "Burn"};
        card BlazingHell = new card("Fire", "Blazing Hell", blazingHellFunctions, blazingHellStats, 5);
        cards.put("BlazingHell", BlazingHell);

        //Rock cards


        HashMap<String, Integer> rockThrowStats = new HashMap<>();
        rockThrowStats.put("Damage", 40);
        String[] rockThrowFunctions = {"Damage"};
        card RockThrow = new card("Rock", "Rock Throw", rockThrowFunctions, rockThrowStats, 0);
        cards.put("RockThrow", RockThrow);



        HashMap<String, Integer> stoneStrikeStats = new HashMap<>();
        stoneStrikeStats.put("Damage", 120);
        String[] stoneStrikeFunctions = {"Damage"};
        card StoneStrike = new card("Rock", "Stone Strike", stoneStrikeFunctions, stoneStrikeStats, 1);
        cards.put("StoneStrike", StoneStrike);



        HashMap<String, Integer> stalagmiteSmashStats = new HashMap<>();
        stalagmiteSmashStats.put("Damage", 240);
        String[] stalagmiteSmashFunctions = {"Damage"};
        card StalagmiteSmash = new card("Rock", "Stalagmite Smash", stalagmiteSmashFunctions, stalagmiteSmashStats, 2);
        cards.put("StalagmiteSmash", StalagmiteSmash);



        HashMap<String, Integer> sturdyDefenceStats = new HashMap<>();
        sturdyDefenceStats.put("Block", 300);
        String[] sturdyDefenceFunctions = {"Block"};
        card SturdyDefence = new card("Rock", "Sturdy Defence", sturdyDefenceFunctions, sturdyDefenceStats, 3);
        cards.put("SturdyDefence", StalagmiteSmash);



        HashMap<String, Integer> boulderThrowStats = new HashMap<>();
        boulderThrowStats.put("Damage", 500);
        String[] boulderThrowFunctions = {"Damage"};
        card BoulderThrow = new card("Rock", "Boulder Throw", boulderThrowFunctions, boulderThrowStats, 3);
        cards.put("BoulderThrow", BoulderThrow);



        // Aqua cards


        HashMap<String, Integer> splashStats = new HashMap<>();
        splashStats.put("Damage", 40);
        String[] splashFunctions = {"Damage"};
        card Splash = new card("Aqua", "Splash", splashFunctions, splashStats, 0);
        cards.put("Splash", Splash);

        HashMap<String, Integer> jetStreamStats = new HashMap<>();
        jetStreamStats.put("Damage", 120);
        String[] jetStreamFunctions = {"Damage"};
        card JetStream = new card("Aqua", "Jet Stream", jetStreamFunctions, jetStreamStats, 1);
        cards.put("JetStream", JetStream);



        HashMap<String, Integer> iceSpikeStats = new HashMap<>();
        iceSpikeStats.put("Damage", 300);
        iceSpikeStats.put("Chill", 50);
        String[] iceSpikeFunctions = {"Damage", "Chill"};
        card IceSpike = new card("Aqua", "Ice Spike", iceSpikeFunctions, iceSpikeStats, 3);
        cards.put("IceSpike", IceSpike);



        HashMap<String, Integer> iceWallStats = new HashMap<>();
        iceWallStats.put("Block", 500);
        iceWallStats.put("Chill", 20);
        String[] iceWallFunctions = {"Block", "Chill"};
        card IceWall = new card("Aqua", "Ice Wall", iceWallFunctions, iceWallStats, 3);
        cards.put("IceWall", IceWall);



        HashMap<String, Integer> freezeStats = new HashMap<>();
        freezeStats.put("Chill", 100);
        String[] freezeFunctions = {"Chill"};
        card Freeze = new card("Aqua", "Freeze", freezeFunctions, freezeStats, 2);
        cards.put("Freeze", Freeze);



        HashMap<String, Integer> permafrostStats = new HashMap<>();
        permafrostStats.put("Damage", 750);
        permafrostStats.put("Chill", 150);
        String[] permafrostFunctions = {"Damage", "Chill"};
        card Permafrost = new card("Aqua", "Permafrost", permafrostFunctions, permafrostStats, 5);
        cards.put("Permafrost", Permafrost);





        // Life cards


        HashMap<String, Integer> bandageStats = new HashMap<>();
        bandageStats.put("Heal", 100);
        String[] bandageFunctions = {"Heal"};
        card Bandage = new card("Life", "Bandage", bandageFunctions, bandageStats, 1);
        cards.put("Bandage", Bandage);


        HashMap<String, Integer> poisonDartStats = new HashMap<>();
        poisonDartStats.put("Damage", 60);
        poisonDartStats.put("Poison", 30);
        String[] poisonDartFunctions = {"Damage", "Poison"};
        card PoisonDart = new card("Life", "Poison Dart", poisonDartFunctions, poisonDartStats, 1);
        cards.put("PoisonDart", PoisonDart);



        HashMap<String, Integer> throwACobraStats = new HashMap<>();
        throwACobraStats.put("Damage", 150);
        throwACobraStats.put("Poison", 80);
        String[] throwACobraFunctions = {"Damage", "Poison"};
        card ThrowACobra = new card("Life", "Throw A Cobra", throwACobraFunctions, throwACobraStats, 2);
        cards.put("ThrowACobra", ThrowACobra);



        HashMap<String, Integer> trenStats = new HashMap<>();
        trenStats.put("Strengthen", 40);
        String[] trenFunctions = {"Strengthen"};
        card Tren = new card("Life", "Tren", trenFunctions, trenStats, 1);
        cards.put("Tren", Tren);

        HashMap<String, Integer>  naturesBlessingStats = new HashMap<>();
        naturesBlessingStats.put("Heal", 500);
        String[] naturesBlessingFunctions = {"Heal"};
        card NaturesBlessing = new card("Life", "Natures Blessing", naturesBlessingFunctions, naturesBlessingStats, 2);
        cards.put("NaturesBlessing", NaturesBlessing);


        HashMap<String, Integer> steroidsStats = new HashMap<>();
        steroidsStats.put("Strengthen", 150);
        steroidsStats.put("Heal", -350);
        String[] steroidsFunctions = {"Strengthen", "Heal"};
        card Steroids = new card("Life", "Steroids", steroidsFunctions, steroidsStats, 2);
        cards.put("Steroids", Steroids);



        HashMap<String, Integer> forceOfNatureStats = new HashMap<>();
        forceOfNatureStats.put("Damage", 400);
        forceOfNatureStats.put("Heal", 400);
        String[] forceOfNatureFunctions = {"Damage", "Heal"};
        card ForceOfNature = new card("Life", "Force of nature", forceOfNatureFunctions, forceOfNatureStats, 4);
        cards.put("ForceOfNature", Strike);





        // lightning cards
        HashMap<String, Integer> lightningStormStats = new HashMap<>();
        lightningStormStats.put("Damage", 120);
        String[] lightningStormFunctions = {"Damage"};
        card LightningStorm = new card("Elec", "Lightning Storm", lightningStormFunctions, lightningStormStats, 1);
        cards.put("LightningStorm", LightningStorm);



        HashMap<String, Integer> zapStats = new HashMap<>();
        zapStats.put("Damage", 40);
        String[] zapFunctions = {"Damage"};
        card Zap = new card("Elec", "Zap", zapFunctions, zapStats, 0);
        cards.put("Zap", Zap);



        HashMap<String, Integer> thunderSlamStats = new HashMap<>();
        thunderSlamStats.put("Damage", 240);
        String[] thunderSlamFunctions = {"Damage"};
        card ThunderSlam = new card("Elec", "Thunder Slam", thunderSlamFunctions, thunderSlamStats, 2);
        cards.put("ThunderSlam", ThunderSlam);



        HashMap<String, Integer> forkedLightningStats = new HashMap<>();
        forkedLightningStats.put("Damage", 480);
        String[] forkedLightningFunctions = {"Damage"};
        card ForkedLightning = new card("Elec", "Forked Lightning", forkedLightningFunctions, forkedLightningStats, 3);
        cards.put("ForkedLightning", ForkedLightning);



        HashMap<String, Integer> shockingShieldStats = new HashMap<>();
        shockingShieldStats.put("Damage", 20);

        shockingShieldStats.put("Block", 200);
        String[] shockingShieldFunctions = {"Damage", "Block"};
        card ShockingShield = new card("Elec", "Shocking Shield", shockingShieldFunctions, shockingShieldStats, 1);
        cards.put("ShockingShield", ShockingShield);

    }


    public static String getRandomCard(){
        int x = (int)(Math.random() * 30) + 1;


        switch(x){
            case 1:
                return "Ember";
            case 2:
                return "Flame";
            case 3:
                return "Fireball";
            case 4:
                return "WallOfFire";
            case 5:
                return "Eruption";
            case 6:
                return "BlazingHell";
            case 7:
                return "RockThrow";
            case 8:
                return "StalagmiteSmash";
            case 9:
                return "SturdyDefence";
            case 10:
                return "BoulderThrow";
            case 11:
                return "Splash";
            case 12:
                return "JetStream";
            case 13:
                return "IceSpike";
            case 14:
                return "IceWall";
            case 15:
                return "Freeze";
            case 16:
                return "Permafrost";
            case 17:
                return "Bandage";
            case 18:
                return "PoisonDart";
            case 19:
                return "ThrowACobra";
            case 20:
                return "Tren";
            case 21:
                return "NaturesBlessing";
            case 22:
                return "Steroids";
            case 23:
                return "ForceOfNature";
            case 24:
                return "Zap";
            case 25:
                return "LightningStorm";
            case 26:
                return "ThunderSlam";
            case 27:
                return "ShockingShield";
            case 28:
                return "ForkedLightning";
            default:
                return "Bomb";





        }
    }







   /*
   List of cards


   Strike - 1 cost deals 10 damage - +Strike+ - 1 cost do 17 damage










    */
}