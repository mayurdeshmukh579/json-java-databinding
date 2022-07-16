package com.maytech.lc.formator;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.maytech.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		System.out.println("inside the parse method of PhoneFormatter");
		
		//Split the string received from user	
		
		String[] phoneNumber = completePhoneNumber.split("-");
		
		//Extract the countryCode and store it into phone class countryCodePoetry
		
		Phone phone = new Phone(); 
		phone.setCountryCode(phoneNumber[0]);
		phone.setPhoneNumber(phoneNumber[1]);
		
		return phone;
	}

}
