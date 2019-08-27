package example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import tw.GuessGame;
import tw.commands.GuessInputCommand;


public class GuessInputCommandTest {
	//private GuessInputCommand guessInputcommand; 
	private static String answer="1 2 3 4";
	
	
	 @Test
	    public void should_verify_with_guessGame_call() throws IOException {
		 //given
		 String inputString="2 3 4 5";
		 
		 String resultString=GuessGame.guessGame(inputString, answer);
		 
		 Assertions.assertEquals("0A3B", resultString);

	    }
	 @Test
	 public void should_verify_with_guessGame_call_with_mockito() throws IOException {
		 GuessInputCommand guessInputCommand=Mockito.mock(GuessInputCommand.class);
		 Mockito.when(guessInputCommand.input()).thenReturn("2 3 4 5");
		 String resultString=GuessGame.guessGame(guessInputCommand.input(), "1 2 3 4");
		 Assertions.assertEquals(resultString, "0A3B");
		 
	 }
		
		 
	
}
