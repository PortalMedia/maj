package tv.amwa.maj.record.impl;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import tv.amwa.maj.industry.Forge;
import tv.amwa.maj.io.mxf.FooterPartition;
import tv.amwa.maj.io.mxf.HeaderMetadata;
import tv.amwa.maj.io.mxf.HeaderOpenIncompletePartitionPack;
import tv.amwa.maj.io.mxf.HeaderPartition;
import tv.amwa.maj.io.mxf.IndexTableSegment;
import tv.amwa.maj.io.mxf.MXFBuilder;
import tv.amwa.maj.io.mxf.MXFFactory;
import tv.amwa.maj.io.mxf.MXFFile;
import tv.amwa.maj.io.mxf.MXFStream;
import tv.amwa.maj.io.mxf.MXFUnit;
import tv.amwa.maj.io.mxf.Partition;
import tv.amwa.maj.io.mxf.PartitionPack;
import tv.amwa.maj.io.mxf.RandomIndexItem;
import tv.amwa.maj.io.mxf.RandomIndexPack;
import tv.amwa.maj.meta.ClassDefinition;
import tv.amwa.maj.model.AS07CoreDMSFramework;
import tv.amwa.maj.model.Component;
import tv.amwa.maj.model.ContentStorage;
import tv.amwa.maj.model.DataDefinition;
import tv.amwa.maj.model.Identification;
import tv.amwa.maj.model.MaterialPackage;
import tv.amwa.maj.model.Preface;
import tv.amwa.maj.model.Segment;
import tv.amwa.maj.model.Sequence;
import tv.amwa.maj.model.StaticTrack;
import tv.amwa.maj.model.TaggedValue;
import tv.amwa.maj.model.TimelineTrack;
import tv.amwa.maj.model.Track;
import tv.amwa.maj.record.AUID;

