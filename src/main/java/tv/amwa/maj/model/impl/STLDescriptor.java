package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.misctype.PositionType;

public interface STLDescriptor {

	PositionType getSTLReferencePointTimecode() throws PropertyNotPresentException;

	void setSTLReferencePointTimecode(PositionType stlReferencePointTimecode);

}