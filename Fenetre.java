// code repris du TP2
package TP_note;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {
    
    public Fenetre()
    {
        super("Convert Celsius to Fahrenheit");
        
        build();
        
    }
    
    private void build(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,150);
        this.setLocationRelativeTo(null);
        setContentPane(buildContentPane());
        
    }
    
    private JPanel buildContentPane(){
        JPanel contentPane = (JPanel) this.getContentPane();
        
        contentPane.setLayout( null );
        
        JButton Bouton = new JButton("Convertir");
        Bouton.setBounds(5,90,180,50);
        contentPane.add(Bouton);
        
        JLabel label = new JLabel("Celsius");
        label.setBounds(175,20,160,50);
        contentPane.add(label);
        
        JLabel label2 = new JLabel(" Fahrenheit");
        label2.setBounds(190,80,160,70);
        contentPane.add(label2);
        
        JTextField textField = new JTextField();
        textField.setBounds(5,5,140,40);
        
        textField.setColumns(15);
        Bouton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                double a = Float.parseFloat(textField.getText());
                double n = (1.8); // pb cast
                System.out.println(i);
                double b = (i*n)+32;
                
                    String h = Double.toString(b);
                    
                    textField.setText(h);
                    contentPane.validate();
                }
            }
        );
        
        contentPane.add(textField);
        
        return contentPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
