public class Decipher
{
    String output = "" ;
    String input = "";
    public Decipher(String input)
    {
        this.input = input;
    }
    public void decrypt()
    {
         for (int b = 0; b < input.length(); b++){
             char letter = input.charAt(b);
             output += "" + (char)(((int) letter)-1);
             
            
    }
    System.out.println(output);
    
    }
}