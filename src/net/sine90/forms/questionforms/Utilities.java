/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sine90.forms.questionforms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JLabel;

/**
 *
 * @author rohini
 */
public class Utilities {
    Timer timer;
    int time_remaining;
    JLabel timer_label;
    int seconds=59;
    public void startTimer(final int time,final JLabel timer_label)
    {      this.time_remaining=time-1;
            this.timer_label=timer_label;
         timer= new Timer(1000,new CountdownTimer()); 
         timer.start();
    }
    class CountdownTimer implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(time_remaining>=0 && seconds>=0)
            {
                timer_label.setText(time_remaining+" : "+seconds--);
            
            if(seconds==0)
            {
                time_remaining--;
                seconds=59;
            } 
            }
            else{
                timer_label.setText("Time's up!!!");
                 timer.stop();
            }
        }     
    }
    
}
