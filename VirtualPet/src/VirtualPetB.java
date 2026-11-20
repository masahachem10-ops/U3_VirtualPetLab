// Part B

public class VirtualPetB {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYr;
    private int ageMonth;

    public VirtualPetB(String name){
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

    public void feed(Food food){
        if(energyLevel < 10){
            energyLevel += food.getEnergyIncrease();
        }
        if(happinessLevel < 10){
            happinessLevel += food.getHappinessIncrease();
        }
        weight += food.getWeightGain();
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public boolean play(Game game){
        boolean isWon = game.isWinner();
        if(isWon){
            if(happinessLevel + game.getHappinessIncr() <= 10){
                happinessLevel += game.getHappinessIncr();
            }
            else{
                if(happinessLevel > 0){
                    happinessLevel--;
                }
            }
        }
        if(weight- game.getWeightDecr() >= 5){
            weight -= game.getWeightDecr();
        }

        return isWon;
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