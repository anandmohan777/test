package com.hsbc.reverse.polishnotation.services;

import com.hsbc.reverse.polishnotation.mode.input.ModeInput;
import com.hsbc.reverse.polishnotation.mode.input.ModeInputTextImpl;

/**
 * Start of the Evaluation to get the result.
 * @author shivamoberoi
 *
 */
public class Result {
	
	public static void main(String[] args) {
		ParserService parseService =new ParserServiceImpl();
		//checking with the value
		ModeInput modeInput=new ModeInputTextImpl();
		int output=parseService.evaluateNotation(modeInput.getData());
		if(output!=-1){
			System.out.println(output);
		}
		else{
			System.out.println("Invalid Polish Notation");
		}
	}

}
