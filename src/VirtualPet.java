public class VirtualPet{

    // Attributes
    private String dogName;
    private int hunger;
    private int thirst;
    private int hygiene;
    private int energy;
    private int attention;
    private int bladder;


    // Constructor
    public VirtualPet(String dogName) {
        this.dogName = dogName;
        this.hunger = 1;
        this.thirst = 1;
        this.hygiene = 1;
        this.energy = 1;
        this.attention = 1;
        this.bladder = 1;
    }

    // Getters and Setters
    public String getDogName() {
        return dogName;
    }


    public void setDogName(String dogName) {
        this.dogName = dogName;
    }


    public int getHunger() {
        return hunger;
    }


    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public int getThirst() {
        return thirst;
    }


    public void setThirst(int thirst) {
        this.thirst = thirst;
    }


    public int getHygiene() {
        return hygiene;
    }


    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }


    public int getEnergy() {
        return energy;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public int getAttention() {
        return attention;
    }


    public void setAttention(int attention) {
        this.attention = attention;
    }


    public int getBladder() {
        return bladder;
    }


    public void setBladder(int bladder) {
        this.bladder = bladder;
    }

    // methods
    public void changeHunger(int hunger){
        this.hunger += hunger;
    }


    public void changeThirst(int thirst){
        this.thirst += thirst;
    }


    public void changeAttention(int attention){
        this.attention += attention;
    }


    public void changeBladder(int bladder){
        this.bladder += bladder;
    }


    public void changeEnergy(int energy){
        this.energy += energy;
    }


    public void changeHygiene(int hygiene){
        this.hygiene += hygiene;
    }


    public void tick(){
        this.hunger += 1;
        this.thirst +=1;
        this.attention +=1;
        this.bladder += 1;
        this.energy += 1;
        this.hygiene +=1;
    }

}