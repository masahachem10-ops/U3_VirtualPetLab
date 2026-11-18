// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYr;
    private int ageMonth;

    public VirtualPet(String name){
        this.name = name;
        weight = 5;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + "'s Infromation: \n Energy: " + energyLevel +
                "\n Happiness: " + happinessLevel + "\n Weight: " + weight +
                "\n Age: " + ageMonth + " months and " + ageYr + " years";
    }

    public void feed(){
        if(energyLevel < 10){
            energyLevel++;
        }
        weight++;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void play(){
        if(happinessLevel < 10){
            happinessLevel++;
        }
        if(weight > 5){
            weight--;
        }
    }

    public void updateStatus(){
        if(energyLevel > 0){
            energyLevel--;
        }
        if(happinessLevel > 0){
            happinessLevel--;
        }
        
        ageMonth++;

        if(ageMonth == 12){
            ageYr++;
            ageMonth = 0;
        }
    }
}
