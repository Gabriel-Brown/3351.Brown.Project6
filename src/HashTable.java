/******************************************************
‘***  Project 5 - Hash Word Counter
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate a HashTable Data Structure
‘***
‘******************************************************
‘*** 10/02/2017
‘******************************************************
‘*****************************************************/
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabe
 */
public class HashTable {
    private String [] hashTable;
    private int mySize;
    private int collisions = 0;
    
    public HashTable(int size)
    {
        mySize = size;
        hashTable = new String[size];
    }
    
    public boolean addToHash(String input)
    {
        //return false if collision
        boolean answer = true;
        int hashValue = Math.abs(input.hashCode());
        int finalPos = hashValue % mySize;
        if (hashTable[finalPos] == null || input.compareTo(hashTable[finalPos]) == 0)
            hashTable[finalPos] = input;
        else 
        {
            answer = false;
            collisions ++;
        }
        return answer;
        
    }
    
    public String printOut()
    {
        int totalWords = 0;
        String answer = "<html>";
        for (int i = 0;i < hashTable.length ;i++)
        {
            if (hashTable[i] != null)
            {
                answer += "hash: " + i + "  Word: " + hashTable[i] + "<br>";
                totalWords ++;
            }
        }
        return answer + "<br><br>Unique Words: " + totalWords;
    }
    
    public int findWord(String input)
    {
        int answer = -1;
        int hashValue = Math.abs(input.hashCode());
        int finalPos = hashValue % mySize;
        if (hashTable[finalPos] != null)
            if (input.compareTo(hashTable[finalPos]) == 0)
                answer = finalPos;
        
        return answer;
    }
}

