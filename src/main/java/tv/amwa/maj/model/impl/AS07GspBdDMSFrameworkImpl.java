package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.model.AS07GspBdDMSFramework;

@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0702, uuid3 = 0x0200,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07GspBdDMSFramework",
aliases = {},
description = "AS07GspBdDMSFramework",
symbol = "AS07GspBdDMSFramework")
public class AS07GspBdDMSFrameworkImpl 
extends DescriptiveFrameworkImpl implements AS07GspBdDMSFramework{

	private static final long serialVersionUID = 145566436L;


	private AS07GSPDMSObject textBasedObjects = null;
	
	private String primaryRFC5646LanguageCode = null;
	
	@Override
	@MediaProperty(uuid1 = 0x06010104, uuid2 = 0x0541, uuid3 = 0x0100,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextBasedObjects",
			aliases = {  },
			typeName = "AS07GSPDMSObjectStrongReference",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x800b,
			symbol = "TextBasedObjects")
	public AS07GSPDMSObject getTextBasedObject() 
		throws PropertyNotPresentException {
		if(textBasedObjects == null) throw new PropertyNotPresentException();
		return textBasedObjects;
	}
	


	@MediaPropertySetter("TextBasedObjects")
	public void setTextBasedObject(
			AS07GSPDMSObject textBasedObject) {

		this.textBasedObjects = textBasedObject;
	}

}
