package tv.amwa.maj.model.impl;

import java.io.Serializable;
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
import tv.amwa.maj.industry.StrongReferenceVector;
import tv.amwa.maj.model.AS07GSPDMSObject;
import tv.amwa.maj.record.AUID;
//060E2B34 02530101 0D0E0101 07010400
@MediaClass(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0400,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "AS07GSPDMSObject",
aliases = {},
description = "AS07GSPDMSObject",
symbol = "AS07GSPDMSObject")
public class AS07GSPDMSObjectImpl 

extends
InterchangeObjectImpl
implements
	Cloneable,
	Serializable ,
AS07GSPDMSObject{

	private static final long serialVersionUID = 145566436L;

	private AUID textBasedMetadataPayloadSchemeIdentifier = null;
	private String rfc5646TextLanguageCode = null;
	private String mimeMediaType = null;
	private String textMimeMediaType = null;
	private String dataDescriptions = null;
	private String textDataDescriptions = null;
	private String note = null;
	private int genericStreamId;
	private List<AS07DMSIdentifierSetImpl> identifiers = Collections.synchronizedList(new ArrayList<AS07DMSIdentifierSetImpl>());;
	
	//060E2B34 0101010D 04060806 00000000
	@MediaProperty(uuid1 = 0x04060806, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextBasedMetadataPayloadSchemeIdentifier",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "TextBasedMetadataPayloadSchemeIdentifier")
	public AUID getTextBasedMetadataPayloadSchemeIdentifier() 
		throws PropertyNotPresentException {

		if (textBasedMetadataPayloadSchemeIdentifier == null)
			throw new PropertyNotPresentException("TextBasedMetadataPayloadSchemeIdentifier property is not present.");
		
		return textBasedMetadataPayloadSchemeIdentifier;
	}
	@MediaPropertySetter("TextBasedMetadataPayloadSchemeIdentifier")
	public void setTextBasedMetadataPayloadSchemeIdentifier(
			AUID textBasedMetadataPayloadSchemeIdentifier) {

		this.textBasedMetadataPayloadSchemeIdentifier = textBasedMetadataPayloadSchemeIdentifier;
	}
	

	//060E2B34 0101010D 03010102 02140000
	@MediaProperty(uuid1 = 0x03010102, uuid2 = 0x0214, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "Rfc5646TextLanguageCode",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x800d,
			symbol = "Rfc5646TextLanguageCode")
	public String getRfc5646TextLanguageCode() 
		throws PropertyNotPresentException {

		if (rfc5646TextLanguageCode == null)
			throw new PropertyNotPresentException("Rfc5646TextLanguageCode property is not present.");
		
		return rfc5646TextLanguageCode;
	}
	@MediaPropertySetter("Rfc5646TextLanguageCode")
	public void setRfc5646TextLanguageCode(
			String rfc5646TextLanguageCode) {

		this.rfc5646TextLanguageCode = rfc5646TextLanguageCode;
	}
	
	//060E2B34 01010101 0D0E0101 07010402
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0402,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "MimeMediaType",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x800e,
			symbol = "MimeMediaType")
	public String getMimeMediaType() 
		throws PropertyNotPresentException {

		if (mimeMediaType == null)
			throw new PropertyNotPresentException("MimeMediaType property is not present.");
		
		return mimeMediaType;
	}
	@MediaPropertySetter("MimeMediaType")
	public void setMimeMediaType(
			String mimeMediaType) {

		this.mimeMediaType = mimeMediaType;
	}

	//060E2B34 0101010D 04090202 00000000
	@MediaProperty(uuid1 = 0x04090202, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextMimeMediaType",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "TextMimeMediaType")
	public String getTextMimeMediaType() 
		throws PropertyNotPresentException {

		if (textMimeMediaType == null)
			throw new PropertyNotPresentException("TextMimeMediaType property is not present.");
		
		return textMimeMediaType;
	}
	@MediaPropertySetter("TextMimeMediaType")
	public void setTextMimeMediaType(
			String textMimeMediaType) {

		this.textMimeMediaType = textMimeMediaType;
	}

	//060E02B34 010101010D 0E0101 07010403
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0403,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "DataDescriptions",
			aliases = {  },
			typeName = "ASCIIString",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x8010,
			symbol = "DataDescriptions")
	public String getDataDescriptions() 
		throws PropertyNotPresentException {

		if (dataDescriptions == null)
			throw new PropertyNotPresentException("DataDescriptions property is not present.");
		
		return dataDescriptions;
	}
	@MediaPropertySetter("DataDescriptions")
	public void setDataDescriptions(
			String dataDescriptions) {

		this.dataDescriptions = dataDescriptions;
	}
	

	//060E2B34 0101010D 03020106 03020000 
	@MediaProperty(uuid1 = 0x03020106, uuid2 = 0x0302, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "TextDataDescriptions",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8011,
			symbol = "TextDataDescriptions")
	public String getTextDataDescriptions() 
		throws PropertyNotPresentException {

		if (textDataDescriptions == null)
			throw new PropertyNotPresentException("TextDataDescriptions property is not present.");
		
		return textDataDescriptions;
	}
	@MediaPropertySetter("TextDataDescriptions")
	public void setTextDataDescriptions(
			String textDataDescriptions) {

		this.textDataDescriptions = textDataDescriptions;
	}
	//060E 2B340101 01010D0E 01010701 0404
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0404,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Note",
			aliases = {  },
			typeName = "ASCIIString",
			optional = true,
			uniqueIdentifier = false,
			symbol = "Note")
	public String getNote() 
		throws PropertyNotPresentException {

		if (note == null)
			throw new PropertyNotPresentException("Note property is not present.");
		
		return note;
	}
	@MediaPropertySetter("Note")
	public void setNote(
			String note) {

		this.note = note;
	}

	//060E2B34 0101010D 01030408 00000000 
	@MediaProperty(uuid1 = 0x01030408, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "GenericStreamId",
			aliases = {  },
			typeName = "UInt32",
			optional = true,
			uniqueIdentifier = false,
			pid = 0x8013,
			symbol = "GenericStreamId")
	public int getGenericStreamId()  {

		return genericStreamId;
	}
	@MediaPropertySetter("GenericStreamId")
	public void setGenericStreamId(
			int genericStreamId) {

		this.genericStreamId = genericStreamId;
	}
	

	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0701, uuid3 = 0x0401,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "Identifiers",
			aliases = { },
			typeName = "AS07DMSIdentifierStrongReferenceVector",
			optional = false,
			uniqueIdentifier = false,
			pid = 0x8014,
			symbol = "Identifiers")
	public List<AS07DMSIdentifierSetImpl> getIdentifiers() throws PropertyNotPresentException
			{
		if(identifiers==null)
			throw new PropertyNotPresentException("Missing identifiers");
		
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

    public AS07GSPDMSObject clone() {

        return (AS07GSPDMSObject) super.clone();
    }
}
