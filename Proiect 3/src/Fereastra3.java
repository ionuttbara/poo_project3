import javax.swing.*;

public class Fereastra3 {
    JFrame frame3 = new JFrame("Fereastra Produse");
    private JTextField textField1;
    private JList listeProduse;
    private JButton AdaugareButton;
    private JPanel FereastraProduse;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel Pret;

    public Fereastra3 (){
        frame3.setDefaultCloseOperation(3);
        frame3.setContentPane(this.FereastraProduse);
        frame3.setSize (700,700);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
