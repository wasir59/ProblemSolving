/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author wasir
 */
public class FirstNotRepeatingCharacter {

    public static void main(String args[]) {
        String s = "abacabad";
        FirstNotRepeatingCharacter fnrc = new FirstNotRepeatingCharacter();
        char val = fnrc.firstNotRepeatingCharacter(s);

        System.out.println(val);
    }

    private char firstNotRepeatingCharacter(String s) {

        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(c[i] + " " + s.indexOf(c[i]) + " = " + s.lastIndexOf(c[i]));
            if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
                return c[i];
            }
        }
        return '_';

//        if(s.length()==1){
//            return s.charAt(0);
//        }
//        char[] arr = s.toCharArray();
//
//        
//        char val = '_';
//        boolean isDup = false;
//        for (int i = 0; i < arr.length-1; i++) {
//            val = arr[i];
//            isDup = false;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == arr[i] && i != j) {
//                    isDup = true;
//                    val = '_';
//                    break;
//                }
//            }
//            if (!isDup) {
//                break;
//            }
//        }
//        return val;
    }

}
