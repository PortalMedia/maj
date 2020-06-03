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
 * $Log: AAFSpecifiedClasses.java,v $
 * Revision 1.8  2011/11/04 09:54:16  vizigoth
 * Updates to enable writing AAF files from objects with AMP metadata.
 *
 * Revision 1.7  2011/10/05 17:14:25  vizigoth
 * Added support for application metadata plugins, package markers and dynamic metadictionary extraction from AAF files.
 *
 * Revision 1.6  2011/01/18 09:10:06  vizigoth
 * Commiting again after the file got lost locally.
 *
 * Revision 1.4  2011/01/04 10:39:02  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.3  2010/03/19 09:48:13  vizigoth
 * Added meta dictionary to list of meta classes.
 *
 * Revision 1.2  2009/12/18 17:55:59  vizigoth
 * Interim check in to help with some training activities. Early support for reading Preface objects from MXF files.
 *
 * Revision 1.1  2009/05/14 16:15:34  vizigoth
 * Major refactor to remove dependency on JPA and introduce better interface and implementation separation. Removed all setPropertiesFromInterface and castFromInterface methods.
 *
 * Revision 1.3  2009/03/30 09:05:08  vizigoth
 * Refactor to use SMPTE harmonized names and add early KLV file support.
 *
 * Revision 1.2  2008/10/16 16:52:01  vizigoth
 * First early release 0.1.
 *
 * Revision 1.1  2008/10/15 13:20:46  vizigoth
 * Changed package name from factory to industry and completed top level comment edit.
 *
 * Revision 1.1  2007/11/13 22:17:04  vizigoth
 * Public release of MAJ API.
 *
 * Revision 1.2  2007/11/13 21:22:32  vizigoth
 * Added AMWA license to all Java files.
 *
 */

package tv.amwa.maj.industry;

/*
 * DO NOT EDIT THIS FILE unless you know what you are doing. This file contains a list
 * of all the core classes of the AAF specification. Changing its contents will effect
 * interoperability with other systems as it will change the behaviour of input and
 * output code of this API.
 */

