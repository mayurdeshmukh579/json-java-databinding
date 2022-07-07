package com.maytech.json_java_databinding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static  void main(String[] args) throws StreamReadException, DatabindException, IOException {
	   ObjectMapper objectMapper = new ObjectMapper();
	   
	   //reading data from json file
	   student  std = objectMapper.readValue(new File("data/student.json"), student.class);
	   System.out.println(std);
	   
	   student student1 = new student();
	   student1.setName("rahul dravid");
	   student1.setCity("Banglore");
	   student1.setId(1);
	   objectMapper.writeValue(new File("data/studentWrite.json"), student1);
	}
}
