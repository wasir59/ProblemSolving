/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

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
        int arr[] = {2, 1, 3, 5, 3, 2};
        FirstDuplicateNum dn = new FirstDuplicateNum();
        dn.firstDuplicate(arr);
    }

    private void firstDuplicate(int[] arr) {
        int tmpArr[] = new int[arr.length - 1];
        System.out.println(tmpArr.length);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmpArr[i] = arr[i];
                continue;
            }
            for (int j = 0; j < tmpArr.length; j++) {
                if (tmpArr[j] == arr[i]) {

                }
            }
        }
    }
}
