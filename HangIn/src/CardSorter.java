package com.hangin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This class is used to sort ArrayList of cards in different orders
 * This class also contains comparators for these orders
 * -Event time
 * -Time posted
 * -Number of people coming
 * @author Fatih Celik
 */
public class CardSorter {
    
    /**
     * A comparator interface for cards, comparing them regarding to their event time
     */
    public static Comparator<Card> cardEventTimeComparator = new Comparator<Card>() {
        /**
         * compares the cards returning int value
         * @param c1 Card 1
         * @param c2 Card 2
         * @return positive if c2 event time is closer, negative if c1 is closer
         */
        @Override
        public int compare( Card c1, Card c2) {
            String s1 = c1.getTime().toString();
            String s2 = c2.getTime().toString();
            if ( Integer.parseInt(s2.substring(15)) != Integer.parseInt(s1.substring(15)))
                return Integer.parseInt(s2.substring(15)) - Integer.parseInt(s1.substring(15));
            else if ( Integer.parseInt(s2.substring(12,14)) != Integer.parseInt(s1.substring(12,14)))
                return Integer.parseInt(s2.substring(12,14)) - Integer.parseInt(s1.substring(12,14));
            else if ( Integer.parseInt(s2.substring(9,11)) != Integer.parseInt(s1.substring(9,11)))
                return Integer.parseInt(s2.substring(9,11)) - Integer.parseInt(s1.substring(9,11));
            else if ( Integer.parseInt(s2.substring(0,2)) != Integer.parseInt(s1.substring(0,2)))
                return Integer.parseInt(s2.substring(0,2)) - Integer.parseInt(s1.substring(0,2));
            else if ( Integer.parseInt(s2.substring(3,5)) != Integer.parseInt(s1.substring(3,5)))
                return Integer.parseInt(s2.substring(3,5)) - Integer.parseInt(s1.substring(3,5));
            else
                return Integer.parseInt(s2.substring(6,8)) - Integer.parseInt(s1.substring(6,8));
        }       
    };
    
    /**
     * A comparator interface for cards, comparing them regarding to their time posted
     */
    public static Comparator<Card> cardPostedTimeComparator = new Comparator<Card>() {
        /**
         * compares the cards returning int value
         * @param c1 Card 1
         * @param c2 Card 2
         * @return positive if c2 is recent, negative if c1 is recent
         */
        @Override
        public int compare( Card c1, Card c2) {
            String s1 = c1.getTimePosted().toString();
            String s2 = c2.getTimePosted().toString();
            if ( Integer.parseInt(s2.substring(15)) != Integer.parseInt(s1.substring(15)))
                return Integer.parseInt(s2.substring(15)) - Integer.parseInt(s1.substring(15));
            else if ( Integer.parseInt(s2.substring(12,14)) != Integer.parseInt(s1.substring(12,14)))
                return Integer.parseInt(s2.substring(12,14)) - Integer.parseInt(s1.substring(12,14));
            else if ( Integer.parseInt(s2.substring(9,11)) != Integer.parseInt(s1.substring(9,11)))
                return Integer.parseInt(s2.substring(9,11)) - Integer.parseInt(s1.substring(9,11));
            else if ( Integer.parseInt(s2.substring(0,2)) != Integer.parseInt(s1.substring(0,2)))
                return Integer.parseInt(s2.substring(0,2)) - Integer.parseInt(s1.substring(0,2));
            else if ( Integer.parseInt(s2.substring(3,5)) != Integer.parseInt(s1.substring(3,5)))
                return Integer.parseInt(s2.substring(3,5)) - Integer.parseInt(s1.substring(3,5));
            else
                return Integer.parseInt(s2.substring(6,8)) - Integer.parseInt(s1.substring(6,8));
        }       
    };
    
    /**
     * A comparator interface for cards, comparing them regarding to number coming
     */
    public static Comparator<Card> cardNumComingComparator = new Comparator<Card>() {
        /**
         * compares the cards returning int value
         * @param c1 Card 1
         * @param c2 Card 2
         * @return positive if c2 has more, negative is c1 has more, 0 if equal
         */
        @Override
        public int compare( Card c1, Card c2) {
            int i = c1.getNumComing();
            int j = c2.getNumComing();
            return j - i;
        }
    };
    
    /**
     * Sorts the entered ArrayList regarding event time using cardEventTimeComparator
     * List starts from closest event to happen
     * @param cards 
     */
    public static void sortByTimePosted( ArrayList<Card> cards) {
        Collections.sort(cards, cardEventTimeComparator);
    }
    
    /**
     * Sorts the entered ArrayList regarding time posted using cardPostedTimeComparator
     * List starts from most recent posted card
     * @param cards 
     */
    public static void sortByTimePosted( ArrayList<Card> cards) {
        Collections.sort(cards, cardPostedTimeComparator);
    }
    
    /**
     * Sorts the entered ArrayList regarding number of people coming to the event
     * Using cardNumComingComparator
     * List starts with event most people coming to
     * @param cards 
     */
    public static void sortByNumComing( ArrayList<Card> cards) {
        Collections.sort(cards, cardNumComingComparator);
    }
}
