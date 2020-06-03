package tv.amwa.maj.model;

import java.util.List;

import tv.amwa.maj.model.impl.AS07GSPDMSObjectImpl;
import tv.amwa.maj.record.AUID;

public interface AS07GspTdDMSFramework {
	public AS07GSPDMSObject getTextBasedObject() ;
		public void setTextBasedObject(
				AS07GSPDMSObject chunk);
	String getPrimaryRFC5646LanguageCode();
	void setPrimaryRFC5646LanguageCode(String primaryRFC5646LanguageCode);

}