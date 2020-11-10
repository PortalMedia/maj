package tv.amwa.maj.model.impl;

import tv.amwa.maj.model.SubDescriptor;
import tv.amwa.maj.record.impl.J2KComponentSizing;

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

}