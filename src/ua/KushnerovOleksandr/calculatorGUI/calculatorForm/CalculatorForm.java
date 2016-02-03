package ua.KushnerovOleksandr.calculatorGUI.calculatorForm;

import ua.KushnerovOleksandr.calculatorGUI.constants.Constants;
import ua.KushnerovOleksandr.calculatorGUI.listener.Listener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Oleksandr Kushnerov on 03.02.2016.
 */
public class CalculatorForm extends JFrame implements Constants {
    Listener listener = new Listener(); //ссылка на класс слушателя

    public CalculatorForm() {//Конструктор

        setLayout(new BorderLayout()); // расположения на окне
        add(display, BorderLayout.NORTH); // Поле для ввода распологается вверху
        add(buttonPanel, BorderLayout.CENTER); //панель кнопор распологается по центру
        add(tast, BorderLayout.SOUTH); //поле для вывода примера распотогается в низу

        //Первый ряд кнопок
        buttonPanel.add(bClear); //добавление кнопки "AC" на панель кнопок
        buttonPanel.add(bSing); //добавление кнопки "-/+" на панель кнопок
        buttonPanel.add(bDiv); //добавление кнопки "/" на панель кнопок
        buttonPanel.add(bBack); //добавление кнопки "C" на панель кнопок

        // Второй ряд кнопок
        buttonPanel.add(b7); //добавление кнопки "7" на панель кнопок
        buttonPanel.add(b8); //добавление кнопки "8" на панель кнопок
        buttonPanel.add(b9); //добавление кнопки "9" на панель кнопок
        buttonPanel.add(bMult); //добавление кнопки "*" на панель кнопок

        // Третий ряд кнопок
        buttonPanel.add(b4); //добавление кнопки "4" на панель кнопок
        buttonPanel.add(b5); //добавление кнопки "5" на панель кнопок
        buttonPanel.add(b6); //добавление кнопки "6" на панель кнопок
        buttonPanel.add(bMinus); //добавление кнопки "-" на панель кнопок

        // Четвёртый ряд кнопок
        buttonPanel.add(b1); //добавление кнопки "1" на панель кнопок
        buttonPanel.add(b2); //добавление кнопки "2" на панель кнопок
        buttonPanel.add(b3); //добавление кнопки "3" на панель кнопок
        buttonPanel.add(bPlus); //добавление кнопки "+" на панель кнопок

        // Пятый ряд кнопок
        buttonPanel.add(b0); //добавление кнопки "0" на панель кнопок
        buttonPanel.add(bPoint); //добавление кнопки "." на панель кнопок
        buttonPanel.add(bSqrt); //добавление кнопки "sqrt" на панель кнопок
        buttonPanel.add(bResult); //добавление кнопки "=" на панель кнопок

        b0.addActionListener(listener); //Добавление слушателя на кнопку "0"
        b1.addActionListener(listener); //Добавление слушателя на кнопку "1"
        b2.addActionListener(listener); //Добавление слушателя на кнопку "2"
        b3.addActionListener(listener); //Добавление слушателя на кнопку "3"
        b4.addActionListener(listener); //Добавление слушателя на кнопку "4"
        b5.addActionListener(listener); //Добавление слушателя на кнопку "5"
        b6.addActionListener(listener); //Добавление слушателя на кнопку "6"
        b7.addActionListener(listener); //Добавление слушателя на кнопку "7"
        b8.addActionListener(listener); //Добавление слушателя на кнопку "8"
        b9.addActionListener(listener); //Добавление слушателя на кнопку "9"
        bClear.addActionListener(listener); //Добавление слушателя на кнопку "AC"
        bBack.addActionListener(listener); //Добавление слушателя на кнопку "C"
        bSing.addActionListener(listener); //Добавление слушателя на кнопку "-/+"
        bSqrt.addActionListener(listener); //Добавление слушателя на кнопку "sqrt"
        bPoint.addActionListener(listener); //Добавление слушателя на кнопку "."
        bPlus.addActionListener(listener); //Добавление слушателя на кнопку "+"
        bMinus.addActionListener(listener); //Добавление слушателя на кнопку "-"
        bMult.addActionListener(listener); //Добавление слушателя на кнопку "*"
        bDiv.addActionListener(listener); //Добавление слушателя на кнопку "/"
        bResult.addActionListener(listener); //Добавление слушателя на кнопку "="
    }
}
