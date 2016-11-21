/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptionlessonroots;
/**
 *
 * @author jimstewart
 */
public class CharacterShifter {
    /**
     * 
     * @param message   the message to be transformed
     * @param pattern   pattern to shift by
     * @param decode    true if decoded, false if it's being encoded
     * @return  The string after it's been transformed
     */
   public String shiftCharacters(String message, String pattern, boolean decode){
            String rtrnString = "";
            char newChar;
            int charNum;
            int shiftAmount = 0;
            int patternIndex = 0;
            // 0. Make a shiftAmount integer variable but don't initialize it
            // 1. create integer var patternIndex, as index of character in pattern
            
            for(int i=0;i<message.length();i++)
            {  
                // 2. Assign the character of pattern at the index to charNum
                shiftAmount = pattern.charAt(patternIndex);
                // 3. if decode is true, multiply shiftAmount by -1
                 if(decode)
                    shiftAmount*=-1;
                // 4. Increase the index variable by one
                patternIndex ++;
                // 5. take the modulus of charNum to patternString length to
                //    'wrap' the number back to beginning of message
                patternIndex = patternIndex % pattern.length();
                newChar = message.charAt(i);
                charNum = (int)newChar;
                charNum += shiftAmount;
                newChar = (char)charNum;
                rtrnString += newChar;
            }       
            return rtrnString;
      
    } 
}