// import tv.amwa.maj.embeddable.*;
import tv.amwa.maj.meta.MetaDefinition;
import tv.amwa.maj.meta.impl.ClassDefinitionImpl;
import tv.amwa.maj.meta.impl.ExtensionSchemeImpl;
import tv.amwa.maj.meta.impl.MetaDefinitionImpl;
import tv.amwa.maj.meta.impl.MetaDictionaryImpl;
import tv.amwa.maj.meta.impl.PropertyDefinitionImpl;
import tv.amwa.maj.meta.impl.PropertyWrapperDefinitionImpl;
import tv.amwa.maj.meta.impl.RootImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionCharacterImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionEnumerationImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionExtendibleEnumerationImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionFixedArrayImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionIndirectImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionIntegerImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionOpaqueImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionRecordImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionRenameImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionSetImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionStreamImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionStringImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionStrongObjectReferenceImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionVariableArrayImpl;
import tv.amwa.maj.meta.impl.TypeDefinitionWeakObjectReferenceImpl;
import tv.amwa.maj.model.InterchangeObject;
import tv.amwa.maj.model.impl.AAFFileDescriptorImpl;
import tv.amwa.maj.model.impl.AES3PCMDescriptorImpl;
import tv.amwa.maj.model.impl.AIFCDescriptorImpl;
import tv.amwa.maj.model.impl.AVCSubDescriptorImpl;
import tv.amwa.maj.model.impl.ApplicationObjectImpl;
import tv.amwa.maj.model.impl.ApplicationPluginObjectImpl;
import tv.amwa.maj.model.impl.ApplicationReferencedObjectImpl;
import tv.amwa.maj.model.impl.AS07CoreDMSFrameworkImpl;
import tv.amwa.maj.model.impl.AS07DMSIdentifierSetImpl;
import tv.amwa.maj.model.impl.AS07GSPDMSObjectImpl;
import tv.amwa.maj.model.impl.AS07GspBdDMSFrameworkImpl;
import tv.amwa.maj.model.impl.AS07GspTdDMSFrameworkImpl;
import tv.amwa.maj.model.impl.AuxiliaryDescriptorImpl;
import tv.amwa.maj.model.impl.BWFImportDescriptorImpl;
import tv.amwa.maj.model.impl.CDCIDescriptorImpl;
import tv.amwa.maj.model.impl.CodecDefinitionImpl;
import tv.amwa.maj.model.impl.CommentMarkerImpl;
import tv.amwa.maj.model.impl.ComponentImpl;
import tv.amwa.maj.model.impl.CompositionPackageImpl;
import tv.amwa.maj.model.impl.ConstantValueImpl;
import tv.amwa.maj.model.impl.ContainerDefinitionImpl;
import tv.amwa.maj.model.impl.ContentStorageImpl;
import tv.amwa.maj.model.impl.ControlPointImpl;
import tv.amwa.maj.model.impl.DataDefinitionImpl;
import tv.amwa.maj.model.impl.DataEssenceDescriptorImpl;
import tv.amwa.maj.model.impl.DefinitionObjectImpl;
import tv.amwa.maj.model.impl.DescriptiveClipImpl;
import tv.amwa.maj.model.impl.DescriptiveFrameworkImpl;
import tv.amwa.maj.model.impl.DescriptiveMarkerImpl;
import tv.amwa.maj.model.impl.DescriptiveObjectImpl;
import tv.amwa.maj.model.impl.DictionaryImpl;
import tv.amwa.maj.model.impl.EdgeCodeSegmentImpl;
import tv.amwa.maj.model.impl.EssenceDataImpl;
import tv.amwa.maj.model.impl.EssenceDescriptorImpl;
import tv.amwa.maj.model.impl.EssenceGroupImpl;
import tv.amwa.maj.model.impl.EventImpl;
import tv.amwa.maj.model.impl.EventTrackImpl;
import tv.amwa.maj.model.impl.FillerImpl;
import tv.amwa.maj.model.impl.FilmDescriptorImpl;
import tv.amwa.maj.model.impl.GPITriggerImpl;
import tv.amwa.maj.model.impl.HTMLClipImpl;
import tv.amwa.maj.model.impl.HTMLDescriptorImpl;
import tv.amwa.maj.model.impl.IdentificationImpl;
import tv.amwa.maj.model.impl.ImportDescriptorImpl;
import tv.amwa.maj.model.impl.InterchangeObjectImpl;
import tv.amwa.maj.model.impl.InterpolationDefinitionImpl;
import tv.amwa.maj.model.impl.KLVDataDefinitionImpl;
import tv.amwa.maj.model.impl.KLVDataImpl;
import tv.amwa.maj.model.impl.LocatorImpl;
import tv.amwa.maj.model.impl.MPEGVideoDescriptorImpl;
import tv.amwa.maj.model.impl.MaterialPackageImpl;
import tv.amwa.maj.model.impl.MultipleDescriptorImpl;
import tv.amwa.maj.model.impl.NestedScopeImpl;
import tv.amwa.maj.model.impl.NetworkLocatorImpl;
import tv.amwa.maj.model.impl.OperationDefinitionImpl;
import tv.amwa.maj.model.impl.OperationGroupImpl;
import tv.amwa.maj.model.impl.PackageImpl;
import tv.amwa.maj.model.impl.PackageMarkerImpl;
import tv.amwa.maj.model.impl.ParameterDefinitionImpl;
import tv.amwa.maj.model.impl.ParameterImpl;
import tv.amwa.maj.model.impl.PhysicalDescriptorImpl;
import tv.amwa.maj.model.impl.PictureDescriptorImpl;
import tv.amwa.maj.model.impl.PluginDefinitionImpl;
import tv.amwa.maj.model.impl.PrefaceImpl;
import tv.amwa.maj.model.impl.PulldownImpl;
import tv.amwa.maj.model.impl.RGBADescriptorImpl;
import tv.amwa.maj.model.impl.RIFFChunkImpl;
import tv.amwa.maj.model.impl.RecordingDescriptorImpl;
import tv.amwa.maj.model.impl.ScopeReferenceImpl;
import tv.amwa.maj.model.impl.SegmentImpl;
import tv.amwa.maj.model.impl.SelectorImpl;
import tv.amwa.maj.model.impl.SequenceImpl;
import tv.amwa.maj.model.impl.SoundDescriptorImpl;
import tv.amwa.maj.model.impl.SourceClipImpl;
import tv.amwa.maj.model.impl.SourcePackageImpl;
import tv.amwa.maj.model.impl.SourceReferenceSegmentImpl;
import tv.amwa.maj.model.impl.StaticTrackImpl;
import tv.amwa.maj.model.impl.SubDescriptorImpl;
import tv.amwa.maj.model.impl.TIFFDescriptorImpl;
import tv.amwa.maj.model.impl.TaggedValueDefinitionImpl;
import tv.amwa.maj.model.impl.TaggedValueImpl;
import tv.amwa.maj.model.impl.TapeDescriptorImpl;
import tv.amwa.maj.model.impl.TextClipImpl;
import tv.amwa.maj.model.impl.TextLocatorImpl;
import tv.amwa.maj.model.impl.TimecodeSegmentImpl;
import tv.amwa.maj.model.impl.TimecodeStream12MImpl;
import tv.amwa.maj.model.impl.TimecodeStreamImpl;
import tv.amwa.maj.model.impl.TimelineTrackImpl;
import tv.amwa.maj.model.impl.TrackImpl;
import tv.amwa.maj.model.impl.TransitionImpl;
import tv.amwa.maj.model.impl.VaryingValueImpl;
import tv.amwa.maj.model.impl.WAVEDescriptorImpl;
import tv.amwa.maj.model.impl.WAVEPCMDescriptorImpl;

