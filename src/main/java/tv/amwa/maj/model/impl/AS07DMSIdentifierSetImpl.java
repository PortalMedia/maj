package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07DMSIdentifierSet;
import tv.amwa.maj.record.AUID;

//060E2B34 02530101 0D0E0101 07010300
@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0300,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07DMSIdentifierSet",
aliases = {},
description = "AS07DMSIdentifierSet",
symbol = "AS07DMSIdentifierSet")
public class AS07DMSIdentifierSetImpl 
extends DescriptiveFrameworkImpl implements AS07DMSIdentifierSet{

	private static final long serialVersionUID = 145566435L;

	private String identifierValue = null;
	private String identifierRole = null;
	private String identifierType = null;
	private String identifierComment = null;
	
	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0302,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "IdentifierValue",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8007,
			symbol = "IdentifierValue")
	public String getIdentifierValue() 
		throws PropertyNotPresentException {

		if (identifierValue == null)
			throw new PropertyNotPresentException("IdentifierValue property is not present.");
		
		return identifierValue;
	}
	

	@Override
	@MediaPropertySetter("IdentifierValue")
	public void setIdentifierValue(
			String identifierValue) {

		this.identifierValue = identifierValue;
	}
	
	
	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0303,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "IdentifierRole",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8008,
			symbol = "IdentifierRole")
	public String getIdentifierRole() 
		throws PropertyNotPresentException {

		if (identifierRole == null)
			throw new PropertyNotPresentException("IdentifierRole property is not present.");
		
		return identifierRole;
	}
	

	@Override
	@MediaPropertySetter("IdentifierRole")
	public void setIdentifierRole(
			String identifierRole) {

		this.identifierRole = identifierRole;
	}
	

	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0304,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "IdentifierType",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8009,
			symbol = "IdentifierType")
	public String getIdentifierType() 
		throws PropertyNotPresentException {

		if (identifierType == null)
			throw new PropertyNotPresentException("IdentifierType property is not present.");
		
		return identifierType;
	}
	

	@Override
	@MediaPropertySetter("IdentifierType")
	public void setIdentifierType(
			String identifierType) {

		this.identifierType = identifierType;
	}
	

	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0305,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "IdentifierComment",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8010,
			symbol = "IdentifierType")
	public String getIdentifierComment() 
		throws PropertyNotPresentException {

		if (identifierComment == null)
			throw new PropertyNotPresentException("IdentifierComment property is not present.");
		
		return identifierComment;
	}
	

	@Override
	@MediaPropertySetter("IdentifierComment")
	public void setIdentifierComment(
			String identifierComment) {

		this.identifierComment = identifierComment;
	}
}