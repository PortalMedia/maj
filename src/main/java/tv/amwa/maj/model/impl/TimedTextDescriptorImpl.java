package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x6400,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "TimedTextDescriptorImpl",
aliases = {},
description = "TimedTextDescriptorImpl",
symbol = "TimedTextDescriptorImpl")
public class TimedTextDescriptorImpl  extends AncillaryPacketsDescriptorImpl implements TimedTextDescriptor{

	private static final long serialVersionUID = 14588466436L;

	private AUID resourceId = null;
	private String ucsEncoding = null;
	private String namespaceURI = null;
	
	@Override
	@MediaProperty(uuid1 = 0x01011512, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0c},
			definedName = "ResourceId",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
					pid = 0x801a,
			symbol = "ResourceId")
	public AUID getResourceId() 
		throws PropertyNotPresentException {
		if(resourceId == null) throw new PropertyNotPresentException();

		return resourceId;
	}
	

	@Override
	@MediaPropertySetter("ResourceId")
	public void setResourceId(AUID resourceId) {

		this.resourceId = resourceId;
	}

	@Override
	@MediaProperty(uuid1 = 0x04090500, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0c},
			definedName = "UcsEncoding",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			pid = 0x801b,
			uniqueIdentifier = false,
			symbol = "UcsEncoding")
	public String getUcsEncoding() 
		throws PropertyNotPresentException {

		return ucsEncoding;
	}
	
	@Override
	@MediaPropertySetter("UcsEncoding")
	public void setUcsEncoding(String ucsEncoding) {

		this.ucsEncoding = ucsEncoding;
	}

	@Override
	@MediaProperty(uuid1 = 0x01020105, uuid2 = 0x0100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x08},
			definedName = "NamespaceURI",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "NamespaceURI")
	public String getNamespaceURI() 
		throws PropertyNotPresentException {
		if(namespaceURI == null) throw new PropertyNotPresentException();
		return namespaceURI;
	}
	
	@Override
	@MediaPropertySetter("NamespaceURI")
	public void setNamespaceURI(String namespaceURI) {

		this.namespaceURI = namespaceURI;
	}
}
