/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpermutation;

/**
 *
 * @author Gemgod
 */
public class CheckPermutation {

    /**
     * @param args the command line arguments
     */
    public static void  main(String[] args) {
        // TODO code application logic here
        System.out.println(boolPermutation("hi", "hi"));
        
    }
    //Create a method that returns string, that takes two strings, this solution is O(N)
   public static String permutation(String one, String two)
   {
       
       String yes = "These strings are permutated";
       String no = "These strings are not permutated";
       
        //Turn both strings into character arrays
       char []onsie = one.toCharArray();
       
       char []twosie = two.toCharArray();
       
       
       
    //Create an int variable1, and int variable2
    int var1 = 0;
    int var2 = 0;
    
    //Create a for loop that loops through the index of character array 1
    for(int i = 0; i < onsie.length; i++)
    {
     //Turn each character into a number and adds it to int variable1, maybe make an int variable like count1 to handle the conversion of char to int
       var1+= onsie[i];
    }
    System.out.println(var1);
    
    //Create a for loop that loops through the index of character array 2
    for(int i = 0; i < twosie.length; i++)
    {
        //Turn each character into a number and adds it to int variable2, maybe make an int variable like count 2 to handle the conversion of char to int
        var2+= twosie[i];
    }
    System.out.println(var2);
    
    
    //If int variable1 = int variable2 then return "These strings are permutated"
    if(var1 == var2)
    {
        return yes;
    }
   
    //Returns no by default
    return no;
    
   }
   
   //How to do the same method using a hashmap
    public static boolean boolPermutation(String s, String t)
    {
        //If the string lenghts are different then they cannot be permutations
        if(s.length() != t.length()) return false;
        
        
        //Creating a Hasmap to hold the values, think of a grid box that lights up green when a positive value is in it but lights up red when a negative value is in it, should be dark when neutral
        int[] letters = new int[128];
        
        //This is to itterate through the first string s
        for(int i = 0; i < s.length(); i++)
        {
            //For every letter in s, light up a box in the grid with that letters coordinate
            letters[s.charAt(i)]++;
        }
        
        //This is to itterate through the second int i
        for(int i = 0; i < t.length(); i++)
            {
                //For every letter in i, attempt to put a negative value in one of its boxes
                letters[t.charAt(i)]--;
                
                //If any of the boxes are lighting up red then that means that box was not clicked before
                if(letters[t.charAt(i)] < 0)
                { 
                    
                    //Tells us that the two strings we put in to the method are not permutations because they dont give neutral values
                    return false;
                }
            }
        
        //Returns a true value by default
        return true;
    }
    
}
