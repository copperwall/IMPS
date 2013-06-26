/**
 * IMPS - A Java implementation of a MIPS Computer
 *
 * @author Chris Opperwall
 * @version 1.1 June 9th, 2013
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Imps {
   public static void main(String[] args) throws FileNotFoundException {
      ImpsTools sys = 
         new ImpsTools(new File(args[0]));   /* MIPS Emulation class */
      Scanner scan, stringScan;              /* Scans instructions/scripts */
      String input;                          /* Stores emulator commands */
      File script;                           /* Script of commands to run */

      /* Checks to see if there is a script to read */
      if (args.length == 2) {
         script = new File(args[1]);
         scan = new Scanner(script);
      }
      else
         scan = new Scanner(System.in);
      System.out.print("mips> ");
      
      while (scan.hasNext()) {
         input = scan.nextLine();
         if (args.length == 2)
            System.out.println(input);
         stringScan = new Scanner(input);
         input = stringScan.next();
         if (input.equals("d"))
            sys.dumpRegState();
         else if (input.equals("h"))
            sys.help();
         else if (input.equals("s")) {
            if (stringScan.hasNextInt())
               sys.step(stringScan.nextInt());
            else
               sys.step(1);
         }
         else if (input .equals("r"))
            sys.step(-1);
         else if (input.equals("m"))
            sys.memDisplay(stringScan.nextInt(), stringScan.nextInt());
         else if (input.equals("c"))
            sys.simReset();
         else if (input.equals("q"))
            break;
         System.out.print("\nmips> ");
      }
   }
}
