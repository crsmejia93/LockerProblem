package com.company;

public class Main {

    public static void main(String[] args) {
        /*****************************************************************************************
        *Write a program to simulate the following experiment. You have 100 closed lockers.
        * Start with the first locker and for every locker open it. Now, starting with the second locker,
        * for this locker and every second locker after that, if the locker is open, close it; if it is closed,
        * open it. Then, starting with the third locker, for this locker and every third locker after that,
        * if the locker is open, close it; if it is closed, open it. Continue with the nth locker changing the
        * “position” of every nth locker until n = 100. Print out the locker numbers that remain open.
        * What do you notice about the lockers that remain open?
        * *****************************************************************************************/

        //false - closed door
        //true - open door

        boolean[] lockers = new boolean[100];

        for(int i=1; i<=lockers.length; i++){
            for(int j=0; j<lockers.length;j+=i){
                if(lockers[j]==false) {
                    lockers[j] = true;
                }else if(lockers[j]==true){
                    lockers[j]=false;
                }
            }
        }
        for(int i=0; i<lockers.length; i++){
            if(lockers[i]){
                System.out.printf("Locker %d is open.\n",i);
            }
        }
    }
}
