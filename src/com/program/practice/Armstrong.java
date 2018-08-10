package com.program.practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int num, number, temp, totalSum = 0;
		
		System.out.println("Enter 3 digit number");//371
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		number = num;
		while(num != 0) {
			temp = num % 10;
			totalSum = totalSum+temp*temp*temp;
			num = num / 10;
		}
		
		if(number == totalSum) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}
		/*int num, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number"); //371, 342
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number = number/10;
            
            
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");*/
    }

}
