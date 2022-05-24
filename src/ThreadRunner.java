
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
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
public class ThreadRunner extends Thread{
    private String name0, name1, name2, name3, name4;
    private double speed;
    private JTextArea txtA1;
    private JButton btnC;
    private JButton btnB;
   
    public ThreadRunner(String name0,String name1, String name2, String name3, String name4, JTextArea txtA1, JButton btnC, JButton btnB){
        this.name0 = name0;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.txtA1 = txtA1;
        this.btnC = btnC;
        this.btnB = btnB;
        Runner startRun = new Runner();
        speed = startRun.getSpeed();
        this.start();
    }
    Runnable r1 = new Runnable(){
        @Override
        public void run() {
            try{
            double newSpeed = speed = Math.random()*30;
            double renov = newSpeed * 1000;
            int lestSpeed = (int)renov;
            Thread.sleep(lestSpeed);
            int welcome = lestSpeed/1000;
            txtA1.append("\n"+name0+" llegó en: "+welcome+" segundos...");
            } catch(Exception e){
            System.out.println(e);
            }
        }
    };
    Runnable r2 = new Runnable(){
        @Override
        public void run() {
            try{
            double newSpeed = speed = Math.random()*30;
            double renov = newSpeed * 1000;
            int lestSpeed = (int)renov;
            Thread.sleep(lestSpeed);
            int welcome = lestSpeed/1000;
            txtA1.append("\n"+name1+" llegó en: "+welcome+" segundos...");
            } catch(Exception e){
            System.out.println(e);
            }
        }
    };
    Runnable r3 = new Runnable(){
        @Override
        public void run() {
            try{
            double newSpeed = speed = Math.random()*30;
            double renov = newSpeed * 1000;
            int lestSpeed = (int)renov;
            Thread.sleep(lestSpeed);
            int welcome = lestSpeed/1000;
            txtA1.append("\n"+name2+" llegó en: "+welcome+" segundos...");
            } catch(Exception e){
            System.out.println(e);
            }
        }
    };
    Runnable r4 = new Runnable(){
        @Override
        public void run() {
            try{
            double newSpeed = speed = Math.random()*30;
            double renov = newSpeed * 1000;
            int lestSpeed = (int)renov;
            Thread.sleep(lestSpeed);
            int welcome = lestSpeed/1000;
            txtA1.append("\n"+name3+" llegó en: "+welcome+" segundos...");
            } catch(Exception e){
            System.out.println(e);
            }
        }
    };
    Runnable r5 = new Runnable(){
        @Override
        public void run() {
            try{
            double newSpeed = speed = Math.random()*30;
            double renov = newSpeed * 1000;
            int lestSpeed = (int)renov;
            Thread.sleep(lestSpeed);
            int welcome = lestSpeed/1000;
            txtA1.append("\n"+name4+" llegó en: "+welcome+" segundos...");
            } catch(Exception e){
            System.out.println(e);
            }
        }
    };
    public void start(){
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        btnC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                t5.stop();
            }
        });
        btnB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                t5.stop();
            }
        });
    }
}