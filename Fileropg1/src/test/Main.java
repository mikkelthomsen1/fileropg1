package test;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		String filename = "src/test/test.txt";
	    try {
	      FileReader input = new FileReader( filename );

	      while ( input.ready() )
	        System.out.print( (char) input.read() );

	      input.close();
	    }
	    catch ( FileNotFoundException e ) {
	      System.out.println( "Filen findes ikke: " + filename );
	    }
	    catch ( IOException e ) {
	      System.out.println( "Der opstod fejl under l?sning fra: " + filename );
	    }
	    }
	}


	
