package tv.amwa.maj.model.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tv.amwa.maj.exception.ObjectAlreadyAttachedException;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaListAppend;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertyCount;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.MediaSetAdd;
import tv.amwa.maj.industry.StrongReferenceVector;
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
	private List<AS07DMSIdentifierSetImpl> identifiers = null;
	private List<AS07CoreDMSDeviceObjectsImpl> devices = Collections.synchronizedList(new ArrayList<AS07CoreDMSDeviceObjectsImpl>());
	private String audioTrackLayoutComment = null;
	private String audioTrackSecondaryLanguage = null;
	private String audioTrackPrimaryLanguage = null;
	private String natureOfOrganization = null;
	private String secondaryTitle = null;
	private String workingTitle = null;
	
	
	
	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0101,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "ShimName",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
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
			optional = false,
			uniqueIdentifier = false,
					pid = 0x8001,
			symbol = "ResponsibleOrganizationName")
	public String getResponsibleOrganizationName() 
		throws PropertyNotPresentException {

		if(responsibleOrganizationName==null)
			throw new PropertyNotPresentException("Missing responsibleOrganizationName");
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
		if(responsibleOrganizationCode == null) {
			throw new PropertyNotPresentException("Responsible Organization Code is not present");
		}
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
			optional = false,
			uniqueIdentifier = false,
			pid = 0x8002,
			symbol = "PictureFormat")
	public String getPictureFormat() 
		throws PropertyNotPresentException {
		if(pictureFormat == null) {
			throw new PropertyNotPresentException("PictureFormat is not present");
		}

		return pictureFormat;
	}
	

	@MediaPropertySetter("PictureFormat")
	public void setPictureFormat(
			String pictureFormat) {

		this.pictureFormat = pictureFormat;
	}
	
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010b,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Captions",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x8003,
			symbol = "Captions")
	public String getCaptions() 
		throws PropertyNotPresentException {

		return captions;
	}
	

	@MediaPropertySetter("Captions")
	public void setCaptions(
			String captions) {

		this.captions = captions;
	}


	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x010e,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "AudioTrackLayout",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
					pid = 0x8004,
			symbol = "AudioTrackLayout")
	public AUID getAudioTrackLayout() {

		return audioTrackLayout;
	}
	

	@MediaPropertySetter("AudioTrackLayout")
	public void setAudioTrackLayout(
			AUID audioTrackLayout) {

		this.audioTrackLayout = audioTrackLayout;
	}
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0107,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "WorkingTitle",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8004,
			symbol = "WorkingTitle")
	public String getWorkingTitle() 
		throws PropertyNotPresentException {

		if(workingTitle == null) {
			throw new PropertyNotPresentException("WorkingTitle is not present");
		}
		return workingTitle;
	}
	

	@MediaPropertySetter("WorkingTitle")
	public void setWorkingTitle(
			String workingTitle) {

		this.workingTitle = workingTitle;
	}
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0108,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "SecondaryTitle",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8004,
			symbol = "SecondaryTitle")
	public String getSecondaryTitle() 
		throws PropertyNotPresentException {

		if(secondaryTitle == null) {
			throw new PropertyNotPresentException("SecondaryTitle is not present");
		}
		return secondaryTitle;
	}
	

	@MediaPropertySetter("SecondaryTitle")
	public void setSecondaryTitle(
			String secondaryTitle) {

		this.secondaryTitle = secondaryTitle;
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

		if(audioTrackPrimaryLanguage == null) {
			throw new PropertyNotPresentException("AudioTrackPrimaryLanguage is not present");
		}
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

		if(audioTrackSecondaryLanguage == null) {
			throw new PropertyNotPresentException("AudioTrackSecondaryLanguage is not present");
		}
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

		if(audioTrackLayoutComment == null) {
			throw new PropertyNotPresentException("AudioTrackLayoutComment is not present");
		}
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
			optional = false,
			uniqueIdentifier = false,
			pid = 0x8006,
			symbol = "IntendedAFD")
	public String getIntendedAFD() 
		throws PropertyNotPresentException {

		return intendedAFD;
	}
	

	@MediaPropertySetter("IntendedAFD")
	public void setIntendedAFD(
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

		if(natureOfOrganization == null) {
			throw new PropertyNotPresentException("NatureOfOrganization is not present");
		}
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
			typeName = "AS07DMSIdentifierStrongReferenceVector",
			optional = false,
			uniqueIdentifier = false,
			symbol = "Identifiers")
	public List<AS07DMSIdentifierSetImpl> getIdentifiers()
	{
		if(identifiers==null) return new ArrayList<AS07DMSIdentifierSetImpl>();
		return StrongReferenceVector.getOptionalList(identifiers);
	}
	@MediaPropertySetter("Identifiers")
	public void setIdentifiers(
			List<AS07DMSIdentifierSetImpl> identifiers) 
		throws IllegalArgumentException {

		if (identifiers == null) {
			this.identifiers = null;
			return;
		}

		this.identifiers = Collections.synchronizedList(new ArrayList<AS07DMSIdentifierSetImpl>());
		for ( AS07DMSIdentifierSetImpl identifier : identifiers ) {
			this.identifiers.add(identifier);
		}
	}

	@MediaListAppend("Identifiers")
	public void addIdentifiers(AS07DMSIdentifierSetImpl identifier)
		throws NullPointerException,
			ObjectAlreadyAttachedException {

		if (identifier == null)
			throw new NullPointerException("Cannot append a null value .");
		if (identifiers.contains(identifier))
			throw new ObjectAlreadyAttachedException("The given tODO.");
		
		StrongReferenceVector.append(identifiers, identifier);
	}

	@MediaPropertyCount("Identifiers")
	public int getIdentifiersSize() 
		throws PropertyNotPresentException {

		if (identifiers == null)
			throw new PropertyNotPresentException("The optional described tracks property is not present in this descriptive marker.");

		return identifiers.size();
	}
	
	
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0110,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Devices",
			aliases = { },
			typeName = "AS07CoreDMSDeviceObjectsStrongReferenceVector",
			optional = true,
			uniqueIdentifier = false,
			symbol = "Devices")
	public List<AS07CoreDMSDeviceObjectsImpl> getDevices()
			throws PropertyNotPresentException {
		if(devices.size()==0) throw new PropertyNotPresentException();
		return new ArrayList<AS07CoreDMSDeviceObjectsImpl>(devices);
	}

	@MediaPropertySetter("Devices")
	public void setDevices(
			List<AS07CoreDMSDeviceObjectsImpl> devices) 
		throws IllegalArgumentException {

		if (devices == null) {
			this.devices = null;
			return;
		}

		this.devices = Collections.synchronizedList(new ArrayList<AS07CoreDMSDeviceObjectsImpl>());
		for ( AS07CoreDMSDeviceObjectsImpl device : devices ) {
			this.devices.add(device);
		}
	}

	@MediaSetAdd("Devices")
	public void addDevices(AS07CoreDMSDeviceObjectsImpl device){
		if (device == null) {
			devices = Collections.synchronizedList(new ArrayList<AS07CoreDMSDeviceObjectsImpl>());
		}
		devices.add(device);
	}




	
	
}