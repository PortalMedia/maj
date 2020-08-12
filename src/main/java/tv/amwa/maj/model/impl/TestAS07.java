package tv.amwa.maj.model.impl;

import java.util.List;

import tv.amwa.maj.exception.ObjectAlreadyAttachedException;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaListAppend;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertyCount;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.MediaSetAdd;
import tv.amwa.maj.record.AUID;

public interface TestAS07 {

	String getShimName() throws PropertyNotPresentException;

	void setShimName(String shimName);

	String getResponsibleOrganizationName() throws PropertyNotPresentException;

	void setResponsibleOrganizationName(String responsibleOrganizationName);

	String getResponsibleOrganizationCode() throws PropertyNotPresentException;

	void setResponsibleOrganizationCode(String responsibleOrganizationCode);

	String getPictureFormat() throws PropertyNotPresentException;

	void getPictureFormat(String pictureFormat);

	String getCaptions() throws PropertyNotPresentException;

	void getCaptions(String captions);

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

	void getIntendedAFD(String intendedAFD);

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