import javax.swing.*;

public class Main {
    Main() {
        Screen screen = new Screen(400, 400);
        screen.setVisible(true);
        screen.repaint();
    }

    public static void main(String[] args) {
        new Main();
    }
}