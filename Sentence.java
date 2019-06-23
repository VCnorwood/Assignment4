/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentence;
//PieceWorker -- To calculate the worker that gets paid per piece of product
//sold.
//CSIS 312-B01
//<Citations> -- https://docs.oracle.com/javase/tutorial/java/
//               nutsandbolts/arrays.html 


import java.util.Random;


/**
 *
 * @author Victoria
 */
// Taken from the example the teacher provided.
    public class Sentence {
        private static final String[] article = {"the" , "a" , "one" , 
            "some" , "any"};
        private static final String[] noun = {"boy" , "girl" , "dog" , 
            "town" , "car"};
        private static final String[] verb = {"drove" , "jump" , "walked" , 
            "run" ,  "skipped"};
        private static final String[] prepostion = {"to" , "from" , "over" ,
            "under" , "on"};

    /**
     * @param args the command line arguments
     */
    //Take from an example the book provided. 
    public static void main(String[] args) {
    
       System.out.println("Victoria Norwood - Assignment 3\n");
   
       int i;
           
       for (i = 0; i<20; i++)// set for 20 loops
           
       System.out.println(getSentence());
      
            
        }
     
    
    public static String getArticle(){
        
        Random r = new Random();// gen's a random number
        
        int runArt = r.nextInt(article.length);// converts a int to a word gen.
        
        return article[runArt];
    }
    
    public static String getNoun(){
       
        Random r = new Random();// gen's a random number
       
        int runNou = r.nextInt(noun.length);// converts a int to a word gen.
        
        return noun[runNou];
    }
   
    public static String getVerb(){
        
        Random r = new Random();// gen's a random number
        
        int runVer = r.nextInt(verb.length);// converts a int to a word gen.
        
        return verb[runVer];
    }
    
    public static String getPrepostion(){
        
        Random r = new Random();// gen's a random number
        
        int runPrep = r.nextInt(prepostion.length);// converts a int to a word gen.
        
        return prepostion[runPrep];
    }
   
    public static String getSentence(){
        //  An overloaded insert method.  
        StringBuilder buffer = new StringBuilder();

        // inserts that call to the get strings.        
        buffer.insert(0, ".\n");
        buffer.insert(0, getNoun());
        buffer.insert(0, " ");
        buffer.insert(0, getArticle());
        buffer.insert(0, " ");
        buffer.insert(0, getPrepostion());
        buffer.insert(0, "  ");
        buffer.insert(0, getVerb());
        buffer.insert(0, " ");
        buffer.insert(0, " ");
        buffer.insert(0, getNoun());
        buffer.insert(0, " ");
        buffer.insert(0, " ");
        buffer.insert(0, getFirstCap());
        
        return buffer.toString();
    }
   
    public static String getFirstCap() {
        
        String[] array = getArticle().split(" ");
    
        String cap = "";
       
        for (String array1 : array) {//caps the first letter
        
            cap += array1.substring(0, 1).toUpperCase() + array1.substring(1) +
                    " ";
        }
        return cap.trim();
    }

        
}

