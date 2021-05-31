import java.util.*;
/*******************************************************************************
 *                            Assignment 6 -- Yahtzee scorecard  Object         *      
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
public class YahtzeeScoreCardTester
{
    public static void main(String args[])
    {
        YahtzeeScoreCard YSC = new YahtzeeScoreCard();
       
        
        
        YSC.rollDice(true,false,false,true,true);
        YSC.printDice();
        YSC.rollDice(false,false,false,true,true);
        YSC.printDice();
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
