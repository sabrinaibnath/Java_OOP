package event_handling_java;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;

public class SimpleMousePanel extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 200;
    private static final int SIZE = 10;
    private ArrayList<Rectangle2D> squares = new ArrayList<>();
    private Rectangle2D current = null;

    public SimpleMousePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                current = findSquare(e.getPoint());
                if (current == null) addSquare(e.getPoint());
            }

            public void mouseClicked(MouseEvent e) {
                current = findSquare(e.getPoint());
                if (current != null && e.getClickCount() >= 2) removeSquare(current);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                setCursor(findSquare(e.getPoint()) == null ? Cursor.getDefaultCursor() : 
                    Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }

            public void mouseDragged(MouseEvent e) {
                if (current != null) {
                    current.setFrame(e.getX() - SIZE / 2, e.getY() - SIZE / 2, SIZE, SIZE);
                    repaint();
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Clears the panel before drawing
        Graphics2D g2 = (Graphics2D) g;
        for (Rectangle2D square : squares) g2.draw(square);
    }

    private Rectangle2D findSquare(Point p) {
        for (Rectangle2D square : squares) {
            if (square.contains(p)) return square;
        }
        return null;
    }

    private void addSquare(Point p) {
        current = new Rectangle2D.Double(p.x - SIZE / 2, p.y - SIZE / 2, SIZE, SIZE);
        squares.add(current);
        repaint();
    }

    private void removeSquare(Rectangle2D square) {
        squares.remove(square);
        current = null;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Mouse Panel");
        frame.add(new SimpleMousePanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


