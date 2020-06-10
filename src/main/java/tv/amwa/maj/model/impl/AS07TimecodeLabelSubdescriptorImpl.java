package tv.amwa.maj.model.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tv.amwa.maj.exception.ObjectAlreadyAttachedException;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaListAppend;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertyCount;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.MediaSetAdd;
import tv.amwa.maj.industry.StrongReferenceVector;
import tv.amwa.maj.model.AS07DMSIdentifierSet;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.model.AS07TimecodeLabelSubdescriptor;
import tv.amwa.maj.record.AUID;
//060E2B34 02530101 0D0E0101 07010400
@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0704, uuid3 = 0x0100,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07TimecodeLabelSubdescriptor",
aliases = {},
description = "AS07TimecodeLabelSubdescriptor",
symbol = "AS07TimecodeLabelSubdescriptor")
public class AS07TimecodeLabelSubdescriptorImpl 

extends
DescriptiveFrameworkImpl
implements
	Cloneable,
	Serializable, AS07TimecodeLabelSubdescriptor{

	private static final long serialVersionUID = 144366436L;

	
	private String dateTimeSymbol = null;
	private int dateTimeEssenceTrackID;
	private int dateTimeChannelID;
	/*
	 DateTimeChannelID-key
DateTimeChannelID-length
DateTimeChannelID-value 
	 
	 */
	//060E2B34 01010101 0D0E0101 07040101
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0704, uuid3 = 0x0103,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "DateTimeChannelID",
			aliases = {  },
			typeName = "UInt32",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8018,
			symbol = "DateTimeChannelID")
	public int getDateTimeChannelID() {
		return dateTimeChannelID;
	}
	
	@MediaPropertySetter("DateTimeChannelID")
	public void setDateTimeChannelID(
			int dateTimeChannelID) {

		this.dateTimeChannelID = dateTimeChannelID;
	}
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0704, uuid3 = 0x0101,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "DateTimeSymbol",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8016,
			symbol = "DateTimeSymbol")
	public String getDateTimeSymbol() {
		return dateTimeSymbol;
	}
	
	@MediaPropertySetter("DateTimeSymbol")
	public void setDateTimeSymbol(
			String dateTimeSymbol) {

		this.dateTimeSymbol = dateTimeSymbol;
	}
	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0704, uuid3 = 0x0102,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "DateTimeEssenceTrackID",
			aliases = {  },
			typeName = "UInt32",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8016,
			symbol = "DateTimeEssenceTrackID")
	public int getDateTimeEssenceTrackID() {
		return dateTimeEssenceTrackID;
	}
	
	@MediaPropertySetter("DateTimeEssenceTrackID")
	public void setDateTimeEssenceTrackID(
			int dateTimeEssenceTrackID) {

		this.dateTimeEssenceTrackID = dateTimeEssenceTrackID;
	}

	
}
