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
public class DecryptionTool {
        int shiftAmount = 5;
        /**
         * 
         * @param message   the message to be transformed
         * @return  the transformed message
         */
     	public String decrypt(String message){
            String code = "";
            char newChar;
            int charNum;
            for(int i=0;i<message.length();i++)
            {  
                newChar = message.charAt(i);
                charNum = (int)newChar;
                charNum -= shiftAmount;
                newChar = (char)charNum;
                code += newChar;
            }       
            return code;
	}
    
     	public String patternDecrypt(String message, String pattern){
            CharacterShifter cs = new CharacterShifter();
            String code = cs.shiftCharacters(message, pattern, true);
            return code;
	}
    
}
