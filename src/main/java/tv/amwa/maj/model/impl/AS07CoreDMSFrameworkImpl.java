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
	private String responsibleOrganizationName = null;
	private String responsibleOrganizationCode = null;
	private String pictureFormat = null;
	private String captions = null;
	private AUID audioTrackLayout = null;
	private String intendedAFD = null;
	private Set<AUID> identifiers = Collections.synchronizedSet(new HashSet<AUID>());
	private Set<AUID> devices = Collections.synchronizedSet(new HashSet<AUID>());
	private String audioTrackLayoutComment = null;
	private String audioTrackSecondaryLanguage = null;
	private String audioTrackPrimaryLanguage = null;
	private String natureOfOrganization = null;
	
	
	
	
	
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

		return shimName;
	}
	

	@MediaPropertySetter("ShimName")
	public void setShimName(
			String shimName) {

		this.shimName = shimName;
	}
	
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0103,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ResponsibleOrganizationName",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8001,
			symbol = "ResponsibleOrganizationName")
	public String getResponsibleOrganizationName() 
		throws PropertyNotPresentException {

		return responsibleOrganizationName;
	}
	

	@MediaPropertySetter("ResponsibleOrganizationName")
	public void setResponsibleOrganizationName(
			String responsibleOrganizationName) {

		this.responsibleOrganizationName = responsibleOrganizationName;
	}


	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0105,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ResponsibleOrganizationCode",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "ResponsibleOrganizationCode")
	public String getResponsibleOrganizationCode() 
		throws PropertyNotPresentException {

		return responsibleOrganizationCode;
	}
	

	@MediaPropertySetter("ResponsibleOrganizationCode")
	public void setResponsibleOrganizationCode(
			String responsibleOrganizationCode) {

		this.responsibleOrganizationCode = responsibleOrganizationCode;
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

		return audioTrackLayout;
	}
	

	@MediaPropertySetter("AudioTrackLayout")
	public void setAudioTrackLayout(
			AUID audioTrackLayout) {

		this.audioTrackLayout = audioTrackLayout;
	}

	

	@MediaPropertySetter("AudioTrackPrimaryLanguage")
	public void setAudioTrackPrimaryLanguage(
			String audioTrackPrimaryLanguage) {

		this.audioTrackPrimaryLanguage = audioTrackPrimaryLanguage;
	}
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010c,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AudioTrackPrimaryLanguage",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "AudioTrackPrimaryLanguage")
	public String getAudioTrackPrimaryLanguage() 
		throws PropertyNotPresentException {

		return audioTrackPrimaryLanguage;
	}
	
	@MediaPropertySetter("AudioTrackSecondaryLanguage")
	public void setAudioTrackSecondaryLanguage(
			String audioTrackSecondaryLanguage) {

		this.audioTrackSecondaryLanguage = audioTrackSecondaryLanguage;
	}
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010d,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AudioTrackSecondaryLanguage",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "AudioTrackSecondaryLanguage")
	public String getAudioTrackSecondaryLanguage() 
		throws PropertyNotPresentException {

		return audioTrackSecondaryLanguage;
	}

	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010f,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AudioTrackLayoutComment",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "AudioTrackLayoutComment")
	public String getAudioTrackLayoutComment() 
		throws PropertyNotPresentException {

		return audioTrackLayoutComment;
	}
	
	@MediaPropertySetter("AudioTrackLayoutComment")
	public void setAudioTrackLayoutComment(
			String audioTrackLayoutComment) {

		this.audioTrackLayoutComment = audioTrackLayoutComment;
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

		return intendedAFD;
	}
	

	@MediaPropertySetter("IntendedAFD")
	public void getIntendedAFD(
			String intendedAFD) {

		this.intendedAFD = intendedAFD;
	}
	

	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0106,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "NatureOfOrganization",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "NatureOfOrganization")
	public String getNatureOfOrganization() 
		throws PropertyNotPresentException {

		return natureOfOrganization;
	}
	

	@MediaPropertySetter("NatureOfOrganization")
	public void setNatureOfOrganization(
			String natureOfOrganization) {

		this.natureOfOrganization = natureOfOrganization;
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

		return identifiers.size();
	}

	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0110,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Devices",
			aliases = { },
			typeName = "AUIDSet",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8005,
			symbol = "Devices")
	public Set<AUID> getDevices()
			throws PropertyNotPresentException {

		return new HashSet<AUID>(devices);
	}

	@MediaPropertySetter("Devices")
	public void setDevices(
			Set<AUID> devices) 
		throws IllegalArgumentException {

		if (devices == null) {
			this.devices = null;
			return;
		}

		this.devices = Collections.synchronizedSet(new HashSet<AUID>());
		for ( AUID device : devices ) {
			this.devices.add(device);
		}
	}

	@MediaSetAdd("Devices")
	public void addDevices(AUID device){
		if (device == null) {
			devices = Collections.synchronizedSet(new HashSet<AUID>());
		}
		devices.add(device);
	}



	
	
}