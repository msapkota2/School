/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author IS287.674 Team 5
 */
public class SelectOnFocusTextField extends JTextField {

    {
        addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                SelectOnFocusTextField.this.select(0, getText().length());
            }

            @Override
            public void focusLost(FocusEvent e) {
                SelectOnFocusTextField.this.select(0, 0);
            }
        });
    }
}
