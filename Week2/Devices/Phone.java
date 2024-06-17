class Phone extends Device {
    public void makeCall() {
        System.out.println("Making a call.");
        battery -= 5;
        displayBattery();
    }

    public void playGame() {
        if (battery < 25) {
            System.out.println("Cannot play game. Battery life is too low.");
            return;
        }
        System.out.println("Playing a game.");
        battery -= 20;
        displayBattery();
    }

    public void charge() {
        System.out.println("Charging the phone.");
        battery += 50;
        if (battery > 100) {  // Ensure battery does not exceed 100
            battery = 100;
        }
        displayBattery();
    }
}