/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigger.is.greater;

import java.util.Scanner;

/**
 *
 * @author CHUKWUEMEKA
 */
public class BiggerIsGreater {

    /**
     * @param args the command line arguments
     * 
     */
//    dkch
//    find the pivotIndex from the end, (ndex=0, char=d)
//    find the rightmost index which the element is greater than pivotIndex
//    dkch=hkcd
//    
    
    
    static String biggerIsGreater(String w){
        
         char[] arr = w.toCharArray();
         
         //1    //find the pivotIndex from the end, (ndex=0, char=d)
         boolean found=false;
         int pivotIndex = -1;
         for(int i=arr.length - 1 ; i>0; i-- )
         {
             found=true;
             pivotIndex = i-1;
             break;
         }
         
        if(!found){
            return "no answer";
        }
        
        //2  //find the rightmost index which the element is greater than pivotIndex   
        int rightmostindex = -1;
        for(int i=arr.length-1; i>pivotIndex;i--)
        {
            if(arr[i]> arr[pivotIndex])
            {
                rightmostindex=i;
                break;
            }
        }
        
        char c =arr[pivotIndex];
        arr[pivotIndex]=arr[rightmostindex];
        arr[rightmostindex]=c;
        
        
        
        
        //3 //    dkch=hkcd
        int left = pivotIndex+1, right=arr.length-1;
        while(left<right){
            c=arr[left];
            arr[left]=arr[right];
            arr[right]=c;
            left++;
            right--;
            
        }
        return new String(arr);
        
    }

    
    
    public static void main(String[] args) {
        
        String n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word you want to change:");
        n = s.next();

        System.out.println(biggerIsGreater(n));

        
        
//        
//        for(int i = 0; i < T; i++)
//        {	
//            String word = input.nextLine();
//            if(word.length()==1) {System.out.println("no answer");continue;}
//            
//            
//            int maxLexoC1 = 0; //The max lexocographical according to condition 1
//            int maxLexoC2 = 0; //The max lexocographical according to condition 2
//            
//            
//            
//            //Find the largest index char that is weakly increasing such as g in hefg 
//            for(int j = 1; j < word.length(); j++)
//            {
//                boolean condition1 = word.charAt(j) > word.charAt(j-1);
//                    
//                if(condition1)
//                {
//                    maxLexoC1 = (j > maxLexoC1) ? j : maxLexoC1;
//                }
//            }
//            
//            //if our only increasing is at point 0 then we are in the last permuation of our string
//            if(maxLexoC1==0) {System.out.println("no answer");continue;}
//            
//            //maxLexoC2
//            //Determine the right most char greater than the pivot in index and in lexo
//            for(int j = maxLexoC1; j < word.length(); j++)
//            {
//                boolean condition2 = word.charAt(j) > word.charAt(maxLexoC1-1);
//                    
//                if(condition2)
//                {
//                    maxLexoC2 = j;
//                }
//            }
//            
//            StringBuilder wordSB = new StringBuilder(word);
//            
//            //Swap the pivot with maxLexoC2
//            char tmp = wordSB.charAt(maxLexoC1-1);
//            wordSB.setCharAt(maxLexoC1-1, wordSB.charAt(maxLexoC2));
//            wordSB.setCharAt(maxLexoC2, tmp);
//                        
//            
//            //Reverse starting at the element to the right of the pivot
//            int left = maxLexoC1;
//            int right = wordSB.length()-1;
//            while(left < right)
//            {
//                //swap left with right
//                tmp = wordSB.charAt(left);
//                wordSB.setCharAt(left, wordSB.charAt(right));
//                wordSB.setCharAt(right, tmp);
//                left++;
//                right--;
//            }
//            
//            
//            System.out.println(wordSB);
//        }
        
        
       
        
        
    }
    
}
