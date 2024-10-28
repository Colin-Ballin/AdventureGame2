public class Encounter {
    private int difficulty;
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private String element;
    public Encounter(int diff, Enemy one, Enemy two, Enemy three, String element){
        difficulty = diff;
        enemy1 = one;
        enemy2 = two;
        enemy3 = three;
        this.element = element;
    }
    public int getDifficulty(){
        return difficulty;
    }
    public Enemy get1(){
        return enemy1;
    }
    public Enemy get2(){
        return enemy2;
    }
    public Enemy get3(){
        return enemy3;
    }
    public String getElement(){
        return element;
    }
    public static String getRandomElement(){
        int choice = (int)(Math.random()*5);
        if(choice == 0){
            return "rock";
        }
        else if(choice == 1){
            return "elec";
        }
        else if(choice == 2){
            return "aqua";
        }
        else if(choice == 3){
            return "life";
        }
        else{
            return "fire";
        }
    }
    @Override
    public String toString(){
        return ""+difficulty + ": "+ "Enemy1: "+enemy1.toString()+ "Enemy2: "+enemy2.toString()+ "Enemy3: "+enemy3.toString() + ": "+ element;
    }
}
