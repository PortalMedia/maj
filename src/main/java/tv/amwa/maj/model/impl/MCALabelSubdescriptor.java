package tv.amwa.maj.model.impl;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.model.SubDescriptor;
import tv.amwa.maj.record.AUID;

public interface MCALabelSubdescriptor extends
SubDescriptor {

	int getMCAChannelID() throws PropertyNotPresentException;

	void setMCAChannelID(int mcaChannelID);

	AUID getMCALabelDictionaryID() throws PropertyNotPresentException;

	void setMCALabelDictionaryID(AUID mcaLabelDictionaryID);

	String getMCATagSymbol() throws PropertyNotPresentException;

	void setMCATagSymbol(String mcaTagSymbol);

	AUID getMCALinkID() throws PropertyNotPresentException;

	void setMCALinkID(AUID mcaLinkID);

	String getMCATagName() throws PropertyNotPresentException;

	void setMCATagName(String mcaTagName);

	String getMCAPartitionKind() throws PropertyNotPresentException;

	void setMCAPartitionKind(String mcaPartitionKind);

	String getMCAPartitionNumber() throws PropertyNotPresentException;

	void setMCAPartitionNumber(String mcaPartitionNumber);

	String getMCATitle() throws PropertyNotPresentException;

	void setMCATitle(String mcaTitle);

	void setMCATitleVersion(String mcaTitleVersion);

	String getMCATitleVersion() throws PropertyNotPresentException;

	String getMCATitleSubVersion() throws PropertyNotPresentException;

	void setMCATitleSubVersion(String mcaTitleSubVersion);

	void setMCAEpisode(String mcaEpisode);

	String getMCAEpisode() throws PropertyNotPresentException;

	String getRFC5646SpokenLanguage() throws PropertyNotPresentException;

	void setRFC5646SpokenLanguage(String rfc5646SpokenLanguage);

	String getMCAAudioContentKind() throws PropertyNotPresentException;

	void setMCAAudioContentKind(String mcaAudioContentKind);

	String getMCAAudioElementKind() throws PropertyNotPresentException;

	void setMCAAudioElementKind(String mcaAudioElementKind);


}