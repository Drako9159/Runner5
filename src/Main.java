

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class Main {

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(new FlatLightFlatIJTheme());     
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        new AthleticRaceInterface();
    }
    
}
