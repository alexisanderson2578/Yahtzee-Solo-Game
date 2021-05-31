/*******************************************************************************
 *                            Assignment 4 -- Die  Object                       *      
 *                                                                              *
 * PROGRAMMER:        Dean Zeller (dean.zeller@unco.edu)                        *
 * MODIFIED BY:       Alexis Anderson (alexisanderson2578@gmail.com)            *
 * CLASS:             CS200 – Object Oriented Programming                       *
 * INSTRUCTOR:        Dean Zeller                                               *
 * TERM:              Spring 2021                                               *
 * SUBMISSION DATE:   2/19/21                                                   *
 *                                                                              *
 * DESCRIPTION                                                                  *
 * This file implements a die object to be used in games with die.              *
 *                                                                              *
 *
 *                                                                              *
 * COPYRIGHT:                                                                   *
 * This program is copyright (c)2021 Dean Zeller and Alexis Anderson.           *
 *                                                                              *
 *******************************************************************************/
public class Die
{
    private String name;
    private int numSides;
    private int currentValue;
    /***********************************************************************
     * Method:   Constructor (both parameters)                              *
     * Purpose:  Create a die based on user parameters                     *
     * Parameters:                                                          *
     *    name_ -- name of the die created                                  *
     *    numSides -- num of the sides of die created                      *
     * Return value:  no return value type                                  *
     ***********************************************************************/
    public Die(String name, int numSides){
        this.name = name;
        this.numSides = numSides;
    }

    /***********************************************************************
     * Method:   Constructor (one parameter)                              *
     * Purpose:  Create a die based on user parameters                     *
     * Parameters:                                                          *
     *    name_ -- name of the die created                                  *
     * Return value:  no return value type                                  *
     ***********************************************************************/
    public Die(String name){
        this.name = name;
        this.numSides = 6;
    }

    /***********************************************************************
     * Method:   Constructor (one parameter)                              *
     * Purpose:  Create a die based on user parameters                     *
     * Parameters:                                                          *
     *    numSides -- num of the sides of die created                      *
     * Return value:  no return value type                                  *
     ***********************************************************************/
    public Die(int numSides){
        this.numSides = numSides;
        this.name = "D" + this.numSides;
    }

    /***********************************************************************
     * Method:   Constructor (no parameter)                              *
     * Purpose:  Create a die based on user parameters                     *
     * Parameters:  none                                                        *
     * Return value:  no return value type                                  *
     ***********************************************************************/
    public Die(){
        String d6 = "D6";
        this.name = d6;
        this.numSides = 6;

    }
    /***********************************************************************
     * Method:   getNumSides()                                             *
     * Purpose:  gets the number of sides                                   *
     * Parameters: n/a                                                         *
     * Return value: numSides                                               *
     ***********************************************************************/
    public int getNumSides(){

        return this.numSides;   
    }

    /***********************************************************************
     * Method:   setNumSides()                                             *
     * Purpose:  sets the number of sides                                   *
     * Parameters:numSides                                                         *
     * Return value:                                                        *
     ***********************************************************************/
    public void setNumSides(int numSides){
        this.numSides = numSides;
        if (this.numSides < 1){
            System.out.println("Error. The # of sides needs to be 1 or greater");
        }

    }

    /***********************************************************************
     * Method:   getCurrentValue()                                             *
     * Purpose:  gets the currentValue                                       *
     * Parameters:                                                           *
     * Return value:   current value                                                     *
     ***********************************************************************/
    public int getCurrentValue(){
        return this.currentValue;
    }

    /***********************************************************************
     * Method:  toString                                                    *
     * Background:  The toString method is handy in OOP for easy printing.  *
     * Whenenver in instance is used in a string context (concatenating,    *
     * printing, etc...) the toString method is automatically called to     *
     * generate the string.                                                 *
     * Purpose:  return the string representation of die                    *
     * Parameters: none                                                     *
     * Return value:  string representation of die                          *
     ***********************************************************************/
    public String toString()
    {

        return this.currentValue+ " ";
    }

    /***********************************************************************
     * Method:   printSummary()                                             *
     * Purpose:  prints info about die                                       *
     * Parameters: n/a                                                         *
     * Return value:   n/a                                                     *
     ***********************************************************************/
    public void printSummary(){
        System.out.println("Summary:");
        System.out.println("Name:" + name);
        System.out.println("Range:   1 to " + this.numSides );
        System.out.println("");

    }

    /***********************************************************************
     * Method:   roll()                                                     *
     * Purpose:  rols the die (randome number)                               *       
     * Parameters:  n/a                                                      *   
     * Return value: n/a                                                     *
     ***********************************************************************/
    public void Roll(){

        this.currentValue =  (int)(Math.random() * (getNumSides() -1) +1);
    }

    /***********************************************************************
     * Method:   setCurrentValue()                                             *
     * Purpose:  sets the currentValue                                       *
     * Parameters: current value                                                          *
     * Return value:                                                        *
     ***********************************************************************/
    public void setCurrentValue(int currentValue){
        this.currentValue = currentValue;
        if (this.currentValue < 0 || this.currentValue > this.numSides){
            System.out.println("Error. Not a valid value to set die to.");
        }
    }

    /***********************************************************************
     * Method:   setCurrentValueOverride()                                             *
     * Purpose:  sets the currentValue                                       *
     * Parameters: current value                                                          *
     * Return value:                                                        *
     ***********************************************************************/
    public void setCurrentValueOverride(int currentValue){
        this.currentValue =currentValue; 
    }
}
