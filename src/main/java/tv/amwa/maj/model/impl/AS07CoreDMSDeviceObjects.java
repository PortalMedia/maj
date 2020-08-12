package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AAFFileDescriptor;
import tv.amwa.maj.model.DescriptiveFramework;
import tv.amwa.maj.model.EssenceDescriptor;
import tv.amwa.maj.model.InterchangeObject;
import tv.amwa.maj.model.Locator;
import tv.amwa.maj.record.AUID;

public interface AS07CoreDMSDeviceObjects extends DescriptiveFramework{

	void setDeviceType(String deviceType);
	String getDeviceType();

	void setManufacturer(String manufacturer);
	String getManufacturer();
	

	void setModel(String model);
	String getModel();
	
	void setSerialNumber(String serialNumber);
	String getSerialNumber();
	
	void setUsageDescription(String usageDescription);
	String getUsageDescription();
	

}