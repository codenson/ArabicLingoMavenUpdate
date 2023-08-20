/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
///package lingo;
package com.solocoding.lingo; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author guero
 */
public class QuizTaker {

    alphabetsController alphabets;
    private HashMap< String, Alphabet> alphaMap;
    private HashMap< Integer, Boolean> picked;
    ArrayList<String> list = new ArrayList();

    int counter = 0;
    int score = 0;
    Alphabet alph1Correct;
    Alphabet alph2;
    Alphabet alph3;

    /**
     * Contstuctor.
     */
    public QuizTaker() {
        alphabets = new alphabetsController();
        alphaMap = alphabets.getAlphaNodes();
        ///  alphaMap = new alphabetsController().getAlphaNodes(); 
        picked = new HashMap();

    }

    /**
     * Correct alphabet the current question is testing the user on.
     *
     * @return the correct alphabet.
     */
    public Alphabet CorrectAlphGetter() {
        return this.alph1Correct;
    }

    /**
     * Method to pack the three choices for the multiple choice question. It
     * also shuffles the choices twice randomally.
     *
     * @return a list of the three alphabets pronunciation as a list.
     */
    public ArrayList<String> ramdomanizeOptions() {
        list = new ArrayList();
        ///System.out.println("Here are the alph:       "+alph2.AlphabetNameGetter()+ " \n alph3: "+ alph3.AlphabetNameGetter() );
        list.add(this.alph1Correct.AlphabetNameGetter());
        list.add(this.alph2.AlphabetNameGetter());
        list.add(this.alph3.AlphabetNameGetter());

        Collections.shuffle(list);
        Collections.shuffle(list);

        return list;

    }

    /**
     * Method to compare user's answer with the correct answer.
     *
     * @param pick the answer the user picked.
     * @return true is both Strings match, otherwise false;
     */
    public boolean comparepick(String pick) {
        return pick.equals(this.alph1Correct.AlphabetNameGetter());

    }

    public int updateScore() {
        return ++score;
    }

    /**
     * method to keep track of rounds.
     *
     * @return current round.
     */
    public int roundNumber() {

        return ++counter;
    }

    /**
     * Method to keep count of how many questions have been asked.
     */
    public void updateRoundNumber() {
        counter++;

    }

    /**
     * Method to set up a new round.
     *
     * @return true is the the player still did not finish the test, othere wise
     * returns false and the test is over.
     */
    public boolean setUpNewRound() {
        if (counter < 5) {
            assignTestAlphabets();
            counter++;
            return true;
        }
        return false;

    }

    /**
     * Method to pick three alphabets randomally for to desplay in the test.
     * alpha1COrrect represents the correct alphabet that the user is asked to
     * identify. alph2 is an other alphabet to use in multiple choice question.
     * alph3 is the same as alph2.
     */
    public void assignTestAlphabets() {
        alph1Correct = pickRandom();
        alph2 = pickTestAlph(alph1Correct, null);
        alph3 = pickTestAlph(alph1Correct, alph2);
        System.out.println("alph1Correct: " + alph1Correct.AlphabetNameGetter());
        System.out.println("alph1Correct: " + alph2.AlphabetNameGetter());
        System.out.println("alph1Correct: " + alph3.AlphabetNameGetter());
        System.out.println("\n");

    }

    /**
     * method to pick a blaff test material for multiple choice questions.
     */
    private Alphabet pickTestAlph(Alphabet alphCompare, Alphabet second) {
        int num = -1;
        Alphabet alph = null;
        for (int i = 0; i < 29; i++) {
            Random rand = new Random();
            num = rand.nextInt(28) + 1;
            if (!picked.containsKey(num)) {

                if (alphaMap.get(num) != second) {

                    break;
                }
            }

        }
        /// System.out.println("compare: "+alphaMap.get(num+"" ).equals(second));
        return alph = alphaMap.get(num + "");

    }

    /**
     * Method to pick an alphabet that has not showed up as a question in the
     * test yet.
     *
     * @return alphabet that has not been picked yet.
     */
    private Alphabet pickRandom() {
        int num = -1;
        for (int i = 0; i < 29; i++) {
            Random rand = new Random();
            num = rand.nextInt(28) + 1;
            if (!picked.containsKey(num)) {
                picked.put(num, Boolean.TRUE);
                break;

            }

        }

        Alphabet m = alphaMap.get(num + "");
        return m;

        /// return alphaMap.get(num); 
    }

    public static void main(String[] args) {
        QuizTaker m = new QuizTaker();
        // m.assignTestAlphabets();
        //  m.
        //      QuizPanel pan = new QuizPanel(m);
//        MainFrame frame = new MainFrame(pan);
//        frame.setSize(600,500);

        for (int i = 0; i < 28; i++) {
            m.assignTestAlphabets();
        }

    }

}
