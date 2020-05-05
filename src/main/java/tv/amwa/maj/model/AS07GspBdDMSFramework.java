package tv.amwa.maj.model;

import tv.amwa.maj.record.AUID;

public interface AS07GspBdDMSFramework {

	AUID getTextBasedObject();
	void setTextBasedObject(AUID textBasedObject);
	String getPrimaryRFC5646LanguageCode();
	void setPrimaryRFC5646LanguageCode(String primaryRFC5646LanguageCode);

}