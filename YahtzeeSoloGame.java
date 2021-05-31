import java.util.*;
/*******************************************************************************
 *                            Assignment 6 -- Yahtzee solo  Object              *      
 *                                                                              *
 * PROGRAMMER:        Dean Zeller (dean.zeller@unco.edu)                        *
 * MODIFIED BY:       Alexis Anderson (alexisanderson2578@gmail.com)            *
 * CLASS:             CS200 – Object Oriented Programming                       *
 * INSTRUCTOR:        Dean Zeller                                               *
 * TERM:              Spring 2021                                               *
 * SUBMISSION DATE:   3/12/21                                                   *
 *                                                                              *
 * DESCRIPTION                                                                  *
 * This file implements a yahtzee object play a yahtzee game                    *
 *                                                                              *
 *
 *                                                                              *
 * COPYRIGHT:                                                                   *
 * This program is copyright (c)2021 Dean Zeller and Alexis Anderson.           *
 *                                                                              *
 *******************************************************************************/
public class YahtzeeSoloGame
{
    YahtzeeScoreCard YSC = new YahtzeeScoreCard();
    Scanner inpt = new Scanner(System.in);
    private String r1;
    private int totalScore;
     private boolean d1 = false;
       private boolean d2 = false;
      private  boolean d3 = false;
      private  boolean d4 = false;
      private  boolean d5 = false;
    public YahtzeeSoloGame()
    {
        this.r1 = "";
        this.d1 = false;
        this.d2 = false;
        this.d3 = false;
        this.d4 = false;
        this.d5 = false;

    }

    public void play(){
        System.out.println("Current Scoresheet: ");
        YSC.displayScoresheet();
        System.out.println("Dice Throw #1: ");
        
        
        YSC.rollDice();
        YSC.printDice();
       

        System.out.println("Would you like to reroll? press N for no or press 1,2,3,4,or 5 to reroll any of the dice. Enter one at a time"); 

        System.out.println("Dice to throw: " );
         

        while (!r1.equals("N")){
            r1 = inpt.nextLine();
            if (r1.equals("1")){
                this.d1 = true;

            }
            if (r1.equals("2")){
                this.d2 = true;
            }
            if (r1.equals("3")){
                this.d3=true;
            }
            if (r1.equals("4")){
                this.d4 =true;
            }
            if (r1.equals("4")){
                this.d5 = true;
            }
            System.out.print(r1 + " ");
        

        YSC.rollDice(this.d1,this.d2,this.d3,this.d4,this.d5);
    }
        System.out.println("Dice Throw #2: ");

        YSC.printDice();
        d1 = false;
        d2 = false;
        d3 = false;
        d4 = false;
        d5 = false;

        System.out.println("Would you like to reroll? press k for no or press 1,2,3,4,or 5 to reroll any of the dice. Enter one at a time"); 
        System.out.println("Dice to throw: " );

            
        while (!r1.equals("k")){

            r1 = inpt.nextLine();
            if (r1 == "1"){
                d1 = true;

            }
            if (r1 == "2"){
                d2 = true;
            }
            if (r1 == "3"){
                d3=true;
            }
            if (r1 == "4"){
                d4 =true;
            }
            if (r1 == "5"){
                d5 = true;
            }
            System.out.print(r1 + " ");
        }
        YSC.rollDice(d1,d2,d3,d4,d5);
        System.out.println("Dice Throw #3: ");

        YSC.printDice();
        System.out.println("Use in row: ");
        String rownum = inpt.nextLine();

        if( rownum.equals("1")){
            System.out.println("Score saved in row 1: " );
            YSC.scoreOnes();
        }
        if( rownum.equals("2")){
            System.out.println("Score saved in row 2: " );
            YSC.scoreTwos();
        }
        if( rownum.equals("3")){
            System.out.println("Score saved in row 3: " );
            YSC.scoreThrees();
        }
        if( rownum.equals("4")){
            System.out.println("Score saved in row 4: " );
            YSC.scoreFours();
        }
        if( rownum.equals("5")){
            System.out.println("Score saved in row 5: " );
            YSC.scoreFives();
        }
        if( rownum.equals("6")){
            System.out.println("Score saved in row 6: " );
            YSC.scoreSixes();
        }
        if( rownum.equals("7")){
            System.out.println("Score saved in row 7: " );
            YSC.scoreThreeKind();
        }
        if( rownum.equals("8")){
            System.out.println("Score saved in row 8: " );
            YSC.scoreFourKind();
        }
        if( rownum.equals("9")){
            System.out.println("Score saved in row 9: " );
            YSC.scoreFullHouse();
        }
        if( rownum.equals("10")){
            System.out.println("Score saved in row 10: " );
            YSC.scoreSmallStraight();
        }
        if( rownum.equals("11")){
            System.out.println("Score saved in row 11: " );
            YSC.scoreLargeStraight();

        }
        if( rownum.equals("12")){
            System.out.println("Score saved in row 12: " );
            YSC.scoreChance();

        }
        if( rownum.equals("13")){

            System.out.println("Score saved in row 13: " );
            YSC.scoreYahtzee();

        }
        YSC.displayScoresheet();
    }

    public void finalScoreSheet(){
        YSC.scoreOnes();
        YSC.scoreTwos();
        YSC.scoreThrees();
        YSC.scoreFours();
        YSC.scoreFives();
        YSC.scoreSixes();
        YSC.scoreBonus();
        YSC.scoreThreeKind();
        YSC.scoreFourKind();
        YSC.scoreFullHouse();
        YSC.scoreSmallStraight();
        YSC.scoreLargeStraight();
        YSC.scoreYahtzee();
        YSC.scoreChance();
        YSC.scoreTotal();
        YSC.displayScoresheet();

    }
}

