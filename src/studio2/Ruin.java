public class Ruin {
    public static void main(String[] args) {
    int startAmount=10;
    double winChance=0.5;
    int winLimit=20;
    int totalSimulations=0;
    int totalPlays=1;
    int currentAmount=startAmount;

    for (totalSimulations = 0; totalSimulations<=7; totalSimulations++) {
    totalPlays=0;
    currentAmount=startAmount;
        while (currentAmount > 0 && startAmount < winLimit) {
        
            if (Math.random() > winChance){
            currentAmount++;
            }
            else {
                currentAmount--;
            }
            totalPlays++;
            }
            System.out.println("For Day " + totalSimulations + ": " + totalPlays + " Games were played. The day was a ");

            }
            }
        }
