/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Mr. Wasir
 */

/*
description 
Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

 */
public class RotateImage {

    public static void main(String args[]) {
        RotateImage ri = new RotateImage();

        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ri.rotateImage(a);
    }

    private void rotateImage(int[][] a) {
        int len = a.length;
        int arr[][] = new int[len][len];
        int k = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                arr[j][k] = a[i][j];
            }
            k++;
        }
    }
}
