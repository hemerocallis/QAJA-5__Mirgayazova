public class Tank {

    int position;

    public Tank() {
        this.position = 0;
    }

    void goForward(int delta) {
        this.position += delta;
    }

    void goBackward(int delta) {
        this.position -= delta;
    }

    void printPosition() {
        System.out.println("The Tank is at " + this.position + " now.");
    }
}
