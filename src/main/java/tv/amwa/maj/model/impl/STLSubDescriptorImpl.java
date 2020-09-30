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

package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.enumeration.AVCCodedContentKind;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.integer.UInt16;
import tv.amwa.maj.integer.UInt32;
import tv.amwa.maj.integer.UInt8;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.model.AVCSubDescriptor;

/**
 * <p>Implements an AVC sub descriptor that provides AVC-specific properties that provide additional description of
 * AVC-encoded material over that contained in a {@linkplain tv.amwa.maj.model.RGBADescriptor RGBA descriptor} or a
 * {@linkplain tv.amwa.maj.model.CDCIDescriptor CDCI descriptor}.</p>
 *
 *
 */
//060e2b34.027f0101.0d010101.01017100
@MediaClass(uuid1 = 0x0D010101, uuid2 = 0x0101, uuid3 = 0x7100,
		uuid4 = {0x06, 0x0E, 0x2B, 0x34, 0x02, 0x7f, 0x01, 0x01},
		definedName = "STLSubDescriptor",
		description = "",
		symbol = "STLSubDescriptor")
public class STLSubDescriptorImpl
  extends SubDescriptorImpl
  implements
		
		Serializable,
		XMLSerializable,
		Cloneable, STLSubDescriptor {

	//EventTextLanguageCode
	//060e2b34.01040101.01100200.00000000
	
	//STLLineNumber
	//060e2b34.01040101.01010100.00000000
	
	private byte lineNumber;
	private String eventTextLanguageCode = null;

	private static final long serialVersionUID = -4823795093232901279L;

	@MediaProperty(uuid1 = 0x01100200, uuid2 = 0x0000, uuid3 = 0x0000,
    		uuid4 = {0x06, 0x0E, 0x2B, 0x34, 0x01, 0x04, 0x01, 0x01},
    		definedName = "EventTextLanguageCode",
    		typeName = "UInt8",
    		optional = false,
    		uniqueIdentifier = false,
    		pid = 0x0000,
    		symbol = "EventTextLanguageCode")
	@Override
	public String getEventTextLanguageCode() {

		return eventTextLanguageCode;
	}

	@MediaPropertySetter("EventTextLanguageCode")
	@Override
	public void setEventTextLanguageCode(String eventTextLanguageCode)
		 {
		
		this.eventTextLanguageCode = eventTextLanguageCode;
	}

	@MediaProperty(uuid1 = 0x01100200, uuid2 = 0x0000, uuid3 = 0x0000,
    		uuid4 = {0x06, 0x0E, 0x2B, 0x34, 0x01, 0x04, 0x01, 0x01},
		     definedName = "LineNumber",
		     typeName = "UInt8",
		     optional = false,
		     uniqueIdentifier = false,
		     pid = 0x0000,
		     symbol = "LineNumber")
	@Override
	public @UInt8 byte getLineNumber()
			throws PropertyNotPresentException {

		return lineNumber;
	}

	@MediaPropertySetter("LineNumber")
	@Override
	public void setLineNumber(
			@UInt8 Byte lineNumber) {

		this.lineNumber = lineNumber;
	}

	@Override
	public STLSubDescriptorImpl clone() {

		return (STLSubDescriptorImpl) super.clone();
	}
}
