package ua.KushnerovOleksandr.calculatorGUI.constants;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Oleksandr Kushnerov on 03.02.2016.
 */
public interface Constants {
    JTextArea display = new JTextArea(3, 3);//ОбЪявление поля для ввода чисел рамзмером 3х3
    JPanel buttonPanel = new JPanel(new GridLayout(5, 4)); //ОбЪявление панели для кнопок назмером 5х4 (5 рядов 4 кнопки в каждом ряде)
    JButton bClear = new JButton("AC");//ОбЪявление кнопки
    JButton bSing = new JButton("-/+");//ОбЪявление кнопки
    JButton bPoint = new JButton(".");//ОбЪявление кнопки
    JButton bSqrt = new JButton("sqrt");//ОбЪявление кнопки
    JButton b0 = new JButton("0");//ОбЪявление кнопки
    JButton b1 = new JButton("1");//ОбЪявление кнопки
    JButton b2 = new JButton("2");//ОбЪявление кнопки
    JButton b3 = new JButton("3");//ОбЪявление кнопки
    JButton b4 = new JButton("4");//ОбЪявление кнопки
    JButton b5 = new JButton("5");//ОбЪявление кнопки
    JButton b6 = new JButton("6");//ОбЪявление кнопки
    JButton b7 = new JButton("7");//ОбЪявление кнопки
    JButton b8 = new JButton("8");//ОбЪявление кнопки
    JButton b9 = new JButton("9");//ОбЪявление кнопки
    JButton bBack = new JButton("C");//ОбЪявление кнопки
    JButton bResult = new JButton("=");//ОбЪявление кнопки
    JButton bPlus = new JButton("+"); //ОбЪявление кнопки
    JButton bMinus = new JButton("-"); //ОбЪявление кнопки
    JButton bDiv = new JButton("/"); //ОбЪявление кнопки
    JButton bMult = new JButton("*"); //ОбЪявление кнопки
    JLabel tast = new JLabel("Условие примера");//ОбЪявление поля метки
}
