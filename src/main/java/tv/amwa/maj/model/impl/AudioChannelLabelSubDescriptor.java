package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.SubDescriptor;
import tv.amwa.maj.record.AUID;

public interface AudioChannelLabelSubDescriptor extends
MCALabelSubdescriptor{
	AUID getSoundfieldGroupLinkID() throws PropertyNotPresentException;

	void setDateTimeChannelID(AUID soundfieldGroupLinkID);

}