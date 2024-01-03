/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programs;

/**
 *
 * @author COMLAB101
 */
import java.util.HashMap;

public class Programs {

public static void main(String[] args) {



HashMap<String, String> programs = new HashMap<String, String>();


programs.put("BSIT", "Bachelor of Science in Information Technology");

programs.put("BSCS", "Bachelor of Science in Computer Science");

programs.put("BSIS", "Bachelor of Science in Information Systems");



System.out.println("Keys: " + programs.keySet());


programs.remove("BSIT");


if (programs.containsKey("BSCpE")) {

System.out.println("The map contains the key BSCpE");

} 

}

}