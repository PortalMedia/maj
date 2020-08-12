package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.AAFFileDescriptor;
import tv.amwa.maj.model.EssenceDescriptor;
import tv.amwa.maj.model.Locator;
import tv.amwa.maj.record.AUID;

public interface AS07DateTimeDescriptor extends AAFFileDescriptor{

	int getContainerDuration() throws PropertyNotPresentException;
	
	public String getDateTimeRate() 
			throws PropertyNotPresentException;
	public void setDateTimeRate(String dateTimeRate);

	void setContainerDuration(int duration);
	public AUID getEssenceContainer() 
			throws PropertyNotPresentException;
	public void setEssenceContainer(AUID essenceContainer);
	
	
	public boolean getDateTimeDropFrame() 
			throws PropertyNotPresentException;
	public void setDateTimeDropFrame(boolean dateTimeDropFrameFlag);
	
	public boolean getDateTimeEmbedded();
	public void setDateTimeEmbedded(boolean dateTimeEmbedded);
	public AUID getDateTimeKind() ;
	public void setDateTimeKind(AUID dateTimeKind);

}