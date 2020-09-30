package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.model.AS07GspTdDMSFramework;

@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0702, uuid3 = 0x0300,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07GspTdDMSFramework",
aliases = {},
description = "AS07GspTdDMSFramework",
symbol = "AS07GspTdDMSFramework")
public class AS07GspTdDMSFrameworkImpl 
extends DescriptiveFrameworkImpl implements AS07GspTdDMSFramework{

	private static final long serialVersionUID = 145566436L;

	private String primaryRFC5646LanguageCode = null;
	

	private AS07GSPDMSObject textBasedObjects = null;
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
		
		return textBasedObjects;
	}
	

	@Override
	@MediaPropertySetter("TextBasedObjects")
	public void setTextBasedObject(
			AS07GSPDMSObject textBasedObject) {

		this.textBasedObjects = textBasedObject;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0702, uuid3 = 0x0301,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "PrimaryRFC5646LanguageCode",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x800a,
			symbol = "PrimaryRFC5646LanguageCode")
	public String getPrimaryRFC5646LanguageCode() 
		throws PropertyNotPresentException {

		if (primaryRFC5646LanguageCode == null)
			throw new PropertyNotPresentException("PrimaryRFC5646LanguageCode property is not present.");
		
		return primaryRFC5646LanguageCode;
	}
	
	@Override
	@MediaPropertySetter("PrimaryRFC5646LanguageCode")
	public void setPrimaryRFC5646LanguageCode(
			String primaryRFC5646LanguageCode) {

		this.primaryRFC5646LanguageCode = primaryRFC5646LanguageCode;
	}
}
