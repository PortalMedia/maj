package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.EssenceDescriptor;
import tv.amwa.maj.model.InterchangeObject;
import tv.amwa.maj.model.Locator;
import tv.amwa.maj.record.AUID;

public interface TimedTextDescriptor extends AncillaryPacketsDescriptor{

	AUID getResourceId();
	void setResourceId(AUID resourceId);
	

	String getUcsEncoding();
	void setUcsEncoding(String ucsEncoding);

	String getNamespaceURI();
	void setNamespaceURI(String namespaceURI);
	
}