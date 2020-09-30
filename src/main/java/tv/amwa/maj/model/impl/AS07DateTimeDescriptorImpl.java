package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.record.AUID;
import tv.amwa.maj.record.Rational;

@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x4600,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07DateTimeDescriptor",
aliases = {},
description = "AS07DateTimeDescriptor",
symbol = "AS07DateTimeDescriptor")
public class AS07DateTimeDescriptorImpl  extends AAFFileDescriptorImpl implements AS07DateTimeDescriptor{

	private static final long serialVersionUID = 14588466436L;

	private Rational dateTimeRate = null;
	private int containerDuration = 0;
	private AUID essenceContainer = null;
	private boolean dateTimeDropFrameFlag = false;
	private AUID dateTimeKind = null;
	private boolean dateTimeEmbedded = false;
	
	
	@Override
	@MediaProperty(uuid1 = 0x04040102, uuid2 = 0x0100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x05},
			definedName = "DateTimeRate",
			aliases = {  },
			typeName = "Rational",
			optional = true,
			pid = 0x3501,
			uniqueIdentifier = false,
			symbol = "DateTimeRate")
	public Rational getDateTimeRate() 
		throws PropertyNotPresentException {

		return dateTimeRate;
	}
	

	@Override
	@MediaPropertySetter("DateTimeRate")
	public void setDateTimeRate(Rational dateTimeRate) {

		this.dateTimeRate = dateTimeRate;
	}

	@Override
	@MediaProperty(uuid1 = 0x06010104, uuid2 = 0x0102, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x02},
			definedName = "EssenceContainer",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			pid = 0x3004,
			uniqueIdentifier = false,
			symbol = "EssenceContainer")
	public AUID getEssenceContainer() 
		throws PropertyNotPresentException {

		return essenceContainer;
	}
	

	@Override
	@MediaPropertySetter("EssenceContainer")
	public void setEssenceContainer(AUID essenceContainer) {

		this.essenceContainer = essenceContainer;
	}
	

	@Override
	@MediaProperty(uuid1 = 0x04060102, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ContainerDuration",
			aliases = {  },
			typeName = "UInt32",
			optional = true,
			uniqueIdentifier = false,
			symbol = "ContainerDuration")
	public int getContainerDuration() 
		throws PropertyNotPresentException {

		return containerDuration;
	}
	

	@Override
	@MediaPropertySetter("ContainerDuration")
	public void setContainerDuration(int containerDuration) {

		this.containerDuration = containerDuration;
	}
	
	
	@Override
	@MediaProperty(uuid1 = 0x04040102, uuid2 = 0x0200, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x05},
			definedName = "DateTimeDropFrame",
			aliases = {  },
			typeName = "Boolean",
			optional = true,
			pid = 0x3502,
			uniqueIdentifier = false,
			symbol = "DateTimeDropFrame")
	public boolean getDateTimeDropFrame() 
		throws PropertyNotPresentException {

		return dateTimeDropFrameFlag;
	}
	

	@Override
	@MediaPropertySetter("DateTimeDropFrame")
	public void setDateTimeDropFrame(boolean dateTimeDropFrameFlag) {
		this.dateTimeDropFrameFlag = dateTimeDropFrameFlag;
	}
	@Override
	@MediaProperty(uuid1 = 0x04040102, uuid2 = 0x0300, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x05},
			definedName = "DateTimeEmbedded",
			aliases = {  },
			typeName = "Boolean",
			optional = true,
			pid = 0x3503,
			uniqueIdentifier = false,
			symbol = "DateTimeEmbedded")
	public boolean getDateTimeEmbedded() 
		throws PropertyNotPresentException {

		return dateTimeEmbedded;
	}
	

	@Override
	@MediaPropertySetter("DateTimeEmbedded")
	public void setDateTimeEmbedded(boolean dateTimeEmbedded) {

		this.dateTimeEmbedded = dateTimeEmbedded;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04040102, uuid2 = 0x0400, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x05},
			definedName = "DateTimeKind",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			pid = 0x3504,
			uniqueIdentifier = false,
			symbol = "DateTimeKind")
	public AUID getDateTimeKind() 
		throws PropertyNotPresentException {

		return dateTimeKind;
	}
	

	@Override
	@MediaPropertySetter("DateTimeKind")
	public void setDateTimeKind(AUID dateTimeKind) {

		this.dateTimeKind = dateTimeKind;
	}
}