/**
 * <p>Lists of classes implementing thoses specified for the Advanced Authoring Format (AAF). These classes 
 * are as specified in the <a href="http://www.amwa.tv/html/specs/aafobjectspec-v1.1.pdf">AAF Object 
 * Specification v1.1</a>, along with some recent additions to the meta dictionary
 * so as to remain consistent with the C-based reference implementation.</p>
 * 
 * <p>The MAJ API is designed to be dynamically extendible at runtime by loading
 * in implementations of extensions classes. Classes not listed in the arrays of
 * this class are treated as extensions.</p>
 * 
 * <p>Abstract and concrete, classes and meta classes are separated out into 
 * separate lists:</p>
 * 
 * <ul>
 *  <li>abstract classes are in lists {@link #abstractInterchangeable} and 
 *  {@link #abstractMeta};</li>
 *  <li>concrete classes are in lists {@link #interchangeable} and {@link #meta};</li>
 *  <li>interchangeable non-meta classes in lists {@link #abstractInterchangeable} and
 *  {@link #interchangeable};</li>
 *  <li>meta-classes, classes that describe the interchangeabe objects, in lists
 *  {@link #meta} and {@link #abstractMeta}.</li>
 * </ul>
 * 
 * <p>All the classes in the lists implement {@link MetadataObject} and are
 * annotated with {@link MediaClass &#64;MediaClass}.</p>
 * 
 * <p>These lists can be used to bootstrap applications or to check whether a given 
 * class is as specified or an extension. The {@linkplain MediaEngine} uses these
 * lists to {@linkplain MediaEngine#initializeAAF() initialize} an application ready 
 * to use AAF classes and data types.</p>
 * 
 *
 * 
 * @see Warehouse#lookForClass(Class)
 * @see MediaClass
 * @see MediaEntity
 * @see tv.amwa.maj.meta.Root#getRootExtensions()
 */
public interface AAFSpecifiedClasses {

	/** <p>List of concrete AAF classes that are interchangeable as they extend 
	 * {@link InterchangeObject}.</p> */
	public final static Class<?>[] interchangeable = new Class<?>[] {
		TransitionImpl.class,
		EdgeCodeSegmentImpl.class,
		EssenceGroupImpl.class,
		CommentMarkerImpl.class,
		GPITriggerImpl.class,
		DescriptiveMarkerImpl.class,
		FillerImpl.class,
		NestedScopeImpl.class,
		OperationGroupImpl.class,
		PulldownImpl.class,
		ScopeReferenceImpl.class,
		SelectorImpl.class,
		SequenceImpl.class,
		SourceClipImpl.class,
		DescriptiveClipImpl.class,
		HTMLClipImpl.class,
		TimecodeSegmentImpl.class,
		TimecodeStream12MImpl.class,
		ContentStorageImpl.class,
		ControlPointImpl.class,
		CodecDefinitionImpl.class,
		ContainerDefinitionImpl.class,
		DataDefinitionImpl.class,
		InterpolationDefinitionImpl.class,
		KLVDataDefinitionImpl.class,
		OperationDefinitionImpl.class,
		ParameterDefinitionImpl.class,
		PluginDefinitionImpl.class,
		TaggedValueDefinitionImpl.class,
		DictionaryImpl.class,
		EssenceDataImpl.class,
		AIFCDescriptorImpl.class,
		DataEssenceDescriptorImpl.class,
		CDCIDescriptorImpl.class,
		MPEGVideoDescriptorImpl.class,
		RGBADescriptorImpl.class,
		HTMLDescriptorImpl.class,
		MultipleDescriptorImpl.class,
		SoundDescriptorImpl.class,
		WAVEPCMDescriptorImpl.class,
		AES3PCMDescriptorImpl.class,
		TIFFDescriptorImpl.class,
		WAVEDescriptorImpl.class,
		FilmDescriptorImpl.class,
		AuxiliaryDescriptorImpl.class,
		ImportDescriptorImpl.class,
		BWFImportDescriptorImpl.class,
		RecordingDescriptorImpl.class,
		TapeDescriptorImpl.class,
		PrefaceImpl.class,
		IdentificationImpl.class,
		KLVDataImpl.class,
		NetworkLocatorImpl.class,
		TextLocatorImpl.class,
		CompositionPackageImpl.class,
		MaterialPackageImpl.class,
		SourcePackageImpl.class,
		EventTrackImpl.class,
		StaticTrackImpl.class,
		AS07CoreDMSFrameworkImpl.class,
		AS07DMSIdentifierSetImpl.class,
		AS07GspBdDMSFrameworkImpl.class,
		AS07GspTdDMSFrameworkImpl.class,
		AS07GSPDMSObjectImpl.class,
		TimelineTrackImpl.class,
		ConstantValueImpl.class,
		VaryingValueImpl.class,
		RIFFChunkImpl.class,
		TaggedValueImpl.class,
		PackageMarkerImpl.class,
		ApplicationPluginObjectImpl.class,
		ApplicationReferencedObjectImpl.class,
		AVCSubDescriptorImpl.class
	};
	
