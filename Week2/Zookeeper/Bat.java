public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300;
    }
    public void fly() {
        if (energyLevel == 0) {
            System.out.println("The Bat is out of energy and must eat!");
        }
        else {
            System.out.println("The Bat takes flight!");
            energyLevel -= 50;
        }
    }
    public void eatHumans() {
        System.out.println("The Bat snacks on some humans!");
        energyLevel += 25;

    }
    public void attackTown() {
        if (energyLevel == 0) {
            System.out.println("The Bat is out of energy and must eat!");
        } else {
            System.out.println("The Bat attacks a nearby village!");
            energyLevel -= 100;
        }
    }
}
