/*
 * Draw a staircase of height N in the format given below.
For example:
     #
    ##
   ###
  ####
 #####
######
Staircase of height 6, note that last line has 0 spaces before it.
*/

package com.program.practice;

import java.util.Scanner;

public class DrawStaircase {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		sc.close();*/
		int num = 5;
		for(int j = 0; j < num; j++) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i < num - j ? " " : "#");
			}
			System.out.println();
		}
		/*Scanner sc = new Scanner(System.in);
        int num  = Integer.parseInt(sc.nextLine());
        sc.close();
        for(int j = 0; j < num; j++){
            for(int i = 1; i <= num; i++){
                System.out.print(i < num-j ? " " : "#");
            }
            System.out.println("");
        }*/

	}

}
