package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.integer.UInt8;

public interface STLSubDescriptor {

	String getEventTextLanguageCode();

	void setEventTextLanguageCode(String eventTextLanguageCode);

	byte getLineNumber() throws PropertyNotPresentException;

	void setLineNumber(Byte lineNumber);

	STLSubDescriptor clone();

}