package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07DMSIdentifierSet;
import tv.amwa.maj.model.AS07GspBdDMSFramework;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0702, uuid3 = 0x0200,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07GspBdDMSFramework",
aliases = {},
description = "AS07GspBdDMSFramework",
symbol = "AS07GspBdDMSFramework")
public class AS07GspBdDMSFrameworkImpl 
extends DescriptiveFrameworkImpl implements AS07GspBdDMSFramework{

	private static final long serialVersionUID = 145566436L;

	private AUID textBasedObject = null;
	private String primaryRFC5646LanguageCode = null;
	
	@Override
	@MediaProperty(uuid1 = 0x06010104, uuid2 = 0x0541, uuid3 = 0x0100,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextBasedObject",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x800b,
			symbol = "TextBasedObject")
	public AUID getTextBasedObject() 
		throws PropertyNotPresentException {

		if (textBasedObject == null)
			throw new PropertyNotPresentException("IdentifierValue property is not present.");
		
		return textBasedObject;
	}
	

	@Override
	@MediaPropertySetter("TextBasedObject")
	public void setTextBasedObject(
			AUID textBasedObject) {

		this.textBasedObject = textBasedObject;
	}

	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0702, uuid3 = 0x0301,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "PrimaryRFC5646LanguageCode",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
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
