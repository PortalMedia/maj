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
import tv.amwa.maj.model.impl.AS07DMSIdentifierSetImpl;
import tv.amwa.maj.record.AUID;

public interface AS07CoreDMSFramework extends DescriptiveFramework {
		public String getShimName() 
			throws PropertyNotPresentException;
		public void setShimName(
				String shimName);
		public String getResponsibleOrganizationName();
		public void setResponsibleOrganizationName(
				String responsibleOrganizationName);
		
		public String getResponsibleOrganizationCode();
		public void setResponsibleOrganizationCode(
				String responsibleOrganizationCode);

		public String getSecondaryTitle();
		public void setSecondaryTitle(
				String secondaryTitle);

		public String getWorkingTitle();
		public void setWorkingTitle(
				String workingTitle);
		
		public String getPictureFormat();
		public void getPictureFormat(
				String pictureFormat);
		public String getCaptions();
		public void getCaptions(
				String captions);
		public AUID getAudioTrackLayout();
		public void setAudioTrackLayout(
				AUID audioTrackLayout);
		public String getIntendedAFD();
		public void getIntendedAFD(
				String intendedAFD);
		
		
		
		public List<AS07DMSIdentifierSetImpl> getIdentifiers();
		public void setIdentifiers(
				List<AS07DMSIdentifierSetImpl> identifiers) ;
		public void addIdentifiers(AS07DMSIdentifierSetImpl identifier);
		public int getIdentifiersSize();
		
		public String getAudioTrackLayoutComment();
		public void setAudioTrackLayoutComment(String audioTrackLayoutComment);
		
		public String getAudioTrackPrimaryLanguage();
		public void setAudioTrackPrimaryLanguage(String audioTrackPrimaryLanguage);
		
		public String getAudioTrackSecondaryLanguage();
		public void setAudioTrackSecondaryLanguage(String audioTrackSecondaryLanguage);
		

		public String getNatureOfOrganization();
		public void setNatureOfOrganization(String natureOfOrganization);
		
		public Set<AUID> getDevices();
		public void setDevices(Set<AUID> devices) ;
		public void addDevices(AUID device);
}
