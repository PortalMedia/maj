package tv.amwa.maj.model;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;

public interface AS07DMSIdentifierSet {

	String getIdentifierValue() throws PropertyNotPresentException;

	void setIdentifierValue(String identifierValue);

	String getIdentifierRole() throws PropertyNotPresentException;

	void setIdentifierRole(String identifierRole);

	String getIdentifierType() throws PropertyNotPresentException;

	void setIdentifierType(String identifierType);
	
	String getIdentifierComment();
	
	void setIdentifierComment(String identifierComment);

}