package com.program.practice;

import java.util.StringTokenizer;

public class MinDistanceBetweenTwoWords {

	public static void main(String[] args) {
		
		String str1 = "ABC is a d XYZ and ABC dffd XYZ are two distinct words";
		String str2 = "ABC";
		String str3 = "XYZ";
		
		int dist = findDistanceBetweenWords(str1,str2,str3);
		System.out.println(dist);
	}
	
	public static int findDistanceBetweenWords(String inputBody, String pair1, String pair2) {
        if (inputBody.isEmpty() || pair1.isEmpty() || pair2.isEmpty()) {
            return -1;
        }
        if (pair1.equals(pair2)) {
            return 0;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(inputBody, " ");
        int distance = 0, globalDistance = Integer.MAX_VALUE;
        String token;
        while (stringTokenizer.hasMoreTokens()) {
            token = stringTokenizer.nextToken();
            if (token.equals(pair1)) {
                distance = 0;
            } else if (token.equals(pair2)) {
                globalDistance = Math.min(distance, globalDistance);
            }
            distance++;
        }
        if (globalDistance == Integer.MAX_VALUE || globalDistance == 0) {
            return -1;
        } else {
            return globalDistance;
        }
    }

}
