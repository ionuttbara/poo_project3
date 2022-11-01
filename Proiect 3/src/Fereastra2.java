import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fereastra2 {
    JFrame frame2 = new JFrame("Fereastra Magazin");

    private JTextField stradaTextField;
    private JTextField orasTextField;
    private JTextField numarTextField;
    private JList list1;
    private JButton butonDeConfirmareButton;
    private JTextField textField4;
    private JButton buttonCheckMagOKButton;
    private JPanel FereastraMagazin;
    public Fereastra2 (){
        frame2.setDefaultCloseOperation(3);
        frame2.setContentPane(this.FereastraMagazin);
        frame2.setSize (700,700);
        frame2.setVisible(true);
        // conditii buton2
        buttonCheckMagOKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame2.dispose();
                new Fereastra3();
            }
        });
    }

}