package tv.amwa.maj.model.impl;

import java.io.Serializable;
import java.util.ArrayList;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x6c00,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "SoundfieldGroupLabelSubDescriptor",
aliases = {},
description = "SoundfieldGroupLabelSubDescriptor",
symbol = "SoundfieldGroupLabelSubDescriptor")
public class SoundfieldGroupLabelSubDescriptorImpl 

extends MCALabelSubDescriptorImpl
implements
	Cloneable,
	Serializable, SoundfieldGroupLabelSubDescriptor{

	private static final long serialVersionUID = 14993822436L;

	private AUID[] groupOfSoundfieldGroupsLinkID = null;
	
	//060e2b34.0101010e.01030701.04000000
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0400, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "GroupOfSoundfieldGroupsLinkID",
			aliases = {  },
			typeName = "AUIDArray",
			optional = false,
			uniqueIdentifier = false,
			symbol = "GroupOfSoundfieldGroupsLinkID")
	public AUID[] getGroupOfSoundfieldGroupsLinkID() 
		throws PropertyNotPresentException {
		return groupOfSoundfieldGroupsLinkID;
	}
	

	@Override
	@MediaPropertySetter("GroupOfSoundfieldGroupsLinkID")
	public void setGroupOfSoundfieldGroupsLinkID(
			AUID[] groupOfSoundfieldGroupsLinkID) {

		this.groupOfSoundfieldGroupsLinkID = groupOfSoundfieldGroupsLinkID;
	}
}
