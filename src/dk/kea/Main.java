package dk.kea;

public class Main {

    public static void main(String[] args) {
        Star sun = new Star("Sun");
        Planet earth = new Planet("Earth", sun);
    }
}
