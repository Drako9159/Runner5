
import javax.swing.JButton;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class Runner {
    private double speed;
    public void setRunner(String name0, String name1, String name2, String name3, String name4, JTextArea txtA1, JButton btnC, JButton btnB){
        new ThreadRunner(name0, name1, name2, name3, name4, txtA1, btnC, btnB);
    }
    public double getSpeed(){
        return speed;     
    }
}
