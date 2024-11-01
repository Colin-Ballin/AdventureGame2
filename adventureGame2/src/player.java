public class player{

    private int health;
    private int maxHealth;

    private int level;
    private int armour;
    private int damage;

    public player(int health, int level){
        this.health = health;
        this.level = level;
        maxHealth = health;
        armour = 0;
        damage = 0;
    }

    public void takeDamage(int damage) {
        if (armour == 0){
            health -= damage;
            if (health == 0) {
                death();
            }
    }
        else{
            damage -= armour;
            if(damage > 0){
                health -= damage;
                if (health == 0) {
                    death();
                }
            }
        }
    }
    public void heal(int x){
        health += x;
        if(health>maxHealth){
            health = maxHealth;
        }
    }

    public int getHealth(){
        return health;
    }
    public void addArmour(int num){
        armour += num;
    }
    public int getArmour(){
        return armour;
    }
    public void gainDamage(int num){
        damage += num;
    }
    public int getDamage(){
        return damage;
    }
    public int getLevel(){
        return level;
    }
    public void addLevel(){
        level ++;
    }
    public void death(){
        System.out.println("You have died   :Ɛ");
        System.out.println("RIP bozo");
        System.exit(0);
    }
    @Override
    public String toString(){
        return "health: " + health + "/"+maxHealth+" level: "+level;
    }
}