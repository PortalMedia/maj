
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
import tv.amwa.maj.record.RGBAComponent;
import tv.amwa.maj.record.impl.J2KComponentSizing;

//060e2b34.027f0101.0d010101.01015a00
@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x5a00,
		uuid4 = {0x06, 0x0E, 0x2B, 0x34, 0x02, 0x06, 0x01, 0x01},
		definedName = "JPEG2000SubDescriptor",
		description = "",
		symbol = "JPEG2000SubDescriptor")
public class JPEG2000SubDescriptorImpl
  extends SubDescriptorImpl
  implements
		
		Serializable,
		XMLSerializable,
		Cloneable, JPEG2000SubDescriptor {

	private static final long serialVersionUID = -4844795093232901279L;

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
	
	
	
	
	@Override
	public JPEG2000SubDescriptorImpl clone() {

		return (JPEG2000SubDescriptorImpl) super.clone();
	}
}
