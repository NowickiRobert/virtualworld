/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Nowik
 */
public class VirtualWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean gameOn = true;
         World world = new World(20,20);
         Pozycja pos;
         pos = new Pozycja(0,0);
         world.dodajOrganizm(pos, "Czlowiek");
         Organizm czlowiek = world.znajdzPozycje(pos);
         
         Random losowa = new Random();
         
         //dodawanie zwierzat losowo
         for(int i=0; i<15;i++){         
            pos = new Pozycja(losowa.nextInt(world.rozmiar.getX()), losowa.nextInt(world.rozmiar.getY()));
            world.dodajOrganizm(pos, world.losujZwierze());

            //blok testowy
            //world.dodajOrganizm(pos, "CyberOwca");
         }
         
         //dodawanie roslin losowo
         for(int i=0; i<5;i++){         
            pos = new Pozycja(losowa.nextInt(world.rozmiar.getX()), losowa.nextInt(world.rozmiar.getY()));
            world.dodajOrganizm(pos, world.losujRosline());

            //world.dodajOrganizm(pos, "BarszczS");
            //world.dodajOrganizm(pos, "Guarana");
         }
         
               
            EventQueue.invokeLater(()->{
            JFrame frame = new Frame(world);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setFocusCycleRoot(true);
            });            
                      
         
    }    
}
