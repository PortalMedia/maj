/*
 * Copyright 2016 Richard Cartwright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * $Log: DescriptiveObjectImpl.java,v $
 * Revision 1.3  2011/10/05 17:30:40  vizigoth
 * Changing class abstraction to metadata only to support application metadata plugin class definition extensions.
 *
 * Revision 1.2  2011/10/05 17:14:28  vizigoth
 * Added support for application metadata plugins, package markers and dynamic metadictionary extraction from AAF files.
 *
 * Revision 1.1  2011/01/04 10:39:03  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.2  2009/12/18 17:55:57  vizigoth
 * Interim check in to help with some training activities. Early support for reading Preface objects from MXF files.
 *
 * Revision 1.1  2009/05/14 16:15:13  vizigoth
 * Major refactor to remove dependency on JPA and introduce better interface and implementation separation. Removed all setPropertiesFromInterface and castFromInterface methods.
 *
 * Revision 1.3  2009/03/30 09:04:51  vizigoth
 * Refactor to use SMPTE harmonized names and add early KLV file support.
 *
 * Revision 1.2  2008/10/16 01:14:25  vizigoth
 * Documentation improved to an early release level. Still with Javadoc warnings.
 *
 * Revision 1.1  2007/11/13 22:09:47  vizigoth
 * Public release of MAJ API.
 *
 */

package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.model.DescriptiveObject;
import tv.amwa.maj.record.AUID;

/** 
 * <p>Implements an item of descriptive metadata in a {@linkplain tv.amwa.maj.model.DescriptiveFramework
 * descriptive framework}.</p>
 *
 *
 *
 * @see tv.amwa.maj.industry.TypeDefinitions#DescriptiveObjectStrongReference
 * @see tv.amwa.maj.industry.TypeDefinitions#DescriptiveObjectStrongReferenceSet
 * @see tv.amwa.maj.industry.TypeDefinitions#DescriptiveObjectStrongReferenceVector
 */

//060e2b34.027f0101.0d010401.02020000
@MediaClass(uuid1 = 0x0d010401, uuid2 = 0x0202, uuid3 = 0x0000,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		  definedName = "CryptographicContext",
		  description = "Extended by objects that represent descriptive metadata.",
		  symbol = "CryptographicContext",
		  isConcrete = false)
public class CryptographicContextImpl
	extends 
		DescriptiveObjectImpl
	implements 
	CryptographicContext,
		Serializable {

	private static final long serialVersionUID = -1382041109618231L;
	
	private AUID cryptographicContextID = null;
	private AUID cipherAlgorithm = null;
	private AUID cryptographicKeyID = null;
	private AUID micAlgorithm = null;
	private AUID sourceContainerFormat = null;
	private AUID micCarriage = null;
	
	
	//060e2b34.01010109.01011511.00000000
	@Override
	@MediaProperty(uuid1 = 0x01011511, uuid2 = 0x0000, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "CryptographicContextID",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "CryptographicContextID")
	public AUID getCryptographicContextID() 
		throws PropertyNotPresentException {
		if(cryptographicContextID == null) throw new PropertyNotPresentException();
		return cryptographicContextID;
	}
	

	@Override
	@MediaPropertySetter("CryptographicContextID")
	public void setCryptographicContextID(
			AUID cryptographicContextID) {

		this.cryptographicContextID = cryptographicContextID;
	}

	
	
	//060e2b34.01010109.02090301.01000000
	@Override
	@MediaProperty(uuid1 = 0x02090301, uuid2 = 0x0100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "CipherAlgorithm",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "CipherAlgorithm")
	public AUID getCipherAlgorithm() 
		throws PropertyNotPresentException {
		if(cipherAlgorithm == null) throw new PropertyNotPresentException();
		return cipherAlgorithm;
	}
	

	@Override
	@MediaPropertySetter("CipherAlgorithm")
	public void setCipherAlgorithm(
			AUID cipherAlgorithm) {

		this.cipherAlgorithm = cipherAlgorithm;
	}
	

	//060e2b34.01010109.02090301.02000000
	@Override
	@MediaProperty(uuid1 = 0x02090301, uuid2 = 0x0200, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "CryptographicKeyID",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "CryptographicKeyID")
	public AUID getCryptographicKeyID() 
		throws PropertyNotPresentException {
		if(cryptographicKeyID == null) throw new PropertyNotPresentException();
		return cryptographicKeyID;
	}
	

	@Override
	@MediaPropertySetter("CryptographicKeyID")
	public void setCryptographicKeyID(
			AUID cryptographicKeyID) {

		this.cryptographicKeyID = cryptographicKeyID;
	}
	
	//060e2b34.01010109.02090302.01000000
	@Override
	@MediaProperty(uuid1 = 0x02090302, uuid2 = 0x0100, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "MICAlgorithm",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "MICAlgorithm")
	public AUID getMICAlgorithm() 
		throws PropertyNotPresentException {
		if(micAlgorithm == null) throw new PropertyNotPresentException();
		return micAlgorithm;
	}
	

	@Override
	@MediaPropertySetter("MICAlgorithm")
	public void setMICAlgorithm(
			AUID micAlgorithm) {

		this.micAlgorithm = micAlgorithm;
	}
	
	//060e2b34.01010109.06010102.02000000
	@Override
	@MediaProperty(uuid1 = 0x06010102, uuid2 = 0x0200, uuid3 = 0x0000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x09},
			definedName = "SourceContainerFormat",
			aliases = {  },
			typeName = "AUID",
			optional = false,
			uniqueIdentifier = false,
			symbol = "SourceContainerFormat")
	public AUID getSourceContainerFormat() 
		throws PropertyNotPresentException {
		if(sourceContainerFormat == null) throw new PropertyNotPresentException();
		return sourceContainerFormat;
	}
	

	@Override
	@MediaPropertySetter("SourceContainerFormat")
	public void setSourceContainerFormat(
			AUID sourceContainerFormat) {

		this.sourceContainerFormat = sourceContainerFormat;
	}
	
	//060e2b34.01010101.0d0e0101.07040300
	@Override
	@MediaProperty(uuid1 = 0x0d0e0101, uuid2 = 0x0704, uuid3 = 0x0300,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x01},
			definedName = "MICCarriage",
			aliases = {  },
			typeName = "AUID",
			optional = true,
			uniqueIdentifier = false,
			symbol = "MICCarriage")
	public AUID getMICCarriage() 
		throws PropertyNotPresentException {
		if(micCarriage == null) throw new PropertyNotPresentException();
		return micCarriage;
	}
	

	@Override
	@MediaPropertySetter("MICCarriage")
	public void setMICCarriage(
			AUID micCarriage) {

		this.micCarriage = micCarriage;
	}
}
