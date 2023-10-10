import java.awt.*;
import javax.swing.*;
import javax.swing.JComponent;

public class Shape {
    static class ShapeDrawing extends JComponent {

        public void paint(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.BLUE);
            g2.drawRect(85, 150, 60, 200);
            g2.fillRect(85, 150, 60, 200);

            g2.setColor(Color.ORANGE);
            g2.drawOval(185, 235, 80, 220);
            g2.fillOval(185, 235, 80, 220);

            g.setColor(Color.YELLOW);
            int x[] = {400, 400, 500};
            int y[] = {100, 200, 200};
            int numPoints = 3;
            g.drawPolygon(x, y, numPoints);
            g.fillPolygon(x, y, numPoints);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ShapeDrawing ());
        frame.setVisible(true);
    }
}
