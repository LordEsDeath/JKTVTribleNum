/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktvtriblenum;

import java.util.Scanner;

/**
 *
 * @author kostj
 */
public class JKTVTribleNum {

    public static void main(String[] args) {
        /*X - Будет число которое мы вводим*/
        System.out.println("Здравствуй. Набери рандомное трёх-значное число: ");
        Scanner scan = new Scanner(System.in);
        /*Из числа делаем переменую*/
        int a = scan.nextInt();
        System.out.println("Вы ввели число: " + a);
        System.out.println("Единица: " + a % 10);/*Последнее число*/
        System.out.println("Десятков: " + a / 10 %10);/*Второе число число*/
    }
}
