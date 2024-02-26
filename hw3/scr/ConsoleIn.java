
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 Class for robust keyboard input.
 If the user enters an improper input, that is, an input of the wrong type
 or a blank line when the line should be nonblank, then the user is given
 an error message and is prompted to reenter the input

 @author Walter Savitch September 18, 2003
*/
public class ConsoleIn
{

    private static final BufferedReader inputObject =
             new BufferedReader(new InputStreamReader(System.in));


    /**
     Reads a line of text and returns that line as a String value.
     This will read the rest of a line if the line is already partially read.

     @return The line input from the keyboard.
    */
    public static String readLine( )
    {
        String inputLine = null;

        try
        {
            inputLine = inputObject.readLine( );
        }
        catch(IOException e)
        {
            System.out.println("Fatal Error.Aborting.");
            System.exit(0);
        }

        return inputLine;
    }


    /**
     The user is supposed to enter a whole number of type int on a line by
     itself. There may be whitespace before and/or after the number.
     Returns the number entered as a value of type int. The rest of the line
     is discarded.If the input is not entered correctly, then in most cases,
     the user will be asked to reenter the input. In particular, incorrect
     number formats and blank lines result in a prompt to reenter the input.

     @return Returns the integer input.
    */
    public static int readLineInt( )
    {
        String inputString = null;
        int number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Integer.parseInt(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                         "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("a whole number written as an");
                System.out.println("ordinary numeral, such as 42.");
                System.out.println("Do not include a plus sign.");
                System.out.println("Minus signs are OK,");

                System.out.println("Try again.");
                System.out.println("Enter a whole number:");
            }
        }

