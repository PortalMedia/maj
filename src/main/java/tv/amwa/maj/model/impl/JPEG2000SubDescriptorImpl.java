//
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
import tv.amwa.maj.misctype.RGBALayout;
import tv.amwa.maj.model.AVCSubDescriptor;
import tv.amwa.maj.record.RGBAComponent;
import tv.amwa.maj.record.impl.CodingStyleDefault;
import tv.amwa.maj.record.impl.J2KComponentSizing;
import tv.amwa.maj.record.impl.J2KExtendedCapabilities;
import tv.amwa.maj.record.impl.QuantizationDefault;
import tv.amwa.maj.record.impl.RGBAComponentImpl;

//060e2b34.027f0101.0d010101.01015a00
@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x5a00,
		uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x06, 0x01, 0x01},
		definedName = "JPEG2000SubDescriptor",
		description = "",
		symbol = "JPEG2000SubDescriptor")
public class JPEG2000SubDescriptorImpl
  extends SubDescriptorImpl
  implements
		Serializable,
		XMLSerializable,
		Cloneable, JPEG2000SubDescriptor {

	private static final long serialVersionUID = -48447422901279L;

	private short rsiz = -1;
	private int xsiz = -1;
	private int ysiz = -1;
	private int xoSiz = -1;
	private int yoSiz = -1;
	private int xtSiz = -1;
	private int ytSiz = -1;
	private int xtoSiz = -1;
	private int ytoSiz = -1;
	private short cSiz = -1;
	private J2KComponentSizing[] pictureComponentSizing = null;
	private CodingStyleDefault codingStyleDefault = null;
	private QuantizationDefault quantizationDefault = null;
	private RGBAComponent[] j2cLayout = null;
	private short[] j2kProfile = null;
	private short[] j2kCorrespondingProfile = null;
	private J2KExtendedCapabilities j2kExtendedCapabilities = null;
	//J2KExtendedCapabilities: 	urn:smpte:ul:060e2b34.0101010e.04010603.0f000000
	//J2KProfile: urn:smpte:ul:060e2b34.0101010e.04010603.10000000
	//J2KCorrespondingProfile: urn:smpte:ul:060e2b34.0101010e.04010603.11000000
	
	//060e2b34.0101010a.04010603.01000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0100, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "Rsiz",
			typeName = "UInt16",
			optional = false,
			uniqueIdentifier = false,
			symbol = "Rsiz")
	public short getRsiz() {

		return rsiz;
	}

	@Override
	@MediaPropertySetter("Rsiz")
	public void setRsiz(
			short rsiz)
		throws NullPointerException {

		if (rsiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.rsiz = rsiz;
	}
	
	//urn:smpte:ul:060e2b34.0101010a.04010603.02000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0200, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "Xsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "Xsiz")
	public int getXsiz() {

		return xsiz;
	}


	@Override
	@MediaPropertySetter("Xsiz")
	public void setXsiz(
			int xsiz)
		throws NullPointerException {

		if (xsiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.xsiz = xsiz;
	}


	//060e2b34.0101010a.04010603.03000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0300, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "Ysiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "Ysiz")
	public int getYsiz() {

		return ysiz;
	}

	@Override
	@MediaPropertySetter("Ysiz")
	public void setYsiz(
			int ysiz)
		throws NullPointerException {

		if (ysiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.ysiz = ysiz;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0400, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "XOsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "XOsiz")
	public int getXOsiz() {

		return xoSiz;
	}

	@Override
	@MediaPropertySetter("XOsiz")
	public void setXOsiz(
			int xoSiz)
		throws NullPointerException {

		if (xoSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.xoSiz = xoSiz;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0500, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "YOsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "YOsiz")
	public int getYOsiz() {

		return yoSiz;
	}

	@Override
	@MediaPropertySetter("YOsiz")
	public void setYOsiz(
			int yoSiz)
		throws NullPointerException {

		if (yoSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.yoSiz = yoSiz;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0600, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "XTsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "XTsiz")
	public int getXTsiz() {

		return xtSiz;
	}

	@Override
	@MediaPropertySetter("XTsiz")
	public void setXTsiz(
			int xtSiz)
		throws NullPointerException {

		if (xtSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.xtSiz = xtSiz;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0700, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "YTsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "YTsiz")
	public int getYTsiz() {

		return ytSiz;
	}

	@Override
	@MediaPropertySetter("YTsiz")
	public void setYTsiz(
			int ytSiz)
		throws NullPointerException {

		if (ytSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.ytSiz = ytSiz;
	}
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0800, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "XTOsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "XTOsiz")
	public int getXTOsiz() {

		return xtoSiz;
	}

	@Override
	@MediaPropertySetter("XTOsiz")
	public void setXTOsiz(
			int xtoSiz)
		throws NullPointerException {

		if (xtoSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.xtoSiz = xtoSiz;
	}
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0900, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "YTOsiz",
			typeName = "UInt32",
			optional = false,
			uniqueIdentifier = false,
			symbol = "YTOsiz")
	public int getYTOsiz() {

		return ytoSiz;
	}

	@Override
	@MediaPropertySetter("YTOsiz")
	public void setYTOsiz(
			int ytoSiz)
		throws NullPointerException {

		if (ytoSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.ytoSiz = ytoSiz;
	}
	
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0a00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "Csiz",
			typeName = "UInt16",
			optional = false,
			uniqueIdentifier = false,
			symbol = "Csiz")
	public short getCsiz() {

		return cSiz;
	}

	@Override
	@MediaPropertySetter("Csiz")
	public void setCsiz(
			short cSiz)
		throws NullPointerException {

		if (ytoSiz < 0)
			throw new NullPointerException("Cannot set the value of the mime type of this auxiliary descriptor using a null value.");
		
		this.cSiz = cSiz;
	}

	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0b00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "PictureComponentSizing",
			typeName = "J2KComponentSizingArray",
			optional = false,
			uniqueIdentifier = false,
			symbol = "PictureComponentSizing")
	public J2KComponentSizing[] getPictureComponentSizing() {
	
		return pictureComponentSizing.clone();
	}

	@Override
	@MediaPropertySetter("PictureComponentSizing")
	public void setPictureComponentSizing(
			J2KComponentSizing[]  pictureComponentSizing)
		throws NullPointerException,
			IllegalArgumentException {

		if (pictureComponentSizing == null)
			throw new NullPointerException("Cannot set the pixel layout of this RGBA descriptor with a null value.");
		
		this.pictureComponentSizing = pictureComponentSizing;	
	}

	//urn:smpte:ul:060e2b34.0101010a.04010603.0c000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0c00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "CodingStyleDefault",
			typeName = "CodingStyleDefault",
			optional = true,
			uniqueIdentifier = false,
			symbol = "CodingStyleDefault")
	public CodingStyleDefault getCodingStyleDefault() {

		if (codingStyleDefault == null) 
			throw new PropertyNotPresentException();
		return codingStyleDefault;
	}

	@Override
	@MediaPropertySetter("CodingStyleDefault")
	public void setCodingStyleDefault(
			CodingStyleDefault  codingStyleDefault)
		throws NullPointerException,
			IllegalArgumentException {

		if (codingStyleDefault == null)
			throw new NullPointerException("Cannot set CodingStyleDefault to a null value.");
		
		this.codingStyleDefault = codingStyleDefault;	
	}
	
	
	
	
	@Override
	public JPEG2000SubDescriptorImpl clone() {

		return (JPEG2000SubDescriptorImpl) super.clone();
	}

	//urn:smpte:ul:060e2b34.0101010a.04010603.0d000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0d00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0a},
			definedName = "QuantizationDefault",
			typeName = "QuantizationDefault",
			optional = true,
			uniqueIdentifier = false,
			symbol = "QuantizationDefault")
	public QuantizationDefault getQuantizationDefault() {
		if (quantizationDefault == null) 
			throw new PropertyNotPresentException();
		return quantizationDefault;
	}

	@Override
	@MediaPropertySetter("QuantizationDefault")
	public void setQuantizationDefault(QuantizationDefault quantizationDefault) {
		if (quantizationDefault == null)
			throw new NullPointerException("Cannot set QuantizationDefault to a null value.");
		
		this.quantizationDefault = quantizationDefault;	
		
	}
	
	
	//J2CLayout: urn:smpte:ul:060e2b34.0101010e.04010603.0e000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0e00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "J2CLayout",
			typeName = "RGBALayout",
			optional = true,
			uniqueIdentifier = false,
			symbol = "J2CLayout")
	public RGBAComponent[] getJ2CLayout() {
		if (j2cLayout == null) 
			throw new PropertyNotPresentException();
		return j2cLayout;
	}

	public void setJ2CLayout(RGBAComponent[] j2cLayout) {
		if (j2cLayout == null)
			throw new NullPointerException("Cannot set J2CLayout to a null value.");
		
		this.j2cLayout = j2cLayout;	
		
	}

	@Override
	@MediaPropertySetter("J2CLayout")
	public void setJ2CLayoutFromStream(
			Object[] j2cLayoutArray) {
		
		if (j2cLayoutArray == null) {
			this.j2cLayout = null;
			return;
		}
		
		this.j2cLayout = new RGBAComponentImpl[j2cLayoutArray.length];
		for ( int x = 0 ; x < j2cLayout.length ; x++) 
			if (j2cLayoutArray[x] != null)
				j2cLayout[x] = ((RGBAComponent) j2cLayoutArray[x]).clone();
	}
	
	//J2KProfile: urn:smpte:ul:060e2b34.0101010e.04010603.10000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x1000, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "J2KProfile",
			typeName = "UInt16Array",
			optional = true,
			uniqueIdentifier = false,
			symbol = "J2KProfile")
	public short[] getJ2KProfile() {
		if (j2kProfile == null) 
			throw new PropertyNotPresentException();
		return j2kProfile;
	}

	@Override
	@MediaPropertySetter("J2KProfile")
	public void setJ2KProfile(short[] j2kProfile) {
		if (j2kProfile == null)
			throw new NullPointerException("Cannot set J2KProfile to a null value.");
		
		this.j2kProfile = j2kProfile;	
		
	}

	//J2KCorrespondingProfile: urn:smpte:ul:060e2b34.0101010e.04010603.11000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x1100, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "J2KCorrespondingProfile",
			typeName = "UInt16Array",
			optional = true,
			uniqueIdentifier = false,
			symbol = "J2KCorrespondingProfile")
	public short[] setJ2KCorrespondingProfile() {
		if (j2kCorrespondingProfile == null) 
			throw new PropertyNotPresentException();
		return j2kCorrespondingProfile;
	}

	@Override
	@MediaPropertySetter("J2KCorrespondingProfile")
	public void setJ2KCorrespondingProfile(short[] j2kCorrespondingProfile) {
		if (j2kCorrespondingProfile == null)
			throw new NullPointerException("Cannot set J2KCorrespondingProfile to a null value.");
		
		this.j2kCorrespondingProfile = j2kCorrespondingProfile;	
		
	}

	//J2KExtendedCapabilities: 	urn:smpte:ul:060e2b34.0101010e.04010603.0f000000
	@Override
	@MediaProperty(uuid1 = 0x04010603, uuid2 = (short) 0x0f00, uuid3 = (short) 0x0000,
			uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x01, 0x01, 0x01, 0x0e},
			definedName = "J2KExtendedCapabilities",
			typeName = "J2KExtendedCapabilities",
			optional = true,
			uniqueIdentifier = false,
			symbol = "J2KExtendedCapabilities")
	public J2KExtendedCapabilities getJ2KExtendedCapabilities() {
		if (j2kExtendedCapabilities == null) 
			throw new PropertyNotPresentException();
		return j2kExtendedCapabilities;
	}

	@Override
	@MediaPropertySetter("J2KExtendedCapabilities")
	public void setJ2KExtendedCapabilities(J2KExtendedCapabilities j2kExtendedCapabilities) {
		if (j2kExtendedCapabilities == null)
			throw new NullPointerException("Cannot set J2KCorrespondingProfile to a null value.");
		
		this.j2kExtendedCapabilities = j2kExtendedCapabilities;	
		
	}
}
