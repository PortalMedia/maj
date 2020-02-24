package tv.amwa.maj.model.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.MediaSetAdd;
import tv.amwa.maj.model.AS07CoreDMSFramework;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0100,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		  definedName = "AS07CoreDMSFramework",
		  aliases = {},
		  description = "AS07CoreDMSFramework",
		  symbol = "AS07CoreDMSFramework")
public class AS07CoreDMSFrameworkImpl 
		extends DescriptiveFrameworkImpl
		implements AS07CoreDMSFramework
{
	private static final long serialVersionUID = 1456456435L;

	private String shimName = null;
	private String responsibleOrganization = null;
	private String pictureFormat = null;
	private String captions = null;
	private AUID audioTrackLayout = null;
	private String intendedAFD = null;
	private Set<AUID> identifiers = Collections.synchronizedSet(new HashSet<AUID>());
	
	
	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0101,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ShimName",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8000,
			symbol = "ShimName")
	public String getShimName() 
		throws PropertyNotPresentException {

		if (shimName == null)
			throw new PropertyNotPresentException("ShimName property is not present.");
		
		return shimName;
	}
	

	@MediaPropertySetter("ShimName")
	public void setShimName(
			String shimName) {

		this.shimName = shimName;
	}
	
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0103,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ResponsibleOrganization",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8001,
			symbol = "ResponsibleOrganization")
	public String getResponsibleOrganization() 
		throws PropertyNotPresentException {

		if (responsibleOrganization == null)
			throw new PropertyNotPresentException("rResponsibleOrganization property is not present.");
		
		return responsibleOrganization;
	}
	

	@MediaPropertySetter("ResponsibleOrganization")
	public void setResponsibleOrganization(
			String responsibleOrganization) {

		this.responsibleOrganization = responsibleOrganization;
	}
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0109,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "PictureFormat",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8002,
			symbol = "PictureFormat")
	public String getPictureFormat() 
		throws PropertyNotPresentException {

		if (pictureFormat == null)
			throw new PropertyNotPresentException("PictureFormat property is not present.");
		
		return pictureFormat;
	}
	

	@MediaPropertySetter("PictureFormat")
	public void getPictureFormat(
			String pictureFormat) {

		this.pictureFormat = pictureFormat;
	}
	
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010b,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Captions",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8003,
			symbol = "Captions")
	public String getCaptions() 
		throws PropertyNotPresentException {

		if (captions == null)
			throw new PropertyNotPresentException("Captions property is not present.");
		
		return captions;
	}
	

	@MediaPropertySetter("Captions")
	public void getCaptions(
			String captions) {

		this.captions = captions;
	}
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010e,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AudioTrackLayout",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8004,
			symbol = "AudioTrackLayout")
	public AUID getAudioTrackLayout() 
		throws PropertyNotPresentException {

		if (audioTrackLayout == null)
			throw new PropertyNotPresentException("AudioTrackLayout property is not present.");
		
		return audioTrackLayout;
	}
	

	@MediaPropertySetter("AudioTrackLayout")
	public void getAudioTrackLayout(
			AUID audioTrackLayout) {

		this.audioTrackLayout = audioTrackLayout;
	}

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010a,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "IntendedAFD",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8006,
			symbol = "IntendedAFD")
	public String getIntendedAFD() 
		throws PropertyNotPresentException {

		if (intendedAFD == null)
			throw new PropertyNotPresentException("AudioTrackLayout property is not present.");
		
		return intendedAFD;
	}
	

	@MediaPropertySetter("IntendedAFD")
	public void getIntendedAFD(
			String intendedAFD) {

		this.intendedAFD = intendedAFD;
	}
	
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0102,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Identifiers",
			aliases = { },
			typeName = "AUIDSet",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8005,
			symbol = "Identifiers")
	public Set<AUID> getIdentifiers()
			throws PropertyNotPresentException {

		if (identifiers == null)
			throw new PropertyNotPresentException("The optional described tracks property is not present in this descriptive marker.");

		return new HashSet<AUID>(identifiers);
	}

	@MediaPropertySetter("Identifiers")
	public void setIdentifiers(
			Set<AUID> identifiers) 
		throws IllegalArgumentException {

		if (identifiers == null) {
			this.identifiers = null;
			return;
		}

		this.identifiers = Collections.synchronizedSet(new HashSet<AUID>());
		for ( AUID identifier : identifiers ) {
			this.identifiers.add(identifier);
		}
	}

	@MediaSetAdd("Identifiers")
	public void addIdentifiers(AUID identifier){
		if (identifiers == null) {
			identifiers = Collections.synchronizedSet(new HashSet<AUID>());
		}
		identifiers.add(identifier);
	}
	
	public int getIdentifiersSize() 
		throws PropertyNotPresentException {

		if (identifiers == null)
			throw new PropertyNotPresentException("The optional described tracks property is not present in this descriptive marker.");

		return identifiers.size();
	}
	
	
}