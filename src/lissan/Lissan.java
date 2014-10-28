/********************************************
*    Lissan Ethiopian Programming Language
*
*    ልሳን የኢትዮጲያ ኮምፒተር ኣሰረ ቋንቋ 
*    www.ልሳን.com
*    
*     Created with Lissan
*     User: Biruh Tesfaye
*     Date: 10/24/2014
*********************************************/

package lissan;

public class Lissan {

    /**
     * Main method for the lissan program
     **/     
    public static void main(String args[])
    {
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("~~~~~ ልሳን የኢትዮጲያ ኮምፒተር መግበርት ቋንቋ ~~~~~~~ ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println();
        
        boolean processFilesFlag;
        boolean processDirFlag;
        
        String filename=new String(), dirname=new String(), outputpath=new String();

        if (args.length <4 || args.length>4)
         {
            System.out.println();
            System.out.println("^^^^^^^^^^^^^^ እርዳታ ^^^^^^^^^^^^^^^^^^^^");
            System.out.println(" ይህን ፕሮግራም ለመጠቀም፣ የልሳን ሰነዶች ያስፈልጋሉ። ");
            System.out.println(" ያሉትን ሰነዶች ወይም መሐደር ይጠቁሙ ። ");
            System.out.println(" ምሳሌ  ");
            System.out.println(" >> ልሳን.jar -ሰነዶች የኔፕሮግራም.ልሳን [-መሐደር /ህ/ል/ምሳሌ/መሃደር] -ውጤት የኔፕሮግራም.jar   ");
            System.out.println();
            System.out.println();
        }   
        else
        { 
            if(args[0].equals("-ሰነዶች"))
            {                
                filename = args[1];
                processFilesFlag = true;
            }
            else if(args[0].equals("-መሐደር"))
            {                
                dirname = args[1];
                processDirFlag = true;
            }
            
            if(args[2].equals("-ውጤት"))
                outputpath = args[3];
        }        
        
        // at this point the input has been parsed the program is ready to begin
        // 
       
        System.out.println("filename = " + filename + "  directory=" + dirname + " outputpath=" +outputpath);
    }

    /**
     * Run method for the Lissan Program
     * 
     */
    public static void run()
    {
        
    }
}
