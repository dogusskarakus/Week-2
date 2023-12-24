import java.util.Random;
public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;

    }
    int run() {
        if (isCheck()) {
            boolean firstFighterStarts = new Random().nextBoolean();


            if (firstFighterStarts) {
                System.out.println(this.f1.name + " starts the first round!");
            } else {
                System.out.println(this.f2.name + " starts the first round!");
            }


            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-----NEW ROUND-----");

                if (firstFighterStarts) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin())
                        break;

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin())
                        break;
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin())
                        break;

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin())
                        break;
                }

                System.out.println(this.f1.name + " Health: " + this.f1.health + " , " + this.f2.name + " Health: " + this.f2.health);
            }
        } else {
            System.out.println("Fighters do not match in weight class."); // Weight class mismatch message
        }
        return 0;
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " wins.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " wins.");
            return true;
        }
        return false;
    }






}
