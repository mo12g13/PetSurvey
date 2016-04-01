package com.Momo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Momo Johnson on 3/31/2016.
 */
public class PetSurvey  extends JFrame{
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JCheckBox dogCheckBox;
    private JButton submitButton;
    private JPanel rootPanel;
    private JButton surveyResultButton;
    private JButton quitButton;
    private boolean hasFish;
    protected boolean hasdog;
    protected boolean hascat;


   // private void createUIComponents() {
        // TODO: place custom component creation code here
   PetSurvey(){
            super("Pet Sury application");
            setContentPane(rootPanel);
            setPreferredSize(new Dimension(400, 500));
            submitButton.setPreferredSize(new Dimension(30, 50));
            dogCheckBox.setPreferredSize(new Dimension(30, 50));
            quitButton.setPreferredSize(new Dimension(30, 50));
            surveyResultButton.setPreferredSize(new Dimension(50, 100));


            pack();
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //}
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String dog = (hasdog)?" a dog ": "no dogs";
                    String cat =(catCheckBox.isSelected())?"a cat": "no caats";
                    String fish;
                    if(hasFish == true){
                        fish = "a fish";

                    }
                    else{
                        fish = "no fish";
                    }

                    surveyResultButton.setText("user has  "+ dog + " user has  "+ cat + " user has "+ fish);

                }
            });
            fishCheckBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     hasFish =fishCheckBox.isSelected();
                }
            });
            catCheckBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    hascat = catCheckBox.isSelected();

                }
            });
            dogCheckBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    hasdog = dogCheckBox.isSelected();

                }
            });


            quitButton.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    System.exit(0);

                }
            });
       quitButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
   }


}
