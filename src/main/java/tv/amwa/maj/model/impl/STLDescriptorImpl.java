package tv.amwa.maj.model.impl;

import java.io.Serializable;

import tv.amwa.maj.enumeration.ElectroSpatialFormulation;
import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.industry.MediaClass;
import tv.amwa.maj.industry.MediaProperty;
import tv.amwa.maj.industry.MediaPropertySetter;
import tv.amwa.maj.integer.UInt32;
import tv.amwa.maj.misctype.PositionType;
import tv.amwa.maj.model.ContainerDefinition;
import tv.amwa.maj.model.SoundDescriptor;
import tv.amwa.maj.record.AUID;
import tv.amwa.maj.record.Rational;
import tv.amwa.maj.record.impl.AUIDImpl;
import tv.amwa.maj.record.impl.RationalImpl;

/** 
 * <p>Implements the description of a file {@linkplain tv.amwa.maj.model.SourcePackage source package} that 
 * is associated with audio essence.</p>
 *
 *
 *
 */
//STLDescriptor
//060e2b34-027f0101-0d010101-01014200
@MediaClass(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x4200,
		  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x7f, 0x01, 0x01},
		  definedName = "STLDescriptor",
		  description = "The STLDescriptor.",
		  symbol = "STLDescriptor")
public class STLDescriptorImpl
	extends 
		AAFFileDescriptorImpl
	implements 
		STLDescriptor,
		Serializable,
		Cloneable {

	/** <p></p> */
	private static final long serialVersionUID = 6777932901566723444L;

	//060e2b34.027f0101.0d010101.01017000
	private PositionType stlReferencePointTimecode;
	
	/** Default constructor is not public to avoid unset required fields. */
	public STLDescriptorImpl() { }
	
	@Override
	@MediaProperty(uuid1 = 0x0d010101, uuid2 = 0x0101, uuid3 = 0x7000,
			  uuid4 = {0x06, 0x0e, 0x2b, 0x34, 0x02, 0x7f, 0x01, 0x01},
			definedName = "STLReferencePointTimecode",
			aliases = { "" },
			typeName = "PositionType",
			optional = true,
			uniqueIdentifier = false,
			symbol = "STLReferencePointTimecode")
	public PositionType getSTLReferencePointTimecode()
			throws PropertyNotPresentException {

		if (stlReferencePointTimecode == null)
			throw new PropertyNotPresentException("The optional stlReferencePointTimecode is not present in this stl descriptor.");
	
		return stlReferencePointTimecode;
	}

	@Override
	@MediaPropertySetter("STLReferencePointTimecode")
	public void setSTLReferencePointTimecode(
			PositionType stlReferencePointTimecode) {
		
		this.stlReferencePointTimecode = stlReferencePointTimecode;
	}
}