public class EmbArcTest {
	@Test public void testWriteMxf() throws IOException {
		/*MXFFile mxfFile = MXFFactory.readPartitions("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");
		HeaderMetadata fromTheHeader = mxfFile.getHeaderPartition().readHeaderMetadata();
		
		//System.out.println(fromTheHeader.getPrimerPack().toString());
		Preface preface = fromTheHeader.getPreface();
		
		MXFStream.writeValue(stream, buffer);
		
		InputStream stream = new FileInputStream("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");

		MXFBuilder.registerMXF();
				
		MXFUnit unit = null;
		while(stream.available()>0){
			unit = MXFStream.readNextUnit(stream, 10000000);
			if(unit!=null) {
				System.out.print(unit.toString());
			}
		}
		
		
		MXFBuilder.registerMXF();
		InputStream stream = new FileInputStream("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");
		
		OutputStream outputStream = new FileOutputStream("test_out.mxf");
		
		RandomIndexPack rip = MXFStream.readRandomIndexPack(stream);
		List<PartitionPack> packs = new ArrayList<PartitionPack>();
		  List<IndexTableSegment> index = new ArrayList<IndexTableSegment>();
		  long readBytes = 0;
		  for ( RandomIndexItem item : rip.getPartitionIndex() ) {
		    MXFStream.skipForward(stream, item.getByteOffset() - readBytes);
		    PartitionPack pack = MXFStream.readPartitionPack(stream);
		    packs.add(pack);
		    readBytes += 20 + pack.getEncodedSize();
		    if (pack.getIndexSID() > 0) { // Assuming no mixed header and index partitions
		      IndexTableSegment segment = MXFStream.readIndexTableSegment(stream);
		      index.add(segment);
		      readBytes += 20 + ((PartitionPack) segment).getEncodedSize();
		    }    
		  

			MXFFile mxfFile = MXFFactory.readPartitions("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");
			
			HeaderMetadata fromTheHeader = mxfFile.getHeaderPartition().readHeaderMetadata();
			
			//System.out.println(fromTheHeader.getPrimerPack().toString());
			Preface preface = fromTheHeader.getPreface();
			
			
			
			PartitionPack essencePack = mxfFile.getHeaderPartition().getPartitionPack();
		
			int bufferSize = 0;
			  int essenceBlockSize = bufferSize < 65536 ? 65546 : bufferSize; // Always at least one block, allowing 64k
				ByteArrayOutputStream essenceHeaderBytes = new ByteArrayOutputStream(essenceBlockSize);
				essencePack.setHeaderByteCount(essenceBlockSize - essencePack.getEncodedSize() - 20);
				MXFStream.writePartitionPack(essenceHeaderBytes, essencePack);
				MXFStream.writeHeaderMetadata(essenceHeaderBytes, fromTheHeader.getPreface());
			  MXFStream.writeFill(essenceHeaderBytes, essenceBlockSize - essenceHeaderBytes.size());
			  
			  try(OutputStream outputStream = new FileOutputStream("thefilename.mxf")) {
				  essenceHeaderBytes.writeTo(outputStream);
				}
		
		
		  // Primer pack - lookup uuids from this primer pack
		HeaderMetadata fromTheHeader = mxfFile.getHeaderPartition().readHeaderMetadata();
		
		//System.out.println(fromTheHeader.getPrimerPack().toString());
		Preface preface = fromTheHeader.getPreface();
		
		PartitionPack essencePack = Forge.make(HeaderOpenIncompletePartitionPack.class);  
		  essencePack.setFooterPartition(0l);
		  essencePack.setThisPartition(0l);
		  essencePack.setPreviousPartition(0l);
			essencePack.setKagSize(1);
			essencePack.setMajorVersion((short) 1);
			essencePack.setMinorVersion((short) 3);
			essencePack.setOperationalPattern(preface.getOperationalPattern());
			essencePack.addEssenceContainer(fileDescriptor.getContainerFormat().getAUID());
			
		int bufferSize = 0;
		  int essenceBlockSize = bufferSize < 65536 ? 65546 : bufferSize; // Always at least one block, allowing 64k
			ByteArrayOutputStream essenceHeaderBytes = new ByteArrayOutputStream(essenceBlockSize);
			essencePack.setHeaderByteCount(essenceBlockSize - essencePack.getEncodedSize() - 20);
			MXFStream.writePartitionPack(essenceHeaderBytes, essencePack);
			MXFStream.writeHeaderMetadata(essenceHeaderBytes, essenceComponentPreface);
		  MXFStream.writeFill(essenceHeaderBytes, essenceBlockSize - essenceHeaderBytes.size());
		  
		  */
		  
		  
	}
	@Test public void testMxf() throws NullPointerException, IOException {
		MXFFile mxfFile = MXFFactory.readPartitions("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");
		
		/*String s = MXFFactory.dumpFile("/Users/dan/Downloads/as07_sample1-gf-unc-3.1.mxf/as07_sample1-gf-unc-3.1.mxf");
		System.out.println(s);
		
	     
	    BufferedWriter writer = new BufferedWriter(new FileWriter("/users/dan/documents/loc/mxf_test_output.txt"));
	    writer.write(s);
	    writer.close();*/
		RandomIndexPack rip = mxfFile.getRandomIndexPack();
		
//		
//		for(RandomIndexItem ri : rip.getPartitionIndex()) {
//			System.out.println(ri);
//		}
//		
		
		// Body Partitions
		for(int i = 0; i < rip.getPartitionIndex().length; i++) {
			Partition partition = mxfFile.getPartitionAt(i);
			//System.out.println(partition);
		}
		
		// Primer pack - lookup uuids from this primer pack
		HeaderMetadata fromTheHeader = mxfFile.getHeaderPartition().readHeaderMetadata();
		
		//System.out.println(fromTheHeader.getPrimerPack().toString());
		Preface preface = fromTheHeader.getPreface();
		ContentStorage contentStorage = preface.getContentStorageObject();
		Set<? extends tv.amwa.maj.model.Package> packages = contentStorage.getPackages();
		int sound = 0;
		for(tv.amwa.maj.model.Package p : packages) {
			if(p instanceof MaterialPackage) {
				for(Track t : p.getPackageTracks()) {
					System.out.println(t.toString());
					if(t instanceof TimelineTrack) {
						TimelineTrack st = (TimelineTrack)t;
					
						Segment ts = st.getTrackSegment();
						
						ClassDefinition def = st.getObjectClass();
						DataDefinition d = ts.getComponentDataDefinition();
						int i = 0;
						//urn:smpte:ul:060e2b34.04010101.01030202.01000000
						
					}
				}
			}
			
		}
		//System.out.println(preface);
/*
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("/users/dan/documents/loc/mxf_prefaceset.txt"));
	    writer.write(fromTheHeader.getPreface().toString());
	    writer.close();
		FooterPartition fp = mxfFile.getFooterPartition();
		*/
		//MXFStream.writeFill(stream, totalLength);
	}
}
