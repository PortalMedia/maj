package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.DescriptiveObject;
import tv.amwa.maj.record.AUID;

public interface CryptographicContext extends 
DescriptiveObject{
	AUID getCryptographicContextID();
	void setCryptographicContextID(AUID cryptographicContextID);
	
	AUID getCipherAlgorithm();
	void setCipherAlgorithm(
				AUID cipherAlgorithm);
	AUID getCryptographicKeyID() throws PropertyNotPresentException;
	void setCryptographicKeyID(AUID cryptographicKeyID);
	AUID getMICAlgorithm() throws PropertyNotPresentException;
	void setMICAlgorithm(AUID micAlgorithm);
	AUID getSourceContainerFormat() throws PropertyNotPresentException;
	void setSourceContainerFormat(AUID sourceContainerFormat);
	AUID getMICCarriage() throws PropertyNotPresentException;
	void setMICCarriage(AUID micCarriage); 
}