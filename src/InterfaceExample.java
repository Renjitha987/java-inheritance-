interface Power {

    void turnOn();
}

interface Volume {

    void increaseVolume();
}

class TV implements Power, Volume {

    TV() {
        System.out.println("TV constructor");
    }

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void increaseVolume() {
        System.out.println("Volume increased");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        TV t = new TV();

        t.turnOn();
        t.increaseVolume();
    }
}