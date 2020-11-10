package tv.amwa.maj.record.impl;

import org.w3c.dom.Node;

public interface J2KComponentSizing {

	byte getSsizi();

	void setSsizi(byte ssizi) throws NullPointerException;

	byte getXrsizi();

	void setXrsizi(byte xrsizi) throws NullPointerException;

	byte getYrsizi();

	void setYrsizi(byte yrsizi) throws NullPointerException;

	void appendXMLChildren(Node parent);

	String getComment();

}