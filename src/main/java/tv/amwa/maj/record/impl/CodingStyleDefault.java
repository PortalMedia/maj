package tv.amwa.maj.record.impl;

import org.w3c.dom.Node;

public interface CodingStyleDefault {

	byte getScod();

	void setScod(byte scod) throws NullPointerException;

	byte[] getSgcod();

	void setSgcod(byte[] sgcod) throws NullPointerException;

	byte[] getSpcod();

	void setSpcod(byte[] spcod) throws NullPointerException;

	void appendXMLChildren(Node parent);

	String getComment();

}