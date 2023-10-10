// TODO: import Abstract Window Tool kit
import java.awt.*;

// TODO: import java swing
import javax.swing.*;

// TODO: import java swing JComponent
import javax.swing.JComponent;

// TODO: Create a Shape class
public class Shape {
    // TODO: Create a static class which extends JComponent
    static class ShapeDrawing extends JComponent {
        // TODO: Create a method with a parameter
        public void paint(Graphics g)
        {
            // TODO: import Object 2DGraphics from awt.Graphics.Graphics2D
            Graphics2D g2 = (Graphics2D) g;

            // TODO: Draw a rectangle and ad blue color
            g2.setColor(Color.BLUE);
            g2.drawRect(85, 150, 60, 200);
            g2.fillRect(85, 150, 60, 200);

            // TODO: Draw oval add orange color
            g2.setColor(Color.ORANGE);
            g2.drawOval(185, 235, 80, 220);
            g2.fillOval(185, 235, 80, 220);

            // TODO: Draw Triangle add color yellow
            g.setColor(Color.YELLOW);
            int x[] = {400, 400, 500};
            int y[] = {100, 200, 200};
            int numPoints = 3;
            g.drawPolygon(x, y, numPoints);
            g.fillPolygon(x, y, numPoints);
        }
    }

    // TODO: create a main
    public static void main(String[] args) {
        // TODO: import jframe object
        JFrame frame = new JFrame("My first JFrame");
        // TODO: set the size of the jframe
        frame.setSize(600, 600);
        // TODO: add default exit window operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO: add contet planel and add static method which extends JComponent
        frame.getContentPane().add(new ShapeDrawing ());
        // TODO: add set visible fame to be true
        frame.setVisible(true);
    }
}
