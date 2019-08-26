package example;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import tw.GuessGame;


public class GuessInputCommandTest {
	//private GuessInputCommand guessInputcommand; 
	private static String answer="1 2 3 4";
	
	
	 @Test
	    public void should_verify_with_process_call_with_mockito() throws IOException {
		 //given
		 String inputString="2 3 4 5";
		 
		 String resultString=GuessGame.guessGame(inputString, answer);
		 
		 Assertions.assertEquals("0A3B", resultString);

	    }
		 
	    }
