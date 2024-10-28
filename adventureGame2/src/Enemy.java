import java.util.HashMap;

public class Enemy {
    public static HashMap<String, Enemy> enemies = new HashMap<>();
    private int health;
    private int damage;
    private String name;
    private String element;
    private int level;
    public Enemy(int health, int damage, String name, String element, int level){
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.element = element;
        this.level = level;
    }
    public int getDamage(){
        return damage;
    }
    public int getHealth(){
        return health;
    }
    public void takeDamage(int num){
        health -= num;
    }
    public String getName(){
        return name;
    }
    public String getElement(){
        return element;
    }
    public int getLevel(){
        return level;
    }
    @Override
    public String toString(){
        return "health:" + health + " Damage:"+ damage + " Name:" + name + " Element:" + element + " Level:"+ level;
    }
    public static void initEnemies() {

        //Null Enemy
        Enemy none = new Enemy(0, 0, "", "", 0);
        enemies.put("", none);
        //Fire Enemies
        Enemy fire1 = new Enemy(10, 10, "Volcanic Slug", "fire", 1);
        enemies.put("fire1", fire1);
        Enemy fire2 = new Enemy(10, 10, "Fire Snake", "fire", 2);
        enemies.put("fire2", fire2);
        Enemy fire3 = new Enemy(10, 10, "Burning Man", "fire", 3);
        enemies.put("fire3", fire3);
        Enemy fire4 = new Enemy(10, 10, "Hell Hound", "fire", 4);
        enemies.put("fire4", fire4);
        Enemy fire5 = new Enemy(10, 10, "Wizard", "fire", 5);
        enemies.put("fire5", fire5);
        Enemy fire6 = new Enemy(10, 10, "Fire Elemental", "fire", 6);
        enemies.put("fire6", fire6);
        Enemy fire7 = new Enemy(10, 10, "Groudon", "fire", 7);
        enemies.put("fire7", fire7);
        Enemy fire8 = new Enemy(10, 10, "Demon", "fire", 8);
        enemies.put("fire8", fire8);
        Enemy fire9 = new Enemy(10, 10, "Magma Golem", "fire", 9);
        enemies.put("fire9", fire9);
        Enemy fire10 = new Enemy(10, 10, "Fire Dragon", "fire", 10);
        enemies.put("fire10", fire10);

        //Life Enemies

        Enemy life1 = new Enemy(10, 10, "Pixie", "life", 1);
        enemies.put("life1", life1);
        Enemy life2 = new Enemy(10, 10, "Nymph", "life", 2);
        enemies.put("life2", life2);
        Enemy life3 = new Enemy(10, 10, "Gnome", "life", 3);
        enemies.put("life3", life3);
        Enemy life4 = new Enemy(10, 10, "Goblin", "life", 4);
        enemies.put("life4", life4);
        Enemy life5 = new Enemy(10, 10, "Dryad", "life", 5);
        enemies.put("life5", life5);
        Enemy life6 = new Enemy(10, 10, "Giant Fungus", "life", 6);
        enemies.put("life6", life6);
        Enemy life7 = new Enemy(10, 10, "Old Sage", "life", 7);
        enemies.put("life7", life7);
        Enemy life8 = new Enemy(10, 10, "Elven King", "life", 8);
        enemies.put("life8", life8);
        Enemy life9 = new Enemy(10, 10, "Ent", "life", 9);
        enemies.put("life9", life9);
        Enemy life10 = new Enemy(10, 10, "Guardian of Gaia", "life", 10);
        enemies.put("life10", life10);

        //Rock Enemies

        Enemy rock1 = new Enemy(10, 10, "Living Rock", "rock", 1);
        enemies.put("rock1", rock1);
        Enemy rock2 = new Enemy(10, 10, "Rock Mole", "rock", 2);
        enemies.put("rock2", rock2);
        Enemy rock3 = new Enemy(10, 10, "Gargoyle", "rock", 3);
        enemies.put("rock3", rock3);
        Enemy rock4 = new Enemy(10, 10, "Rock Troll", "rock", 4);
        enemies.put("rock4", rock4);
        Enemy rock5 = new Enemy(10, 10, "Solder of Stone", "rock", 5);
        enemies.put("rock5", rock5);
        Enemy rock6 = new Enemy(10, 10, "Rock Golem", "rock", 6);
        enemies.put("rock6", rock6);
        Enemy rock7 = new Enemy(10, 10, "Meteor Man", "rock", 7);
        enemies.put("rock7", rock7);
        Enemy rock8 = new Enemy(10, 10, "Medusa", "rock", 8);
        enemies.put("rock8", rock8);
        Enemy rock9 = new Enemy(10, 10, "Sand Worm", "rock", 9);
        enemies.put("rock9", rock9);
        Enemy rock10 = new Enemy(10, 10, "Stone Talus", "rock", 10);
        enemies.put("rock10", rock10);

        //Electricity Enemies

        Enemy elec1 = new Enemy(10, 10, "Electric Spirit", "elec", 1);
        enemies.put("elec1", elec1);
        Enemy elec2 = new Enemy(10, 10, "Electric Eel", "elec", 2);
        enemies.put("elec2", elec2);
        Enemy elec3 = new Enemy(10, 10, "Twister", "elec", 3);
        enemies.put("elec3", elec3);
        Enemy elec4 = new Enemy(10, 10, "Harpie", "elec", 4);
        enemies.put("elec4", elec4);
        Enemy elec5 = new Enemy(10, 10, "Pikachu", "elec", 5);
        enemies.put("elec5", elec5);
        Enemy elec6 = new Enemy(10, 10, "Storm Elemental", "elec", 6);
        enemies.put("elec6", elec6);
        Enemy elec7 = new Enemy(10, 10, "Thunder Lord", "elec", 7);
        enemies.put("elec7", elec7);
        Enemy elec8 = new Enemy(10, 10, "Mecha Suit", "elec", 8);
        enemies.put("elec8", elec8);
        Enemy elec9 = new Enemy(10, 10, "Sky Wyvern", "elec", 9);
        enemies.put("elec9", elec9);
        Enemy elec10 = new Enemy(10, 10, "Storm Ruler", "elec", 10);
        enemies.put("elec10", elec10);

        //Water Enemies

        Enemy aqua1 = new Enemy(10, 10, "Magikarp", "aqua", 1);
        enemies.put("aqua1", aqua1);
        Enemy aqua2 = new Enemy(10, 10, "Sea Drake", "aqua", 2);
        enemies.put("aqua2", aqua2);
        Enemy aqua3 = new Enemy(10, 10, "Aquatic Cultist", "aqua", 3);
        enemies.put("aqua3", aqua3);
        Enemy aqua4 = new Enemy(10, 10, "Great White", "aqua", 4);
        enemies.put("aqua4", aqua4);
        Enemy aqua5 = new Enemy(10, 10, "Ice Knight", "aqua", 5);
        enemies.put("aqua5", aqua5);
        Enemy aqua6 = new Enemy(10, 10, "Colossal Squid", "aqua", 6);
        enemies.put("aqua6", aqua6);
        Enemy aqua7 = new Enemy(10, 10, "Ice Queen", "aqua", 7);
        enemies.put("aqua7", aqua7);
        Enemy aqua8 = new Enemy(10, 10, "Megalodon", "aqua", 8);
        enemies.put("aqua8", aqua8);
        Enemy aqua9 = new Enemy(10, 10, "Frost Giant", "aqua", 9);
        enemies.put("aqua9", aqua9);
        Enemy aqua10 = new Enemy(10, 10, "King of the Sea", "aqua", 10);
        enemies.put("aqua10", aqua10);

    }
}
