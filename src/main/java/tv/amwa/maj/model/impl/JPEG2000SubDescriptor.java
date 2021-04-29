package tv.amwa.maj.model.impl;

import tv.amwa.maj.misctype.RGBALayout;
import tv.amwa.maj.model.CDCIDescriptor;
import tv.amwa.maj.model.SubDescriptor;
import tv.amwa.maj.record.RGBAComponent;
import tv.amwa.maj.record.impl.CodingStyleDefault;
import tv.amwa.maj.record.impl.J2KComponentSizing;
import tv.amwa.maj.record.impl.J2KExtendedCapabilities;
import tv.amwa.maj.record.impl.QuantizationDefault;

public interface JPEG2000SubDescriptor extends SubDescriptor {

	void setRsiz(short rsiz) throws NullPointerException;

	short getRsiz();

	void setXsiz(int xsiz) throws NullPointerException;

	int getXsiz();

	void setYsiz(int ysiz) throws NullPointerException;

	int getYsiz();

	void setXOsiz(int xoSiz) throws NullPointerException;

	int getXOsiz();

	void setYOsiz(int yoSiz) throws NullPointerException;

	int getYOsiz();

	int getXTsiz();

	void setXTsiz(int xtSiz) throws NullPointerException;

	void setYTsiz(int ytSiz) throws NullPointerException;

	int getYTsiz();

	int getXTOsiz();

	void setXTOsiz(int xtoSiz) throws NullPointerException;

	int getYTOsiz();

	void setYTOsiz(int ytoSiz) throws NullPointerException;

	short getCsiz();

	void setCsiz(short cSiz) throws NullPointerException;

	void setPictureComponentSizing(J2KComponentSizing[] pictureComponentSizing)
			throws NullPointerException, IllegalArgumentException;
	
	J2KComponentSizing[] getPictureComponentSizing();
	
	CodingStyleDefault getCodingStyleDefault();
	
	void setCodingStyleDefault(
			CodingStyleDefault  codingStyleDefault);
	

	QuantizationDefault getQuantizationDefault();
	
	void setQuantizationDefault(
			QuantizationDefault  quantizationDefault);

	RGBAComponent[] getJ2CLayout();

	void setJ2CLayoutFromStream(Object[] j2cLayoutArray);

	short[] getJ2KProfile();

	void setJ2KProfile(short[] j2kProfile);

	void setJ2KCorrespondingProfile(short[] j2kCorrespondingProfile);

	short[] setJ2KCorrespondingProfile();

	void setJ2KExtendedCapabilities(J2KExtendedCapabilities j2kExtendedCapabilities);

	J2KExtendedCapabilities getJ2KExtendedCapabilities();

}