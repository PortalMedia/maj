package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.model.AS07GspBdDMSFramework;
import tv.amwa.maj.model.CryptographicFramework;
import tv.amwa.maj.record.AUID;

//060e2b34.027f0101.0d010401.02010000
@MediaClass(uuid1 = 0x0d010401, uuid2 = 0x0201, uuid3 = 0x0000,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "CryptographicFramework",
aliases = {},
description = "CryptographicFramework",
symbol = "CryptographicFramework")
public class CryptographicFrameworkImpl 
extends DescriptiveFrameworkImpl implements CryptographicFramework{

	private static final long serialVersionUID = 145836436L;

	private CryptographicContext cryptographicContextObject = null;
	//CryptographicContextStrongReference
	
	//060e2b34.01010109.06010104.020d0000
	@Override
	@MediaProperty(uuid1 = 0x06010104, uuid2 = 0x020d, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "CryptographicContextObject",
			aliases = {  },
			typeName = "CryptographicContextStrongReference",
			optional = false,
			uniqueIdentifier = false,
			symbol = "CryptographicContextObject")
	public CryptographicContext getCryptographicContextObject() 
		throws PropertyNotPresentException {
		return cryptographicContextObject;
	}
	

	@Override
	@MediaPropertySetter("CryptographicContextObject")
	public void setCryptographicContextObject(
			CryptographicContext cryptographicContextObject) {

		this.cryptographicContextObject = cryptographicContextObject;
	}

}
