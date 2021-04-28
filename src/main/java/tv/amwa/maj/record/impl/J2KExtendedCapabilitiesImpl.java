package tv.amwa.maj.record.impl;

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.w3c.dom.Node;

import tv.amwa.maj.constant.CommonConstants;
import tv.amwa.maj.exception.EndOfDataException;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.meta.impl.TypeDefinitionRecordImpl;

public class J2KExtendedCapabilitiesImpl 
implements Serializable,
XMLSerializable,
Cloneable,
CommonConstants, J2KExtendedCapabilities
{
	private static final long serialVersionUID = -1996499757698645926L;

	static {
		TypeDefinitionRecordImpl.registerInterfaceMapping(J2KExtendedCapabilities.class, J2KExtendedCapabilitiesImpl.class);
	}
	private int pcap = 0;// 1 byte
	private short[] ccapi; // 4 bytes`
	
	public J2KExtendedCapabilitiesImpl() { 
	}
	
	public J2KExtendedCapabilitiesImpl(
			int pcap, 
			short[] ccapi) 
		throws NullPointerException,
			IllegalArgumentException {
		
		setPcap(pcap);
		setCcapi(ccapi);
	}

	@Override
	public final int getPcap() {
		return pcap;
	}

	@Override
	public final void setPcap(int pcap) 
		throws NullPointerException {
		this.pcap = pcap;
	}

	@Override
	public final int getCcapi() {
		return pcap;
	}

	@Override
	public final void setCcapi(short[] ccapi) 
		throws NullPointerException {
		this.ccapi = ccapi;
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
	
	public final static CodingStyleDefault createFromBuffer(
			ByteBuffer buffer)
		throws NullPointerException,
			EndOfDataException {

		if (buffer == null)
			throw new NullPointerException("Cannot create an index entry from a null value.");

		if (buffer.remaining() < 3)
			throw new EndOfDataException("Insufficient bytes remaining in the buffer to read an index entry.");

		byte scod = buffer.get();
		byte[] sgcod = new byte[4]; 
		buffer.get(sgcod);
		byte[] spcod = new byte[buffer.remaining()]; 
		buffer.get(spcod);


		return new CodingStyleDefaultImpl(scod, sgcod, spcod);
	}
}
