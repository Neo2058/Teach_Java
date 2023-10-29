import Work_With_Function_And_Metod.Function_Method;

import java.util.Scanner;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

       /* JFrame greetingWindow = new JFrame("Приветствие!");
        JButton clickOnMe = new JButton("Привет друг!");
        clickOnMe.setBounds(65,50,150,50);
        greetingWindow.add(clickOnMe);
        greetingWindow.setSize(300,200);
        greetingWindow.setLayout(null);
        greetingWindow.setVisible(true);*/

        //Первое представление метода класса, который ничего не возвращает
        Function_Method nothing_to_return;
        nothing_to_return = new Function_Method();
        nothing_to_return.the_counter();

        //Второе представление метода класса, который ничего не должен возвращать, но принимает и считает числа
        nothing_to_return.the_counter_two_parametrs(4, 7);

        //Возврат целочисленного значения для дальнейшего использования в программе
        int a = nothing_to_return.the_counter_two_backstape_parametrs();
        System.out.println("I took this parametr into the variable \"a\" " + a);

        System.out.println("What is your name?");
        Scanner reading_console = new Scanner(System.in);
        String name = reading_console.next();
        nothing_to_return.the_counter_two_backstape_parametrs_without(12, 15, name);

        int result = nothing_to_return.the_counter_two_backstape_parametrs_without(7, 7);
    }

}