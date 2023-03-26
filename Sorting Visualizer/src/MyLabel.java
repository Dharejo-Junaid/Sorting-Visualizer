import javax.swing.*;
import java.awt.*;

public class MyLabel extends JLabel {

    MyLabel(String title) {
        super(title);
        this.setPreferredSize(new Dimension(100, 30));
        this.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
    }
}
