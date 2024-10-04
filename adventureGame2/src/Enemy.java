public class Enemy {
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

}
