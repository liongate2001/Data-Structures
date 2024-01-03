/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.greetingprogram;

/**
 *
 * @author COMLAB101
 */
import java.util.Scanner;

import java.util.PriorityQueue;

public class GreetingProgram {

public static void main(String[] args) {

PriorityQueue<String> nicknames = new PriorityQueue<>();

Scanner sc = new Scanner(System.in);

System.out.println("Enter the nicknames of 4 of your classmates:");

for (int i = 0; i < 4; i++) {

nicknames.add(sc.nextLine());


}

System.out.println("Press H to say Hi to each of them. ");

while (!nicknames.isEmpty()) {
 sc.nextLine();
 System.out.println("Hi " + nicknames.poll());

}

System.out.println("Done saying Hi");

}

}