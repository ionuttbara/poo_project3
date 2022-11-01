import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Fereastra3 implements IQuantity{
    JFrame frame3 = new JFrame("Fereastra Produse");
    private JTextField Numetxt;
    private JList listeProduse;
    private JButton AdaugareButton;
    private JPanel FereastraProduse;
    private JTextField Cunt;
    private JTextField Prettxt;
    private JLabel Pret;
    private ArrayList<Produs> arr1=new ArrayList<Produs>();
    public Fereastra3 (){
        frame3.setDefaultCloseOperation(3);
        frame3.setContentPane(this.FereastraProduse);
        frame3.setSize (700,700);
        frame3.setVisible(true);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AdaugareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nume=Numetxt.getText();
                int Pret=Integer.parseInt(Prettxt.getText());
                int Cantitate=Integer.parseInt(Cunt.getText());
                Produs prd=new Produs(Nume,Pret,Cantitate);
                arr1.add(prd);
                refreshList();


            }
        });

    }
    private void refreshList() {

        listeProduse.setListData(arr1.toArray());

    }
}
