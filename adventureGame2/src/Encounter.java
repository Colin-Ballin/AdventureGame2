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
}
