class Device {
    protected int battery;

    public Device() {
        this.battery = 100;
    }

    public void displayBattery() {
        System.out.println("Battery remaining: " + battery);
        if (battery < 10) {
            System.out.println("Low Battery!  Please charge your device!");
        }
    }
}
