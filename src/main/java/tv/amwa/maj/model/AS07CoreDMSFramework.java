package tv.amwa.maj.model;

import java.util.Set;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.record.AUID;

public interface AS07CoreDMSFramework extends DescriptiveFramework {
		public String getShimName() 
			throws PropertyNotPresentException;
		public void setShimName(
				String shimName);
		public String getResponsibleOrganization();
		public void setResponsibleOrganization(
				String responsibleOrganization);
		public String getPictureFormat();
		public void getPictureFormat(
				String pictureFormat);
		public String getCaptions();
		public void getCaptions(
				String captions);
		public AUID getAudioTrackLayout();
		public void getAudioTrackLayout(
				AUID audioTrackLayout);
		public String getIntendedAFD();
		public void getIntendedAFD(
				String intendedAFD);
		public Set<AUID> getIdentifiers()
				throws PropertyNotPresentException;
		public void setIdentifiers(
				Set<AUID> identifiers);
		public void addIdentifiers(AUID identifier);
		public int getIdentifiersSize();
}
