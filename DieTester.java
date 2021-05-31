/*******************************************************************************
 *                            Assignment 4 -- Die Tester Object                              *
 *                                                                              *
 * PROGRAMMER:        Dean Zeller (dean.zeller@unco.edu)                        *
 * MODIFIED BY:       Alexis Anderson (alexisanderson2578@gmail.com)            *
 * CLASS:             CS200 – Object Oriented Programming                       *
 * INSTRUCTOR:        Dean Zeller                                               *
 * TERM:              Spring 2021                                               *
 * SUBMISSION DATE:   2/19/21                                                   *
 *                                                                              *
 * DESCRIPTION                                                                  *
 * This file tests the die object                                 .             *
 *                                                                              *
                                                                                *
 *                                                                              *
 * COPYRIGHT:                                                                   *
 * This program is copyright (c)2021 Dean Zeller and Alexis Anderson.           *
 *                                                                              *
 *******************************************************************************/
public class DieTester
{
   public void singleRollTest(Die a){
       a.Roll();
       
       System.out.println("Single number test:" + a.getCurrentValue());
    }
    
   public void multipleRollTest( Die a, int rollNum){
       System.out.println("Multiple number test:" + "(" + rollNum + ") rolls");
     int sum = 0;  
       for ( int i = 0; i< rollNum; i++){
        a.Roll();
      
       
       System.out.print(a.getCurrentValue() + " ");
       sum += a.getCurrentValue();
    }
    System.out.println("");
    System.out.println("Sum:");
    System.out.println(sum);
}

public static void main(String args[])
    {
        DieTester test1 = new DieTester();
        Die d1 = new Die();
        test1.singleRollTest(d1);
        test1.multipleRollTest(d1,3);
        d1.printSummary();
        
        DieTester test2 = new DieTester();
        Die d2 = new Die();
        test2.singleRollTest(d2);
        test1.multipleRollTest(d1,5);
        d2.printSummary();
        
         DieTester test3 = new DieTester();
        Die d3 = new Die("dieee",8);
        test3.singleRollTest(d3);
        test3.multipleRollTest(d1,7);
        d3.printSummary();
        
        DieTester test4 = new DieTester();
        Die d4 = new Die("ok");
        test4.singleRollTest(d4);
        test1.multipleRollTest(d1,6);
        d4.printSummary();
        
         DieTester test5 = new DieTester();
        Die d5 = new Die("what",12);
        test5.singleRollTest(d5);
        test5.multipleRollTest(d1,10);
        d5.printSummary();
    }
}