import javax.swing.*;
import java.awt.*;

public class SimpleGUI extends JFrame{
    private JLabel welcomeLabel;

    public static CardLayout cardLayout;
    public static JPanel mainPanel;
    private static boolean isGeese =false;
    private Geese newPanel;
    private Home homeScreen;


    public SimpleGUI() {
        super("QU-WACK A MOLE");
        init();
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Image image = toolkit.getImage("");
//        Cursor c = toolkit.createCustomCursor(image , new Point(getX(), getY()), "img");
//        setCursor (c);
    }

    private void init() {
        setTitle("Qu-wack a mole");
        setSize(615, 877);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        add(mainPanel);

        homeScreen = new Home();
//        add(homeScreen);
        newPanel = new Geese();
//        add(newPanel);
        mainPanel.add("pane1", homeScreen);
        mainPanel.add("pane2", newPanel);

        setVisible(true);
    }

    public static void setIsGeese(boolean isGeese2){
        isGeese = isGeese2;
    }
    public static boolean IsGeese(){
        return isGeese;
    }


}