import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Magazin.Magazin;

public class Fereastra2 {
    JFrame frame2 = new JFrame("Fereastra Magazin");

    private JTextField stradaTextField;
    private JTextField orasTextField;
    private JTextField numarTextField;
    private JList list1;
    private JButton butonDeConfirmareButton;
    private JButton buttonCheckMagOKButton;
    private JPanel FereastraMagazin;
    private JLabel Validare;
    public ArrayList<Magazin> arr=new ArrayList<Magazin>();

    public Fereastra2() {
        frame2.setDefaultCloseOperation(3);
        frame2.setContentPane(this.FereastraMagazin);
        frame2.setSize(700, 700);
        frame2.setVisible(true);
        // conditii buton2
        buttonCheckMagOKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame2.dispose();
                new Fereastra3();
            }
        });


        butonDeConfirmareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Oras = orasTextField.getText();
                String Strada = stradaTextField.getText();
                String Numar = numarTextField.getText();
                if (Oras.length()>30){
                    Validare.setText("Oras infezabil");
                }
                else {
                    if (Strada.length() > 200) {
                        Validare.setText("Strada si mai infezabila");
                    } else
                    {
                        Validare.setText("valid!");
                        Magazin mag=new Magazin(Oras,Strada,Numar);
                        arr.add(mag);
                        refreshList();



                    }
                }

            }
        });

    }

    private void refreshList() {

        list1.setListData(arr.toArray());

    }


}