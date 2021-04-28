
package tv.amwa.maj.record.impl;

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.w3c.dom.Node;

import tv.amwa.maj.constant.CommonConstants;
import tv.amwa.maj.exception.EndOfDataException;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.meta.impl.TypeDefinitionRecordImpl;

public final class QuantizationDefaultImpl
	implements Serializable,
		XMLSerializable,
		Cloneable,
		CommonConstants, QuantizationDefault {

	/**  */
	private static final long serialVersionUID = -199649975769432926L;

	static {
		TypeDefinitionRecordImpl.registerInterfaceMapping(QuantizationDefault.class, QuantizationDefaultImpl.class);
	}
	private byte sqcd = 0;
	private byte[] sqcdi;
	
	public QuantizationDefaultImpl() { 
	}
	
	public QuantizationDefaultImpl(
			byte sqcd, 
			byte[] sqcdi) 
		throws NullPointerException,
			IllegalArgumentException {
		
		setSqcd(sqcd);
		setSqcdi(sqcdi);
	}

	@Override
	public final byte getSqcd() {
		return sqcd;
	}

	@Override
	public final void setSqcd(byte sqcd) 
		throws NullPointerException {
		this.sqcd = sqcd;
	}
	
	@Override
	public final byte[] getSqcdi() {
		return sqcdi;
	}
	@Override
	public final void setSqcdi(byte[] sqcdi) 
		throws NullPointerException {
		this.sqcdi = sqcdi;
	}
	
	@Override
	public void appendXMLChildren(Node parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return "";
	}
	
	public final static QuantizationDefault createFromBuffer(
			ByteBuffer buffer)
		throws NullPointerException,
			EndOfDataException {

		if (buffer == null)
			throw new NullPointerException("Cannot create an index entry from a null value.");

		if (buffer.remaining() < 1)
			throw new EndOfDataException("Insufficient bytes remaining in the buffer to read an index entry.");

		byte sqcd = buffer.get();
		byte sqcdi[] = new byte[buffer.remaining()]; 
		buffer.get(sqcdi);


		return new QuantizationDefaultImpl(sqcd, sqcdi);
	}
}
