package com.diwakartech.lc.editors;

import java.beans.PropertyEditorSupport;

import com.diwakartech.lc.DTO.RegisterDTO;

public class NameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		text=text.toUpperCase();
		setValue(text);
	}

}
