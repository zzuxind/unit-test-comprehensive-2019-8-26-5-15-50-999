package tw;

import java.util.Arrays;
import java.util.List;

public class GuessGame {
	
	//number 个数相同：A++;
	//位置也相同： B++,A--
	 public static String guessGame(String input,String answer) {
	    	//A:数字和位置都相同的个数
	    	//B:数字相同，位置不同
	    	int A=0,B=0;
	    	//input -> list
	    	List<String> inputList=Arrays.asList(input.split(" "));
	    	List<String> answerList=Arrays.asList(answer.split(" "));
	        //统计相同的数字
	    	for(String number:inputList) {
	    		if(answerList.contains(number)) {
	    			B++;
	    			//判断相同数字的索引是否相同
	    			if(answerList.indexOf(number) == inputList.indexOf(number)) {
	    				A++;
	    				B--;	
	    			}
	    		}
	    	}
	    	
	    	return A+"A"+B+"B";
	    }
	 

}
