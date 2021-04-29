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

/*
 * $Log: RGBAComponentImpl.java,v $
 * Revision 1.3  2011/02/14 22:33:03  vizigoth
 * First commit after major sourceforge outage.
 *
 * Revision 1.2  2011/01/05 13:09:06  vizigoth
 * Created new forge for making record and union type values.
 *
 * Revision 1.1  2011/01/04 10:42:32  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.2  2010/01/19 14:38:35  vizigoth
 * Moved parsing of record type from byte buffers done in a non standard way to creatFromBuffer factory methods in the implementation itself.
 *
 * Revision 1.1  2009/05/14 16:15:30  vizigoth
 * Major refactor to remove dependency on JPA and introduce better interface and implementation separation. Removed all setPropertiesFromInterface and castFromInterface methods.
 *
 * Revision 1.6  2009/03/30 09:05:03  vizigoth
 * Refactor to use SMPTE harmonized names and add early KLV file support.
 *
 * Revision 1.5  2008/10/16 16:51:53  vizigoth
 * First early release 0.1.
 *
 * Revision 1.4  2008/10/15 09:45:54  vizigoth
 * Edited documentation to release standard.
 *
 * Revision 1.3  2008/01/15 12:27:31  vizigoth
 * Updated due to refactoring of element names in the RGBAComponentKind enumeration.
 *
 * Revision 1.2  2008/01/14 20:45:24  vizigoth
 * Updated reference to RGBAComponent enumeration ... change of CompNull to Null.
 *
 * Revision 1.1  2007/11/13 22:14:38  vizigoth
 * Public release of MAJ API.
 *
 */

package tv.amwa.maj.record.impl;

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.w3c.dom.Node;

import tv.amwa.maj.constant.CommonConstants;
import tv.amwa.maj.exception.EndOfDataException;
import tv.amwa.maj.io.xml.XMLSerializable;
import tv.amwa.maj.meta.impl.TypeDefinitionRecordImpl;

public final class CodingStyleDefaultImpl
	implements Serializable,
		XMLSerializable,
		Cloneable,
		CommonConstants, CodingStyleDefault {

	/**  */
	private static final long serialVersionUID = -1996499757698645926L;

	static {
		TypeDefinitionRecordImpl.registerInterfaceMapping(CodingStyleDefaultImpl.class, CodingStyleDefaultImpl.class);
	}
	private byte scod = 0;// 1 byte
	private byte[] sgcod; // 4 bytes
	private byte[] spcod; // 5 bytes + 0 or more precinct size bytes
	
	public CodingStyleDefaultImpl() { 
	}
	
	public CodingStyleDefaultImpl(
			byte scod, 
			byte[] sgcod, 
			byte[] spcod) 
		throws NullPointerException,
			IllegalArgumentException {
		
		setScod(scod);
		setSgcod(sgcod);
		setSpcod(spcod);
	}

	@Override
	public final byte getScod() {
		return scod;
	}

	@Override
	public final void setScod(byte scod) 
		throws NullPointerException {
		this.scod = scod;
	}
	
	@Override
	public final byte[] getSgcod() {
		return sgcod;
	}
	@Override
	public final void setSgcod(byte[] sgcod) 
		throws NullPointerException {
		this.sgcod = sgcod;
	}
	
	@Override
	public final byte[] getSpcod() {
		return spcod;
	}
	@Override
	public final void setSpcod(byte[] spcod) 
		throws NullPointerException {
		this.spcod = spcod;
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
