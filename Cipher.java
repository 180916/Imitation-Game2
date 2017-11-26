public class Cipher
{
    String output = "" ;
    String input = "";
    
    public Cipher(String input)
    {
     this.input = input;   
    }
 
    public void encrypt()
    {
         for (int z = 0; z < input.length(); z++){
             char letter = input.charAt(z);
             output += "" + (char)(((int) letter)+1);
             
            
    }
    System.out.println(output);
    
     }
}