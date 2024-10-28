public class player{

    private int health;
    private int maxHealth;

    private int level;

    public player(int health, int level){
        this.health = health;
        this.level = level;
        maxHealth = health;
    }

    public void takeDamage(int damage){
        health -= damage;
        if(health==0){
            death();
        }
    }

    public int getHealth(){
        return health;
    }

    public int getLevel(){
        return level;
    }
    public void death(){
        System.out.println("You have died   :Ɛ");
        System.out.println("RIP bozo");
        System.exit(0);
    }
    @Override
    public String toString(){
        return "health: " + health + "/"+maxHealth+"level: "+level;
    }
}