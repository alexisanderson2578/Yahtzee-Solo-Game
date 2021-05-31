import java.util.*;

/*******************************************************************************
 *                            Assignment 5 -- Yahtzee  Object                   *      
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
public class YahtzeeHand
{
    private ArrayList<Die> dice = new ArrayList<Die>();
    private int diceNum;
    private int numSides; 

    public YahtzeeHand()
    {
        int numSides = 6;
        int diceNum = 5;
    }

    public YahtzeeHand(int diceNum, int numSides)

    {   this.diceNum = diceNum;
        this.numSides = numSides;
        this.dice = new ArrayList<Die>();
        for(int i = 0; i< diceNum; i++){
            Die d = new Die(numSides);
            dice.add(d);

        }
    }

    public YahtzeeHand(int diceNum)
    {
        int numSides = 6;
        this.diceNum = diceNum; 
    }

    public int faceValue(int n){
        int k = 0;
        for(Die i : dice){
            if(i.getCurrentValue() == n){
                k += 1;
            }
        }
        return k * n;
    }

    public ArrayList getDice(){
        return this.dice;
    }

    public int chanceValue(){
        int sum = 0; 
        for (Die i : dice){
            sum += i.getCurrentValue();
        }
        return sum;
    }

    public int threeKindValue(){
        ArrayList<Integer> h = new ArrayList<Integer>(); 

        for (Die i: dice){
            h.add(i.getCurrentValue());   
        }
        for (int i: h){
            int count1 = Collections.frequency(h, i);

            if (count1 == 3){
                return chanceValue();
            }
        }
        return 0;
    }

    public int fourKindValue()
    {
        ArrayList<Integer> h = new ArrayList<Integer>(); 

        for (Die i: dice){
            h.add(i.getCurrentValue());   
        }
        for (int i: h){
            int count1 = Collections.frequency(h, i);

            if (count1 == 4){
                return chanceValue();
            }
        }
        return 0;
    }

    public int fullHouseValue(){
        ArrayList<Integer> values = new ArrayList<Integer>(); 
        ArrayList<Integer> counts = new ArrayList<Integer>(); 
        for (Die i: dice){
            values.add(i.getCurrentValue());   
        }
        for (int k: values){
            counts.add(Collections.frequency(values, k));
            values.remove(Collections.singleton(k));
        }
        if (counts.contains(3) && counts.contains(2)){
            return 25;
        }

        return 0;
    }

    public int smallStraightValue(){
        List<Integer> h = new ArrayList<Integer>(); 
        List<Integer> straight1 = new ArrayList<Integer>();
        List<Integer> straight2 = new ArrayList<Integer>();
        List<Integer> straight3 = new ArrayList<Integer>();
        for (Die i: dice){
            h.add(i.getCurrentValue());   
        }
        Collections.sort(h);
        straight1.add(1);
        straight1.add(2);
        straight1.add(3);
        straight1.add(4);

        straight2.add(2);
        straight2.add(3);
        straight2.add(4);
        straight2.add(5);

        straight3.add(3);
        straight3.add(4);
        straight3.add(5);
        straight3.add(6);

        if (h.containsAll(straight1)|| h.containsAll(straight2) || h.containsAll(straight3)){
            return 30;
        }
        return 0;
    }

    public int largeStraightValue(){
        List<Integer> h = new ArrayList<Integer>(); 
        List<Integer> straight1 = new ArrayList<Integer>();
        List<Integer> straight2 = new ArrayList<Integer>();
        for (Die i: dice){
            h.add(i.getCurrentValue());   
        }
        Collections.sort(h);
        straight1.add(1);
        straight1.add(2);
        straight1.add(3);
        straight1.add(4);
        straight1.add(5);

        straight2.add(2);
        straight2.add(3);
        straight2.add(4);
        straight2.add(5);
        straight2.add(6);

        if (h.containsAll(straight1)|| h.containsAll(straight2)){
            return 40;
        }
        return 0;
    }

    public int yahtzeeValue(){

        ArrayList<Integer> h = new ArrayList<Integer>(); 
        for (Die i: dice){
            h.add(i.getCurrentValue());   
        }
        for (int i: h){
            int count1 = Collections.frequency(h, i);

            if (count1 == 5){
                return 50;
            }
        }

        return 0;
    }

    public String toString(){
        String s = "";
        for(Die d : dice)
            s += d + " ";
        return s;
    }

    public void reportHeader(){
        System.out.format(" %10s %14s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %n","Dice","1s","2s","3s","4s","5s","6s","3k","4k","FH","St","Ls","Yt","Ch"); 
    }

    public void reportLine(int num){

        for( int i = 1; i <= 10; i ++ ){
            if(i == num){
                System.out.format("%1d %1s %10s ", i ,". ", toString()) ;  
            }  
        }
        for( int i = 1; i <= 6; i ++ ){
            System.out.format("%5d ",faceValue(i));
        }
        System.out.format("%5d %5d %5d %5d %5d %5d %5d %n", threeKindValue(), fourKindValue(), fullHouseValue(), smallStraightValue(),largeStraightValue(), yahtzeeValue(), chanceValue());
    }

    public void rollDice(){
        for (Die i: dice){
            i.Roll();
        }
    }
    
    public void rollDice(boolean d1, boolean d2, boolean d3, boolean d4, 
    boolean d5){
        if (d1){ 
            this.dice.get(0).Roll();
        }
         if (d2){ 
            this.dice.get(1).Roll();
        }
         if (d3){ 
            this.dice.get(2).Roll();
        }
         if (d4){ 
            this.dice.get(3).Roll();
        }
         if (d5){ 
            this.dice.get(4).Roll();
        }
    }

    public int countDice(int n){
        int count = 0;
        for(Die i : dice){
            if (i.getCurrentValue() == n){
                count += 1;
            }
        }
        return count;
    }

    public void setDice(ArrayList<Integer> inputVal){
        
        for(int i = 0; i < inputVal.size(); i++){
            //System.out.print(" checking dice.get" + this.dice.get(i));
            //System.out.print(" checking input.get" + inputVal.get(i));
            this.dice.get(i).setCurrentValue(inputVal.get(i));
        }
    }
    
    
    
      public void printDice(){
          for(Die d: dice){
              System.out.print(d);
          }
          System.out.println(" ");
      }
}

