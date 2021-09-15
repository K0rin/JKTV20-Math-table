/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20.math.table;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Владимир
 */
public class JKTV20MathTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это тест по таблице умножения");
        int point = 0;
        for(int attempt = 0; attempt < 5; attempt++){
            int number1=random.nextInt(9 - 1 + 1) + 1;
            int number2=random.nextInt(9 - 1 + 1) + 1;
            int itog=number1 * number2;
            System.out.println("Сколько будет "+number1+" * "+number2);
            int userAnswer = scanner.nextInt();
            if(itog == userAnswer){
                System.out.println("Правильно");
                point++;
            }else{
                System.out.println("неправильно.");
            }
        }
        System.out.println("Твоя оценка "+point);
        if (point == 5){
            System.out.println("Ты молодец");
        }else if(point == 4 || point ==3){
            System.out.println("Надо бы еще подучить");
        }else{
            System.out.println("Беги учить таблицу умножения");
        }
    }
    
}
