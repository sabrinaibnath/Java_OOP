import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class MyFlowLayoutApplet extends Applet {

    public void init() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 4; i++) {
            add(new Button("Button #" + i));
        }
    }
}

