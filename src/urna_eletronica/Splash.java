/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urna_eletronica;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import org.netbeans.lib.awtextra.AbsoluteConstraints;  
import org.netbeans.lib.awtextra.AbsoluteLayout;  

/**
 *
 * @author kbelo
 */
public class Splash extends JWindow{
    
           AbsoluteLayout absoluto;
           AbsoluteConstraints  absimage,absbarra;
           ImageIcon image;
           JLabel jlabel;
           JProgressBar barra;
    public Splash(){
        
           absoluto = new AbsoluteLayout();
          
       
        absimage = new AbsoluteConstraints(0,0);
        absbarra = new AbsoluteConstraints(-49,208);
        jlabel = new  JLabel();
        image = new ImageIcon(this.getClass().getResource("/imgs/h.jpg"));
       
       
        
        
        jlabel.setIcon(image);
        barra = new JProgressBar();
        barra.setPreferredSize(new Dimension(265,10));
        
        this.getContentPane().setLayout(absoluto);
        this.getContentPane().add(jlabel,absimage);
         this.getContentPane().add(barra,absbarra);
         
         
       //  this.setVisible(true);
       new Thread(){
           
        @Override
        public void run(){
            int i = 0;
            while (i<101){
              barra.setValue(i);
              barra.setBackground(Color.red);
              if(i<100){
              barra.setForeground(Color.green);
              }else {
                  
              }
                i++;
                try
                 {
                    sleep(60);
                    
                }catch (InterruptedException ex)
                     
                {
                     Logger.getLogger(Splash.class.getName()).log(Level.SEVERE,null,ex);
                }
                
             
            }
           Splash.this.dispose();
            Tela_bloqueio mostra = new Tela_bloqueio();
         mostra.setVisible(true);
        }
       }.start();
    this.pack();
   this.setLocationRelativeTo(null);
    
     
     
  
          
      }
}
  
               
    

       
               
           
        
        
      
    
    
  
       
        
    
    


