package tv.amwa.maj.record.impl;

import org.w3c.dom.Node;

public interface QuantizationDefault {

	byte getSqcd();

	void setSqcd(byte sqcd) throws NullPointerException;

	byte[] getSqcdi();

	void setSqcdi(byte[] sqcdi) throws NullPointerException;

	void appendXMLChildren(Node parent);

	String getComment();

}