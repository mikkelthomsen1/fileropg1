package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String kildefil = "src/test/jekyll_hyde.txt";
		String statistik = "src/test/statistik.txt";
		char[] bogstav;
		try {
		      FileReader input = new FileReader( kildefil );

		      while ( input.ready() )
		        bogstav[( (char) input.read() )]

		      input.close();
		    }
		    catch ( FileNotFoundException e ) {
		      System.out.println( "Filen findes ikke: " + kildefil );
		    }
		    catch ( IOException e ) {
		      System.out.println( "Der opstod fejl under læsning fra: " + kildefil );
		    }

	}

}
