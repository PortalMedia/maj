package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.record.AUID;

@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x6a00,
uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
definedName = "MCALabelSubdescriptor",
aliases = {},
description = "MCALabelSubdescriptor",
symbol = "MCALabelSubdescriptor")
public class MCALabelSubDescriptorImpl 

extends
SubDescriptorImpl
implements
	Cloneable,
	Serializable, MCALabelSubdescriptor{

	private static final long serialVersionUID = 14993822436L;

	private int mcaChannelID = -1;
	private AUID mcaLabelDictionaryID = null;

	private AUID mcaLinkID = null;
	private String mcaTagSymbol = null;
	private String mcaTagName = null;

	private String mcaPartitionKind = null;
	private String mcaPartitionNumber = null;
	private String mcaTitle = null;
	private String mcaTitleVersion = null;
	private String mcaTitleSubVersion = null;
	private String mcaEpisode = null;
	private String rfc5646SpokenLanguage = null;
	private String mcaAudioContentKind = null;
	private String mcaAudioElementKind = null;
	
	
	//060e2b34.01040101.01010300.00000000
	@Override
	@MediaProperty(uuid1 = 0x0103040a, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAChannelID",
			aliases = {  },
			typeName = "UInt32",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAChannelID")
	public int getMCAChannelID() 
		throws PropertyNotPresentException {
		if(mcaChannelID<0) throw new PropertyNotPresentException();
		return mcaChannelID;
	}
	

	@Override
	@MediaPropertySetter("MCAChannelID")
	public void setMCAChannelID(
			int mcaChannelID) {

		this.mcaChannelID = mcaChannelID;
	}
	
	
	//:060e2b34.0101010e.01030701.01000000	
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCALabelDictionaryID",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "MCALabelDictionaryID")
	public AUID getMCALabelDictionaryID() 
		throws PropertyNotPresentException {
		if(mcaLabelDictionaryID==null) throw new PropertyNotPresentException();
		return mcaLabelDictionaryID;
	}
	

	@Override
	@MediaPropertySetter("MCALabelDictionaryID")
	public void setMCALabelDictionaryID(
			AUID mcaLabelDictionaryID) {

		this.mcaLabelDictionaryID = mcaLabelDictionaryID;
	}
	
	//060e2b34.0101010e.01030701.03000000
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0300, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCATagName",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCATagName")
	public String getMCATagName() 
		throws PropertyNotPresentException {
		if(mcaTagName==null) throw new PropertyNotPresentException();
		return mcaTagName;
	}
	

	@Override
	@MediaPropertySetter("MCATagName")
	public void setMCATagName(
			String mcaTagName) {

		this.mcaTagName = mcaTagName;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0200, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCATagSymbol",
			aliases = {  },
			typeName = "UTF16String",
			optional = false,
			uniqueIdentifier = false,
			symbol = "MCATagSymbol")
	public String getMCATagSymbol() 
		throws PropertyNotPresentException {
		if(mcaTagSymbol==null) throw new PropertyNotPresentException();
		return mcaTagSymbol;
	}
	

	@Override
	@MediaPropertySetter("MCATagSymbol")
	public void setMCATagSymbol(
			String mcaTagSymbol) {

		this.mcaTagSymbol = mcaTagSymbol;
	}
	//060e2b34.0101010e.01030701.05000000
	@Override
	@MediaProperty(uuid1 = 0x01030701, uuid2 = 0x0500, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCALinkID",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "MCALinkID")
	public AUID getMCALinkID() 
		throws PropertyNotPresentException {
		if(mcaLinkID==null) throw new PropertyNotPresentException();
		return mcaLinkID;
	}
	

	@Override
	@MediaPropertySetter("MCALinkID")
	public void setMCALinkID(
			AUID mcaLinkID) {

		this.mcaLinkID = mcaLinkID;
	}
	
	//060e2b34.0101010e.01040105.00000000
	@Override
	@MediaProperty(uuid1 = 0x01040105, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAPartitionKind",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAPartitionKind")
	public String getMCAPartitionKind() 
		throws PropertyNotPresentException {
		if(mcaPartitionKind==null) throw new PropertyNotPresentException();
		return mcaPartitionKind;
	}
	

	@Override
	@MediaPropertySetter("MCAPartitionKind")
	public void setMCAPartitionKind(
			String mcaPartitionKind) {

		this.mcaPartitionKind = mcaPartitionKind;
	}
	
	//060e2b34.0101010e.01040106.00000000
	@Override
	@MediaProperty(uuid1 = 0x01040106, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAPartitionNumber",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAPartitionNumber")
	public String getMCAPartitionNumber() 
		throws PropertyNotPresentException {
		if(mcaPartitionNumber==null) throw new PropertyNotPresentException();
		return mcaPartitionNumber;
	}
	

	@Override
	@MediaPropertySetter("MCAPartitionNumber")
	public void setMCAPartitionNumber(
			String mcaPartitionNumber) {

		this.mcaPartitionNumber = mcaPartitionNumber;
	}
	
	//060e2b34.0101010e.01051000.00000000
	@Override
	@MediaProperty(uuid1 = 0x01051000, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCATitle",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCATitle")
	public String getMCATitle() 
		throws PropertyNotPresentException {
		if(mcaTitle==null) throw new PropertyNotPresentException();
		return mcaTitle;
	}
	

	@Override
	@MediaPropertySetter("MCATitle")
	public void setMCATitle(
			String mcaTitle) {

		this.mcaTitle = mcaTitle;
	}
	
	//060e2b34.0101010e.01051100.00000000
	@Override
	@MediaProperty(uuid1 = 0x01051100, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCATitleVersion",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCATitleVersion")
	public String getMCATitleVersion() 
		throws PropertyNotPresentException {
		if(mcaTitleVersion==null) throw new PropertyNotPresentException();
		return mcaTitleVersion;
	}
	

	@Override
	@MediaPropertySetter("MCATitleVersion")
	public void setMCATitleVersion(
			String mcaTitleVersion) {

		this.mcaTitleVersion = mcaTitleVersion;
	}
	
	//060e2b34.0101010e.01051200.00000000
	@Override
	@MediaProperty(uuid1 = 0x01051200, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCATitleSubVersion",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCATitleSubVersion")
	public String getMCATitleSubVersion() 
		throws PropertyNotPresentException {
		if(mcaTitleSubVersion==null) throw new PropertyNotPresentException();
		return mcaTitleSubVersion;
	}
	

	@Override
	@MediaPropertySetter("MCATitleSubVersion")
	public void setMCATitleSubVersion(
			String mcaTitleSubVersion) {

		this.mcaTitleSubVersion = mcaTitleSubVersion;
	}
	
//060e2b34.0101010e.01051300.00000000
	@Override
	@MediaProperty(uuid1 = 0x01051300, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAEpisode",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAEpisode")
	public String getMCAEpisode() 
		throws PropertyNotPresentException {
		if(mcaEpisode==null) throw new PropertyNotPresentException();
		return mcaEpisode;
	}
	

	@Override
	@MediaPropertySetter("MCAEpisode")
	public void setMCAEpisode(
			String mcaEpisode) {

		this.mcaEpisode = mcaEpisode;
	}
	
	
	//060e2b34.0101010d.03010102.03150000
	@Override
	@MediaProperty(uuid1 = 0x03010102, uuid2 = 0x0315, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0d},
			definedName = "RFC5646SpokenLanguage",
			aliases = {  },
			typeName = "ASCIIString",
			optional = true,
			uniqueIdentifier = false,
			symbol = "RFC5646SpokenLanguage")
	public String getRFC5646SpokenLanguage() 
		throws PropertyNotPresentException {
		if(rfc5646SpokenLanguage==null) throw new PropertyNotPresentException();
		return rfc5646SpokenLanguage;
	}
	

	@Override
	@MediaPropertySetter("RFC5646SpokenLanguage")
	public void setRFC5646SpokenLanguage(
			String rfc5646SpokenLanguage) {

		this.rfc5646SpokenLanguage = rfc5646SpokenLanguage;
	}
	
	//MCAAudioContentKind - 060e2b34.0101010e.03020102.20000000
	
	@Override
	@MediaProperty(uuid1 = 0x03020102, uuid2 = 0x2000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAAudioContentKind",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAAudioContentKind")
	public String getMCAAudioContentKind() 
		throws PropertyNotPresentException {
		if(mcaAudioContentKind==null) throw new PropertyNotPresentException();
		return mcaAudioContentKind;
	}
	

	@Override
	@MediaPropertySetter("MCAAudioContentKind")
	public void setMCAAudioContentKind(
			String mcaAudioContentKind) {

		this.mcaAudioContentKind = mcaAudioContentKind;
	}
	
	//MCAAudioElementKind 060e2b34.0101010e.03020102.21000000
	@Override
	@MediaProperty(uuid1 = 0x03020102, uuid2 = 0x2100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "MCAAudioElementKind",
			aliases = {  },
			typeName = "UTF16String",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MCAAudioElementKind")
	public String getMCAAudioElementKind() 
		throws PropertyNotPresentException {
		if(mcaAudioElementKind==null) throw new PropertyNotPresentException();
		return mcaAudioElementKind;
	}
	

	@Override
	@MediaPropertySetter("MCAAudioElementKind")
	public void setMCAAudioElementKind(
			String mcaAudioElementKind) {

		this.mcaAudioElementKind = mcaAudioElementKind;
	}
}
