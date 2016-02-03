package ua.KushnerovOleksandr.calculatorGUI.listener;

import ua.KushnerovOleksandr.calculatorGUI.constants.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Oleksandr Kushnerov on 03.02.2016.
 */
public class Listener implements ActionListener, Constants {
    double firstNumber = 0;
    String operation = "+";

    @Override
    public void actionPerformed(ActionEvent e) {
        //Действие при нажатии на кнопку "+"
        if (e.getSource() == bPlus) {
            firstNumber = Double.valueOf(display.getText());
            tast.setText(String.valueOf(firstNumber) + "+");
            display.setText("");
            operation = "+";
        }
        //Действие при нажатии на кнопку "-"
        if (e.getSource() == bMinus) {
            firstNumber = Double.valueOf(display.getText());
            tast.setText(String.valueOf(firstNumber) + "+");
            display.setText("");
            operation = "-";
        }
        //Действие при нажатии на кнопку "*"
        if (e.getSource() == bMult) {
            firstNumber = Double.valueOf(display.getText());
            tast.setText(String.valueOf(firstNumber) + "+");
            display.setText("");
            operation = "*";
        }
        //Действие при нажатии на кнопку "/"
        if (e.getSource() == bDiv) {
            firstNumber = Double.valueOf(display.getText());
            tast.setText(String.valueOf(firstNumber) + "+");
            display.setText("");
            operation = "/";
        }
        //Действие при нажатии на кнопку "0"
        if (e.getSource() == b0) {
            display.setText(display.getText() + "0");
        }
        //Действие при нажатии на кнопку "1"
        if (e.getSource() == b1) {
            display.setText(display.getText() + "1");
        }
        //Действие при нажатии на кнопку "2"
        if (e.getSource() == b2) {
            display.setText(display.getText() + "2");
        }
        //Действие при нажатии на кнопку "3"
        if (e.getSource() == b3) {
            display.setText(display.getText() + "3");
        }
        //Действие при нажатии на кнопку "4"
        if (e.getSource() == b4) {
            display.setText(display.getText() + "4");
        }
        //Действие при нажатии на кнопку "5"
        if (e.getSource() == b5) {
            display.setText(display.getText() + "5");
        }
        //Действие при нажатии на кнопку "6"
        if (e.getSource() == b6) {
            display.setText(display.getText() + "6");
        }
        //Действие при нажатии на кнопку "7"
        if (e.getSource() == b7) {
            display.setText(display.getText() + "7");
        }
        //Действие при нажатии на кнопку "8"
        if (e.getSource() == b8) {
            display.setText(display.getText() + "8");
        }
        //Действие при нажатии на кнопку "9"
        if (e.getSource() == b9) {
            display.setText(display.getText() + "9");
        }
        //Действие при нажатии на кнопку "."
        if (e.getSource() == bPoint) {
            display.setText(display.getText() + ".");
        }
        //Действие при нажатии на кнопку "-/+"
        if (e.getSource() == bSing) {
            firstNumber = Double.valueOf(display.getText());
            tast.setText(String.valueOf(firstNumber * -1) + "");
            display.setText(String.valueOf(firstNumber * -1) + "");
        }
        //Действие при нажатии на кнопку "AC"
        if (e.getSource() == bClear) {
            display.setText("");
            tast.setText("Условие примера");
            firstNumber = 0;
        }
        //Действие при нажатии на кнопку "sqrt"
        if (e.getSource() == bSqrt) {
            firstNumber = Double.valueOf(display.getText());
            display.setText(String.valueOf(Math.sqrt(firstNumber)));
        }
        //Действие при нажатии на кнопку "C"
        if (e.getSource() == bBack) {
            String displayTemp = display.getText();
            if (displayTemp.length() == 0) {
                JOptionPane.showMessageDialog(null, "Поле для ввода числа пустое!");
            } else {
                display.setText(displayTemp.substring(0, displayTemp.length() - 1));
                tast.setText("Условие примера");
            }
        }
        //Действие при нажатии на кнопку "="
        if (e.getSource() == bResult) {
            try {
                double secondNumber = Double.valueOf(display.getText());
                if ("+".equals(operation)) {
                    display.setText(String.valueOf((firstNumber + secondNumber) + ""));
                    tast.setText(String.valueOf(firstNumber) + "+" + String.valueOf(secondNumber) + "=" + String.valueOf((firstNumber + secondNumber) + ""));
                }
                if ("-".equals(operation)) {
                    display.setText(String.valueOf((firstNumber - secondNumber) + ""));
                    tast.setText(String.valueOf(firstNumber) + "-" + String.valueOf(secondNumber) + "=" + String.valueOf((firstNumber - secondNumber) + ""));
                }
                if ("*".equals(operation)) {
                    display.setText(String.valueOf((firstNumber * secondNumber) + ""));
                    tast.setText(String.valueOf(firstNumber) + "*" + String.valueOf(secondNumber) + "=" + String.valueOf((firstNumber * secondNumber) + ""));
                }
                if ("/".equals(operation)) {
                    if (secondNumber == 0) {
                        JOptionPane.showMessageDialog(null, "На ноль делить пока нельзя!");
                        display.setText("");
                        tast.setText("");
                    } else {
                        display.setText(String.valueOf((firstNumber / secondNumber) + ""));
                        tast.setText(String.valueOf(firstNumber) + "/" + String.valueOf(secondNumber) + "=" + String.valueOf((firstNumber / secondNumber) + ""));

                    }
                }

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Введите число!");
                display.setText("");
            }
        }
    }
}
