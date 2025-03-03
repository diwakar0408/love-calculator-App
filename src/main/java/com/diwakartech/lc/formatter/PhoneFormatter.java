package com.diwakartech.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.diwakartech.lc.DTO.PhoneDTO;

public class PhoneFormatter implements Formatter<PhoneDTO> {

	@Override
	public String print(PhoneDTO phodto, Locale locale) {
		return phodto.getCountryCode() + "-" + phodto.getPhoneCode();
	}

	@Override
	public PhoneDTO parse(String completePhoneNumber, Locale locale) throws ParseException {
		String[] phonearr = completePhoneNumber.split("-");
		PhoneDTO pdto = new PhoneDTO();
		pdto.setCountryCode(phonearr[0]);
		pdto.setPhoneCode(phonearr[1]);
		return pdto;
	}

}
