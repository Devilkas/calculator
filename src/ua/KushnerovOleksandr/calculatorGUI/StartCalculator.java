package ua.KushnerovOleksandr.calculatorGUI;

import ua.KushnerovOleksandr.calculatorGUI.calculatorForm.CalculatorForm;

import javax.swing.*;

/**
 * Created by Oleksandr Kushnerov on 03.02.2016.
 */
public class StartCalculator {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm(); //Ссылка на класс Reader
        form.setVisible(true); //Видемость окна
        form.setBounds(300, 300, 300, 300); //Размер окно
        form.setResizable(false); //Фиксация размера
        form.setLocationRelativeTo(null); //Позиция окна по центру
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Остановить работу програмы х
        form.setTitle("Калькулятор"); // Заголовок окна
    }
}
