package tv.amwa.maj.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import tv.amwa.maj.exception.ObjectAlreadyAttachedException;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaListAppend;
import tv.amwa.maj.industry.MediaPropertyCount;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.StrongReferenceVector;
import tv.amwa.maj.model.impl.AS07CoreDMSDeviceObjectsImpl;
import tv.amwa.maj.model.impl.AS07DMSIdentifierSetImpl;
import tv.amwa.maj.record.AUID;

public interface AS07CoreDMSFramework extends DescriptiveFramework {
	String getShimName() throws PropertyNotPresentException;

	void setShimName(String shimName);

	String getResponsibleOrganizationName() throws PropertyNotPresentException;

	void setResponsibleOrganizationName(String responsibleOrganizationName);

	String getResponsibleOrganizationCode() throws PropertyNotPresentException;

	void setResponsibleOrganizationCode(String responsibleOrganizationCode);

	String getPictureFormat() throws PropertyNotPresentException;

	void setPictureFormat(String pictureFormat);

	String getCaptions() throws PropertyNotPresentException;

	void setCaptions(String captions);

	AUID getAudioTrackLayout() throws PropertyNotPresentException;

	void setAudioTrackLayout(AUID audioTrackLayout);

	String getWorkingTitle() throws PropertyNotPresentException;

	void setWorkingTitle(String workingTitle);

	String getSecondaryTitle() throws PropertyNotPresentException;

	void setSecondaryTitle(String secondaryTitle);

	void setAudioTrackPrimaryLanguage(String audioTrackPrimaryLanguage);

	String getAudioTrackPrimaryLanguage() throws PropertyNotPresentException;

	void setAudioTrackSecondaryLanguage(String audioTrackSecondaryLanguage);

	String getAudioTrackSecondaryLanguage() throws PropertyNotPresentException;

	String getAudioTrackLayoutComment() throws PropertyNotPresentException;

	void setAudioTrackLayoutComment(String audioTrackLayoutComment);

	String getIntendedAFD() throws PropertyNotPresentException;

	void setIntendedAFD(String intendedAFD);

	String getNatureOfOrganization() throws PropertyNotPresentException;

	void setNatureOfOrganization(String natureOfOrganization);

	List<AS07DMSIdentifierSetImpl> getIdentifiers();

	void setIdentifiers(List<AS07DMSIdentifierSetImpl> identifiers) throws IllegalArgumentException;

	void addIdentifiers(AS07DMSIdentifierSetImpl identifier)
			throws NullPointerException, ObjectAlreadyAttachedException;

	int getIdentifiersSize() throws PropertyNotPresentException;

	List<AS07CoreDMSDeviceObjectsImpl> getDevices() throws PropertyNotPresentException;

	void setDevices(List<AS07CoreDMSDeviceObjectsImpl> devices) throws IllegalArgumentException;

	void addDevices(AS07CoreDMSDeviceObjectsImpl device);
}
