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
 * This file implements a yahtzee tesyer object to play a yahtzee game          *
 *                                                                              *
 *
 *                                                                              *
 * COPYRIGHT:                                                                   *
 * This program is copyright (c)2021 Dean Zeller and Alexis Anderson.           *
 *                                                                              *
 *******************************************************************************/
public class YahtzeeSoloGameTester
{
    public static void main(String args[])
    {
        YahtzeeSoloGame YSG = new YahtzeeSoloGame();
        for (int i = 0; i <= 13; i++){
        YSG.play();
    }
        YSG.finalScoreSheet();
        
        
    }
}