	/**
	 * <p>List of abstract AAF classes that are part of the interchangeable
	 * object hierarchy, i.e. abstract and extending {@link InterchangeObject}.</p>
	 */
	public final static Class<?>[] abstractInterchangeable = new Class<?>[] {
		InterchangeObjectImpl.class,
		ComponentImpl.class,
		SegmentImpl.class,
		EventImpl.class,
		SourceReferenceSegmentImpl.class,
		TextClipImpl.class,
		TimecodeStreamImpl.class,
		DefinitionObjectImpl.class,
		DescriptiveFrameworkImpl.class,
		DescriptiveObjectImpl.class,
		EssenceDescriptorImpl.class,
		AAFFileDescriptorImpl.class,
		PictureDescriptorImpl.class,
		PhysicalDescriptorImpl.class,
		LocatorImpl.class,
		PackageImpl.class,
		TrackImpl.class,
		ParameterImpl.class,
		SubDescriptorImpl.class,
		ApplicationObjectImpl.class
	};	

	/**
	 * <p>List of all concrete AAF meta definition classes that all
	 * extend {@link MetaDefinition}.</p>
	 */
	public final static Class<?>[] meta = new Class<?>[] {
		ClassDefinitionImpl.class,
		PropertyDefinitionImpl.class,
		TypeDefinitionCharacterImpl.class,
		TypeDefinitionEnumerationImpl.class,
		TypeDefinitionExtendibleEnumerationImpl.class,
		TypeDefinitionFixedArrayImpl.class,
		TypeDefinitionIndirectImpl.class,
		TypeDefinitionOpaqueImpl.class,
		TypeDefinitionIntegerImpl.class,
		TypeDefinitionWeakObjectReferenceImpl.class,
		TypeDefinitionStrongObjectReferenceImpl.class,
		TypeDefinitionRecordImpl.class,
		TypeDefinitionRenameImpl.class,
		TypeDefinitionSetImpl.class,
		TypeDefinitionStreamImpl.class,
		TypeDefinitionStringImpl.class,
		TypeDefinitionVariableArrayImpl.class,
		MetaDictionaryImpl.class,
		ExtensionSchemeImpl.class,
		RootImpl.class,
		PropertyWrapperDefinitionImpl.class
	};
	
	/**
	 * <p>List of all abstract AAF meta definition abstract classes.</p>
	 */
	public final static Class<?>[] abstractMeta = new Class<?>[] {
		MetaDefinitionImpl.class,
		TypeDefinitionImpl.class,
	};
	
	public final static Class<?>[] existingMeta = new Class<?>[] {
		ClassDefinitionImpl.class,
		PropertyDefinitionImpl.class,
		TypeDefinitionCharacterImpl.class,
		TypeDefinitionEnumerationImpl.class,
		TypeDefinitionExtendibleEnumerationImpl.class,
		TypeDefinitionFixedArrayImpl.class,
		TypeDefinitionIndirectImpl.class,
		TypeDefinitionOpaqueImpl.class,
		TypeDefinitionIntegerImpl.class,
		TypeDefinitionWeakObjectReferenceImpl.class,
		TypeDefinitionStrongObjectReferenceImpl.class,
		TypeDefinitionRecordImpl.class,
		TypeDefinitionRenameImpl.class,
		TypeDefinitionSetImpl.class,
		TypeDefinitionStreamImpl.class,
		TypeDefinitionStringImpl.class,
		TypeDefinitionVariableArrayImpl.class 
	};
}
