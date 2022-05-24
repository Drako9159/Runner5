
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class AthleticRaceInterface extends JFrame{
    JFrame showRunner;
    JButton btnA, btnB, btnC, btnD;
    JLabel lblA, lblB, lblC;
    JTextField txt0;
    JTextArea txtA0, txtA1;
    int count = 0;
    AthleticRaceInterface(){
        setTitle("Carrera atlética");
        setSize(500, 460);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);  
        
        lblA = new JLabel("Registrar corredor");
        lblA.setBounds(15, 0, 255, 40);
        
        txt0 = new JTextField();
        txt0.setBounds(15, 40, 255, 40);
        
        btnA = new JButton("Registrar");
        btnA.setBounds(285, 40, 180, 39);
        
        lblB = new JLabel("Corredores registrados");
        lblB.setBounds(15, 90, 255, 40);
      
        txtA0 = new JTextArea();
        txtA0.setEnabled(false);
        txtA0.append("Registra 5 corredores");
        txtA0.setBounds(15, 125, 450, 105);
        
        lblC = new JLabel("Resultados");
        lblC.setBounds(15, 230, 255, 40);
        
        txtA1 = new JTextArea();
        txtA1.setEnabled(false);
        txtA1.setBounds(15, 265, 300, 140);
        
        btnB = new JButton("Iniciar");
        btnB.setBounds(330, 265, 138, 39);
        btnC = new JButton("Reiniciar");
        btnC.setBounds(330, 315, 138, 39);
        btnD = new JButton("Terminar");
        btnD.setBounds(330, 365, 138, 39);
        
        getContentPane().add(lblA);
        getContentPane().add(txt0);
        getContentPane().add(btnA);
        getContentPane().add(lblB);
        getContentPane().add(txtA0);
        getContentPane().add(lblC);
        getContentPane().add(txtA1);
        getContentPane().add(btnB);
        getContentPane().add(btnC);
        getContentPane().add(btnD);
        
        String[] runner = new String[5];
        Runner nameRunner = new Runner();
        btnA.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String runners = txt0.getText().toString();
                if(count == 5){
                    JOptionPane.showMessageDialog(null, "Lista llena", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    
                } else if(runners.equals("")){                
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    runner[count] = runners;
                    int toAppend = count + 1;
                    txtA0.append("\n"+ toAppend +" - "+runners);
                    txt0.setText(null);
                    count++;
                }
            }
        });
        btnB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(runner[0] != null && runner[1] != null && runner[2] != null && runner[3] != null && runner[4] != null){
                    txtA1.setText("Corriendo...");
                    Runner toRunner = new Runner();
                    toRunner.setRunner(runner[0],runner[1],runner[2],runner[3],runner[4], txtA1, btnC, btnB);
                    //txtA1.append("Corriendo...");
                } else {
                    JOptionPane.showMessageDialog(null, "Faltan correadores", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        btnC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count = 0;
                txtA0.setText("Registra 5 corredores");  
                txtA1.setText(null);  
            }
        });
        btnD.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void setTxtA0(String name){
        ArrayList runner = new ArrayList<Runner>();
        runner.add(name+count);
        txtA0.append("\n"+name);
        System.out.println(name+count);
    }
}