        return number;
    }


    /**
     The user is supposed to enter a whole number of type long
     on a line by itself. There may be whitespace before
     and/or after the number.
     Returns the number entered as a value of type long.
     The rest of the line is discarded.If the input is not
     entered correctly, then in most cases, the user will be asked
     to reenter the input. In particular, incorrect number formats
     and blank lines result in a prompt to reenter the input.

     @return Returns the integer input.
    */
    public static long readLineLong( )
    {
        String inputString = null;
        long number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Long.parseLong(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                         "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("a whole number written as an");
                System.out.println("ordinary numeral, such as 42");
                System.out.println("Do not include a plus sign.");
                System.out.println("Minus signs are OK,");

                System.out.println("Try again.");
                System.out.println("Enter a whole number:");
            }
        }

         return number;
     }


    /**
     The user is supposed to enter a whole number of type byte
     on a line by itself. There may be whitespace before
     and/or after the number.
     Returns the number entered as a value of type byte.
     The rest of the line is discarded.If the input is not
     entered correctly, then in most cases, the user will be asked
     to reenter the input. In particular, incorrect number formats
     and blank lines result in a prompt to reenter the input.

     @return Returns the integer input.
    */
    public static byte readLineByte( )
    {
        String inputString = null;
        byte number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Byte.parseByte(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                         "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("a whole number written as an");
                System.out.println("ordinary numeral, such as 42");
                System.out.println("Do not include a plus sign.");
                System.out.println("Minus signs are OK,");

                System.out.println("Try again.");
                System.out.println("Enter a whole number:");
            }
        }

        return number;
    }


    /**
     The user is supposed to enter a whole number of type short
     on a line by itself. There may be whitespace before
     and/or after the number.
     Returns the number entered as a value of type short.
     The rest of the line is discarded.If the input is not
     entered correctly, then in most cases, the user will be asked
     to reenter the input. In particular, incorrect number formats
     and blank lines result in a prompt to reenter the input.

     @return Returns the integer input.
    */
    public static short readLineShort( )
    {
        String inputString = null;
        short number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Short.parseShort(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                         "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("a whole number written as an");
                System.out.println("ordinary numeral, such as 42");
                System.out.println("Do not include a plus sign.");
                System.out.println("Minus signs are OK,");

                System.out.println("Try again.");
                System.out.println("Enter a whole number:");
            }
        }

        return number;
    }


    /**
     The user is supposed to enter a number of type double on a line by itself.
     There may be whitespace before and/or after the number.
     Returns the number entered as a value of type double. The rest of the line
     is discarded. If the input is not entered correctly, then in most cases,
     the user will be asked to reenter the input. In particular, incorrect
     number formats and blank lines result in a prompt to reenter the input.

     @return The floating point number input.
    */
    public static double readLineDouble( )
    {
        String inputString = null;
        double number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Double.parseDouble(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                            "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("an ordinary number either with");
                System.out.println("or without a decimal point,");
                System.out.println("such as 42 or 41.999");
                System.out.println("Try again.");
                System.out.println("Enter a number:");
            }
        }

        return number;
    }


    /**
     The user is supposed to enter a number of type float
     on a line by itself. There may be whitespace before
     and/or after the number.
     Returns the number entered as a value of type float.
     The rest of the line is discarded.If the input is not
     entered correctly, then in most cases, the user will be asked
     to reenter the input. In particular, incorrect number formats
     and blank lines result in a prompt to reenter the input.

     @return The floating point number input.
    */
    public static float readLineFloat( )
    {
        String inputString = null;
        float number = 0;//To keep the compiler happy.
        boolean done = false;

        while (! done)
        {
            try
            {
                inputString = readLine( );
                number = Float.parseFloat(inputString.trim( ));
                done = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                         "Input number is not in correct format.");
                System.out.println("The input number must be");
                System.out.println("an ordinary number either with");
                System.out.println("or without a decimal point,");
                System.out.println("such as 42 or 42.999");
                System.out.println("Try again.");
                System.out.println("Enter a number:");
            }
        }

        return number;
    }


    /**
     Returns the first non-whitespace character on the input line
     The rest of the input line is discarded. If the line contains
     only whitespace, the user is asked to reenter the line.

     @return The first non-whitespace character on the input line.
    */
    public static char readLineNonwhiteChar( )
    {
        boolean done = false;
        String inputString = null;
        char nonWhiteChar = ' ';//To keep the compiler happy.

        while (! done)
        {
            inputString = readLine( );
            inputString = inputString.trim( );
            if (inputString.length( ) == 0)
            {
                System.out.println("Input is not correct.");
                System.out.println("The input line must contain at");
                System.out.println("least one non-whitespace character.");
                System.out.println("Try again.");
                System.out.println("Enter input:");
            }
            else
            {
                nonWhiteChar = inputString.charAt(0);
                done = true;
            }
        }

        return nonWhiteChar;
    }


    /**
     Input should consist of a single word on a line, possibly surrounded by
     whitespace. The line is read and discarded. If the input word is "true" or
    "t", then true is returned. If the input word is "false" or "f", then false
     is returned. Uppercase and lowercase letters are considered equal. If the
     user enters anything else, the user is asked to reenter the input.

     @return The boolean value entered.
    */
    public static boolean readLineBoolean( )
    {
        boolean done = false;
        String inputString = null;
        boolean valueReturned = false;//To keep the compiler happy.

        while (! done)
        {
            inputString = readLine( );
            inputString = inputString.trim( );
            if (inputString.equalsIgnoreCase("true")
                   || inputString.equalsIgnoreCase("t"))
            {
                valueReturned = true;
                done = true;
            }
            else if (inputString.equalsIgnoreCase("false")
                        || inputString.equalsIgnoreCase("f"))
            {
                valueReturned = false;
                done = true;
            }
            else
            {
                System.out.println("Input is not correct.");
                System.out.println("The only valid inputs are:");
                System.out.println("the word true,");
                System.out.println("the word false,");
                System.out.println("the letter T,");
                System.out.println("the letter F.");
                System.out.println("Any combination of upper- and");
                System.out.println("lowercase letters is acceptable");
                System.out.println("Try again.");
                System.out.println("Enter input:");
            }
         }

        return valueReturned;
    }

}

