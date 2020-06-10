package tv.amwa.maj.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.industry.MediaSetAdd;
import tv.amwa.maj.industry.MetadataObject;
import tv.amwa.maj.industry.WeakReferenceTarget;
import tv.amwa.maj.model.impl.AS07DMSIdentifierSetImpl;
import tv.amwa.maj.model.impl.InterchangeObjectImpl;
import tv.amwa.maj.record.AUID;

public interface AS07GSPDMSObject 
extends
InterchangeObject,
Cloneable,
Serializable{

	//060E2B34 0101010D 04060806 00000000
	AUID getTextBasedMetadataPayloadSchemeIdentifier() throws PropertyNotPresentException;

	void setTextBasedMetadataPayloadSchemeIdentifier(AUID textBasedMetadataPayloadSchemeIdentifier);

	//060E2B34 0101010D 04060806 00000000
	String getRfc5646TextLanguageCode() throws PropertyNotPresentException;

	void setRfc5646TextLanguageCode(String rfc5646TextLanguageCode);

	//060E2B34 01010101 0D0E0101 07010402
	String getMimeMediaType() throws PropertyNotPresentException;

	void setMimeMediaType(String mimeMediaType);

	//060E2B34 0101010D 04090202 00000000
	String getTextMimeMediaType() throws PropertyNotPresentException;

	void setTextMimeMediaType(String textMimeMediaType);

	//060E02B34 010101010D 0E0101 07010403
	String getDataDescriptions() throws PropertyNotPresentException;

	void setDataDescriptions(String dataDescriptions);

	//060E2B34 0101010D 03020106 03020000 
	String getTextDataDescriptions() throws PropertyNotPresentException;

	void setTextDataDescriptions(String textDataDescriptions);

	//060E2B34 0101010D 03020106 03020000 
	String getNote() throws PropertyNotPresentException;

	void setNote(String note);

	//060E2B34 0101010D 01030408 00000000 
	int getGenericStreamId();

	void setGenericStreamId(int genericStreamId);
	
	List<AS07DMSIdentifierSetImpl> getIdentifiers();
	void setIdentifiers(
			List<AS07DMSIdentifierSetImpl> identifiers);
	void addIdentifiers(AS07DMSIdentifierSetImpl identifier);
	int getIdentifiersSize();

}