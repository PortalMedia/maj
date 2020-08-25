package tv.amwa.maj.model.impl;

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
import tv.amwa.maj.model.AS07CoreDMSFramework;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0200,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		  definedName = "AS07CoreDMSDeviceObjects",
		  aliases = {},
		  description = "AS07CoreDMSDeviceObjects",
		  symbol = "AS07CoreDMSDeviceObjects")
public class AS07CoreDMSDeviceObjectsImpl
		extends DescriptiveFrameworkImpl
		implements AS07CoreDMSDeviceObjects
{
	private static final long serialVersionUID = 1454446435L;

	private String deviceType = null;
	private String manufacturer = null;
	private String model = null;
	private String serialNumber = null;
	private String usageDescription = null;
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0206,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "UsageDescription",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "UsageDescription")
	public String getUsageDescription() 
		throws PropertyNotPresentException {

		return usageDescription;
	}
	

	@MediaPropertySetter("UsageDescription")
	public void setUsageDescription(
			String usageDescription) {

		this.usageDescription = usageDescription;
	}
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0205,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "SerialNumber",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "SerialNumber")
	public String getSerialNumber() 
		throws PropertyNotPresentException {

		return serialNumber;
	}
	

	@MediaPropertySetter("SerialNumber")
	public void setSerialNumber(
			String serialNumber) {

		this.serialNumber = serialNumber;
	}
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0204,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Model",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "Model")
	public String getModel() 
		throws PropertyNotPresentException {

		return model;
	}
	

	@MediaPropertySetter("Model")
	public void setModel(
			String model) {

		this.model = model;
	}
	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0203,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Manufacturer",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "Manufacturer")
	public String getManufacturer() 
		throws PropertyNotPresentException {

		return manufacturer;
	}
	

	@MediaPropertySetter("Manufacturer")
	public void setManufacturer(
			String manufacturer) {

		this.manufacturer = manufacturer;
	}
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0202,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "DeviceType",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "DeviceType")
	public String getDeviceType() 
		throws PropertyNotPresentException {

		return deviceType;
	}
	

	@MediaPropertySetter("DeviceType")
	public void setDeviceType(
			String deviceType) {

		this.deviceType = deviceType;
	}
	





	
	
}