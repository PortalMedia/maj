package tv.amwa.maj.model;

import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;

public interface AS07TimecodeLabelSubdescriptor extends SubDescriptor {

	String getDateTimeSymbol();

	void setDateTimeSymbol(String dateTimeSymbol);

	int getDateTimeEssenceTrackID();

	void setDateTimeEssenceTrackID(int dateTimeEssenceTrackID);
	
	int getDateTimeChannelID();
	
	void setDateTimeChannelID(int dateTimeChannelID);

}