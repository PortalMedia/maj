package tv.amwa.maj.model.impl;

import java.util.ArrayList;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.model.SubDescriptor;
import tv.amwa.maj.record.AUID;

public interface SoundfieldGroupLabelSubDescriptor extends
 MCALabelSubdescriptor {

	void setGroupOfSoundfieldGroupsLinkID(AUID[] groupOfSoundfieldGroupsLinkID);

	AUID[] getGroupOfSoundfieldGroupsLinkID() throws PropertyNotPresentException;

}