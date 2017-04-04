package com.hsbc.reverse.polishNotation.service;
import static org.junit.Assert.*;

import org.junit.Test;

import com.hsbc.reverse.polishnotation.services.ParserService;
import com.hsbc.reverse.polishnotation.services.ParserServiceImpl;


public class ParseServiceImplTest {

	@Test
	//Valid Input
	public void testValidInput() {
		ParserService parseService=new ParserServiceImpl();		
		assertEquals(parseService.evaluateNotation("345+-"), 6);
		
	}
	
	@Test
	public void testInValidInput() {
		ParserService parseService=new ParserServiceImpl();		
		assertEquals(parseService.evaluateNotation("345+-**"), -1);
		
	}

}
