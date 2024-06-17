public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();

        myPhone.playGame();
        myPhone.playGame();
        myPhone.playGame();
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();
        System.out.println("----------Battery < 10% Test----------");
        myPhone.makeCall();
        myPhone.charge();
        myPhone.playGame();
        myPhone.playGame();
        System.out.println("----------Play Game < 25% Test----------");
        myPhone.playGame();
        myPhone.charge();
        System.out.println("----------Battery life stopping at 100% Test----------");
        myPhone.charge();
    }
}
