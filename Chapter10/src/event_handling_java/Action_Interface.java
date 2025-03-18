package event_handling_java;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.*;

class MyFrame_A {
    JFrame frame;
    JButton button1, button2;
    JPanel panel;

    MyFrame_A() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        // Define actions
        Action yellowAction = new AbstractAction("Yellow") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.YELLOW);
            }
        };

        Action blueAction = new AbstractAction("Blue") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        };

        // Initialize buttons with actions
        button1 = new JButton(yellowAction);
        button2 = new JButton(blueAction);

        // Set up the panel
        panel = new JPanel();
        panel.setSize(new Dimension(200, 200));
        panel.setBackground(Color.GRAY);
        panel.add(button1);
        panel.add(button2);

        // Add panel to frame and set position
        frame.add(panel);
        panel.setBounds(100, 100, 200, 200);  // Position the panel within the frame
        frame.setVisible(true);
    }
}

public class Action_Interface {
    public static void main(String[] args) {
        MyFrame_A frame = new MyFrame_A();
    }
}
