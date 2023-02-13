import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    Screen(int x, int y) {
        super();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension size = getSize();

        int d = Math.min(size.width, size.height);
        int x = (size.width - d)/2;
        int y = (size.height - d)/2;

        g.fillOval(x+100, y, 100, 100);
        g.setColor(Color.black);
        g.drawOval(x, y, 100, 100);
    }

}
