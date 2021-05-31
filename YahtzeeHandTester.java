import java.util.*;

/*******************************************************************************
 *                            Assignment 5 -- Yahtzee hand  Object              *      
 *                                                                              *
 * PROGRAMMER:        Dean Zeller (dean.zeller@unco.edu)                        *
 * MODIFIED BY:       Alexis Anderson (alexisanderson2578@gmail.com)            *
 * CLASS:             CS200 – Object Oriented Programming                       *
 * INSTRUCTOR:        Dean Zeller                                               *
 * TERM:              Spring 2021                                               *
 * SUBMISSION DATE:   2/26/21                                                   *
 *                                                                              *
 * DESCRIPTION                                                                  *
 * This file implements a yahtzee object to be used in games with yahtzee.      *
 *                                                                              *
 *
 *                                                                              *
 * COPYRIGHT:                                                                   *
 * This program is copyright (c)2021 Dean Zeller and Alexis Anderson.           *
 *                                                                              *
 *******************************************************************************/
public class YahtzeeHandTester
{
 
    public static void main(String args[])
    {
       
        
         YahtzeeHand r1 = new YahtzeeHand(5,6);
        r1.reportHeader();
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(2);
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(1);
        r1.setDice(values);
        r1.reportLine(1);
        ArrayList<Integer> values2 = new ArrayList<Integer>();
        values2.add(6);
        values2.add(2);
        values2.add(5);
        values2.add(3);
        values2.add(4);
        r1.setDice(values2);
        r1.reportLine(2);
        ArrayList<Integer> values3 = new ArrayList<Integer>();
        values3.add(5);
        values3.add(5);
        values3.add(5);
        values3.add(2);
        values3.add(1);
        r1.setDice(values3);
        r1.reportLine(3);
        ArrayList<Integer> values4 = new ArrayList<Integer>();
        values4.add(1);
        values4.add(2);
        values4.add(3);
        values4.add(4);
        values4.add(4);
        r1.setDice(values4);
        r1.reportLine(4);
        ArrayList<Integer> values5 = new ArrayList<Integer>();
        values5.add(1);
        values5.add(2);
        values5.add(3);
        values5.add(4);
        values5.add(5);
        r1.setDice(values5);
        r1.reportLine(5);
        ArrayList<Integer> values6 = new ArrayList<Integer>();
        values6.add(2);
        values6.add(3);
        values6.add(4);
        values6.add(5);
        values6.add(4);
        r1.setDice(values6);
        r1.reportLine(6);
        ArrayList<Integer> values7 = new ArrayList<Integer>();
        values7.add(2);
        values7.add(2);
        values7.add(6);
        values7.add(6);
        values7.add(6);
        r1.setDice(values7);
        r1.reportLine(7); 
        r1.rollDice();
        r1.reportLine(8);
        r1.rollDice();
        r1.reportLine(9);
        r1.rollDice();
        r1.reportLine(10);

    
        
    }
}