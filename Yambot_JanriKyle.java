/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yambot_janrikyle;

/**
 *
 * @author COMLAB101
 */
import java.util.LinkedList;

import java.util.Queue;

import java.util.Scanner;

public class Yambot_JanriKyle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Queue<String> movies = new LinkedList<String>();

Queue<String> snacks = new LinkedList<String>();

// Asking user to input movies

System.out.println("Enter movie Name 1 of 3: ");

movies.offer(input.nextLine());

System.out.println("Enter movie Name 2 of 3: ");

movies.offer(input.nextLine());

System.out.println("Enter movie Name 3 of 3: ");

movies.offer(input.nextLine());

// Asking user to input snacks

System.out.println("Enter snack Name 1 of 3: ");

snacks.offer(input.nextLine());

System.out.println("Enter snack Name 2 of 3: ");

snacks.offer(input.nextLine());

System.out.println("Enter snack Name 3 of 3: ");

snacks.offer(input.nextLine());

// Displaying movies and snacks available

System.out.println("Movies to watch are: " + movies + " Your Snacks available are: " + snacks);

// Removing snacks as they are consumed

System.out.println("Press S each time you finish a snack. ");

while(!snacks.isEmpty()) {

if(input.nextLine().equals("S")) {

snacks.remove();

if(snacks.isEmpty()) {

System.out.println("No more snacks");

} 

}
else {

System.out.println(snacks);
}


}

}

}