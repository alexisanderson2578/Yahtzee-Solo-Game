import java.util.*;

/*******************************************************************************
 *                            Assignment 6 -- Yahtzee  score cardObject         *      
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
public class YahtzeeScoreCard{
    private Integer onesScore;
    private Integer twosScore ;
    private Integer threesScore;
    private Integer foursScore;
    private Integer fivesScore;
    private Integer sixesScore;
    private Integer bonusScore;

    private Integer threeKindScore;
    private Integer fourKindScore;
    private Integer fullhouseScore;
    private Integer smallstraightScore;
    private Integer largestraightScore;
    private Integer yahtzeeScore;
    private Integer chanceScore;
    private Integer totalScore;
    YahtzeeHand YH = new YahtzeeHand(5,6);
    
    public YahtzeeScoreCard(){
        this.totalScore = 0;
        this.bonusScore = 0;
         onesScore = null;
        twosScore = null;
        threesScore = null;
        foursScore = null;
        fivesScore = null;
        sixesScore = null;
        
        threeKindScore = null;
        fourKindScore = null;
        fullhouseScore = null;
        smallstraightScore = null;
        largestraightScore = null;
        yahtzeeScore = null;
        chanceScore = null;
        
   
    }
    public void printDice(){
        YH.printDice();
    }
     
    public void rollDice(){
        this.YH.rollDice();
    }

    public void rollDice(boolean d1, boolean d2, boolean d3, boolean d4, 
    boolean d5){
        this.YH.rollDice(d1,d2,d3,d4,d5);
    }
    
    public void setDice(ArrayList<Integer> value){
      
        YH.setDice(value);
    }
    
    public void scoreOnes(){ 
        this.onesScore = YH.faceValue(1);
        
    }

    public  void scoreTwos() {
        this.twosScore = YH.faceValue(2);
       
    }

    public  void scoreThrees() {
        this.threesScore = YH.faceValue(3);
       
    }

    public  void scoreFours() {
        this.foursScore = YH.faceValue(4);
       
    }

    public  void scoreFives() {
        this.fivesScore = YH.faceValue(5);
        
    }

    public void scoreSixes() {
        this.sixesScore = YH.faceValue(6);
        
    }

    public  void scoreThreeKind() {
        this.threeKindScore = YH.threeKindValue();
        
    }

    public  void scoreFourKind() {
        this.fourKindScore = YH.fourKindValue();
        
    }

    public  void scoreSmallStraight() {
        this.smallstraightScore = YH.smallStraightValue();
        
    }

    public  void scoreLargeStraight() {
        this.largestraightScore = YH.largeStraightValue();
        
    }
    
    public  void scoreFullHouse() {
        this.fullhouseScore = YH.fullHouseValue();
        
    }
    public  void scoreYahtzee() {
        this.yahtzeeScore = YH.yahtzeeValue();
        
    }

    public  void scoreChance() {
        this.chanceScore = YH.chanceValue();
        
    }

    public void scoreBonus(){

        if(this.threesScore + this.twosScore + this.foursScore + this.fivesScore + this.sixesScore + this.onesScore >= 63){
            this.bonusScore = 35;
        }
        else{
            this.bonusScore = 0;
        }

    }
    
    public void scoreTotal(){
        this.totalScore = this.threesScore + this.twosScore + this.foursScore + this.fivesScore + this.sixesScore + this.onesScore + this.threeKindScore +this.fourKindScore + this.smallstraightScore +this.largestraightScore +this.fullhouseScore+ this.yahtzeeScore + this.chanceScore;
    }
    
    public void displayScoresheet(){
        if(this.onesScore != null){
        System.out.format("1.  Ones:        %2d %n", this.onesScore);
    }
    else{
        System.out.println("1.  ones:        ");
    }
    
    if(this.twosScore != null){
        System.out.format("2.  twos:        %2d %n", this.twosScore);
    }
    else{
        System.out.println("2.  twos:        ");
    }
    if(this.threesScore != null){
        System.out.format("3.  threes:        %2d %n", this.threesScore);
    }
    else{
        System.out.println("3.  threes:        ");
    }
    if(this.foursScore != null){
        System.out.format("4.  fours:        %2d %n", this.foursScore);
    }
    else{
        System.out.println("4.  fours:        ");
    }
    if(this.fivesScore != null){
        System.out.format("5.  fives:        %2d %n", this.fivesScore);
    }
    else{
        System.out.println("5.  fives:        ");
    }
    if(this.sixesScore != null){
        System.out.format("6.  sixes:        %2d %n", this.sixesScore);
    }
    else{
        System.out.println("6.  sixes:        ");
    }
    System.out.format("BONUS        %2d %n", this.bonusScore);
    if(this.threeKindScore != null){
        System.out.format("7.  3-Kind:        %2d %n", this.threeKindScore);
    }
    else{
        System.out.println("7.  3-Kind:        ");
    }
    if(this.fourKindScore != null){
        System.out.format("8.  4-Kind:        %2d %n", this.fourKindScore);
    }
    else{
        System.out.println("8.  4-Kind:        ");
    }
    if(this.fullhouseScore != null){
        System.out.format("9.  Fullhouse:        %2d %n", this.fullhouseScore);
    }
    else{
        System.out.println("9.  Fullhouse:        ");
    }
    if(this.smallstraightScore != null){
        System.out.format("10.  Small Straight:        %2d %n", this.smallstraightScore);
    }
    else{
        System.out.println("10.  Small Straight:        ");
    }
    if(this.largestraightScore != null){
        System.out.format("10.  Large Straight:        %2d %n", this.largestraightScore);
    }
    else{
        System.out.println("10.  Large Straight:        ");
    }
    if(this.yahtzeeScore != null){
        System.out.format("12.  Yahtzee:        %2d %n", this.yahtzeeScore);
    }
    else{
        System.out.println("12.  Yahtzee:        ");
    }
    
    if(this.chanceScore != null){
        System.out.format("13.  Chance:        %2d %n", this.chanceScore);
    }
    else{
        System.out.println("13.  Chance:        ");
    }
   
    System.out.format("TOTAL        %2d %n", this.totalScore);
        
        
    }
}
