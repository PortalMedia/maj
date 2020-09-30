package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.model.AAFFileDescriptor;
import tv.amwa.maj.record.AUID;
import tv.amwa.maj.record.Rational;

public interface AS07DateTimeDescriptor extends AAFFileDescriptor{

	int getContainerDuration() throws PropertyNotPresentException;
	
	public Rational getDateTimeRate() 
			throws PropertyNotPresentException;
	public void setDateTimeRate(Rational dateTimeRate);

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