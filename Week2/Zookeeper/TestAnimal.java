public class TestAnimal {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();
        System.out.println("-------Gorilla Tests Begin-------");
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.displayEnergy();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.displayEnergy();
        gorilla.climb();
        gorilla.displayEnergy();
        System.out.println("-------Bat Tests Begin-------");
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.displayEnergy();
        bat.eatHumans();
        bat.eatHumans();
        bat.displayEnergy();
        bat.fly();
        bat.fly();
        bat.displayEnergy();
    }
}
