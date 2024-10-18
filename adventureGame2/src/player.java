public class player{

    private int health;

    private int level;

    private String name;

    public player(int health, int level, String name){
        this.health = health;
        this.level = level;
        this.name = name;
    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public int getHealth(){
        return health;
    }

    public int getLevel(){
        return level;
    }

    public String getName(){
        return name;
    }

}