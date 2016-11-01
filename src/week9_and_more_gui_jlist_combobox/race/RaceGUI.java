package week9_and_more_gui_jlist_combobox.race;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * Created by clara on 11/1/2016.
 *
 * GUI version of the Week 3 program - calculate a training schedule for a
 * runner who wants to increase the distance they can run over a period of weeks.
 */


public class RaceGUI extends JFrame {
    private JPanel root;
    private JTextArea startDistanceTextArea;
    private JTextArea targetDistanceTextArea;
    private JTextArea percentIncreaseTextArea;
    private JButton calculateButton;
    private JList<String> distanceList;
    private DefaultListModel<String> distanceListModel;

    RaceGUI () {

        setContentPane(root);

        distanceListModel = new DefaultListModel<>();
        distanceList.setModel(distanceListModel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Fetch data from 3 JTextFields, validate
                String errorMessage = null;
                double startDistance = 0 , targetDistance = 0 , percentIncrease = 0;
                try {
                    startDistance = Double.parseDouble(startDistanceTextArea.getText());
                    targetDistance = Double.parseDouble(targetDistanceTextArea.getText());
                    percentIncrease = Double.parseDouble(percentIncreaseTextArea.getText());

                    if (percentIncrease < 0 || percentIncrease > 100) {
                        errorMessage = "Please enter a positive percent value, between 0 and 100";
                    }

                } catch (NumberFormatException nfe) {
                    errorMessage = "Please enter numerical values";
                }

                //Show error dialog if errorMessage has been set
                if (errorMessage != null) {

                    JOptionPane.showMessageDialog(RaceGUI.this, errorMessage);

                }

                //Otherwise, data was validated successfully, calculate the schedule and display.

                else {

                    //Clear any data in the JList's model, which will also clear the GUI
                    distanceListModel.clear();

                    //Calculate the schedule, based on the data entered
                    ArrayList<String> schedule = raceSchedule(startDistance, targetDistance, percentIncrease);

                    //And add to the list model
                    for (String s : schedule) {
                        distanceListModel.addElement(s);
                    }
                }
            }
        });

        pack();
        setVisible(true);

    }



    private ArrayList<String> raceSchedule(double startDistance, double targetDistance, double percentIncrease) {

        ArrayList<String> results = new ArrayList<String>();

        double increase = 1 + (percentIncrease / 100);

        int weekCounter = 1;

        results.add("In the first week, you run " + startDistance +  " mile(s)");

        while (startDistance < targetDistance) {
            startDistance = startDistance * increase;
            weekCounter++;
            results.add(String.format("For week %d you need to run %.2f miles", weekCounter, startDistance));
        }

        return results;
    }

}
