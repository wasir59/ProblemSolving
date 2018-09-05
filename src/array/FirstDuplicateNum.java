/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Wasir
 */

/*
 description

 Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which 
 the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number 
 for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.

 Example

 For a = [2, 1, 3, 5, 3, 2], the output should be
 firstDuplicate(a) = 3.

 There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.

 */
public class FirstDuplicateNum {

    public static void main(String args[]) {
        int arr[] = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
        FirstDuplicateNum dn = new FirstDuplicateNum();
        int value = dn.firstDuplicate(arr);
        System.out.println(value);
    }

    private int firstDuplicate(int[] a) {
        // first solution 
        for (int i = 1; i < a.length; i++) {
            int test = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] == test) {
                    return test;
                }
            }
        }
        return -1;
        
        
        /*
        second solution 
         
        Set<Integer> value = new HashSet<>();
        
        for(int val: a){
            if(value.contains(val)){
                return val;
            }
            else{
                value.add(val);
            }
        }
        return -1;
        
        */
    }
}
