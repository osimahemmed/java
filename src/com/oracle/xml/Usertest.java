/*package com.oracle.xml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Usertest {


	public static void main(String[] args) {
		User user1 = new User();
        user1.setUserName("osim"); 
        User user2 = new User(); 
        user2.setUserName("Abhi"); 
        User user3 = new User(); 
        user3.setUserName("Ram"); 
        User user4 = new User(); 
        user4.setUserName("Bibhas"); 

        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println("list is "+ list);
           
        Collections.sort(list, new UserNameComparator());
        System.out.println(list.size());
        
        for(int i=0;i<list.size(); i++){
        	
        	User usr = (User)list.get(i);
        	System.out.println(usr.getUserName());
        	
        }
        Collections.reverse(list);
        
        for(int l=0;l<list.size();l++){
        	User us = (User)list.get(l);
        	System.out.println(us.getUserName());
        }
        

	}

}
*/