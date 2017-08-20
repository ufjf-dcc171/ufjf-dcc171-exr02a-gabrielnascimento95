/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr2a_labiii;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Gabriel_Nascimento
 */
public class janela extends JFrame{
    private final JLabel numero1 = new JLabel("Número 1: ");
    private final JLabel numero2 = new JLabel("Número 2: ");
    private final JLabel resultado = new JLabel("");
    private final JTextField campo1 = new JTextField(10);
    private final JTextField campo2 = new JTextField(10);
    private int n1, n2;
    
    public janela() throws HeadlessException{
        super("Soma");
         setLayout(new FlowLayout(FlowLayout.CENTER));
         add(numero1);
         add(campo1);
         add(numero2);
         add(campo2);
         add(resultado);
         
         campo1.addActionListener(new numeroUmNext());
         campo2.addActionListener(new numeroDoisEnd());
    }
    
    private class numeroUmNext implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            n1 = Integer.parseInt(campo1.getText());
            campo2.requestFocus();
        }
    }
    
    private class numeroDoisEnd implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            n2 = Integer.parseInt(campo2.getText());
            resultado.setText("A soma é: " + (n2+n1));
        }
    }
}
