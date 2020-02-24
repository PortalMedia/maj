package tv.amwa.maj.record.impl;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import tv.amwa.maj.io.mxf.FooterPartition;
import tv.amwa.maj.io.mxf.HeaderMetadata;
import tv.amwa.maj.io.mxf.HeaderPartition;
import tv.amwa.maj.io.mxf.IndexTableSegment;
import tv.amwa.maj.io.mxf.MXFFactory;
import tv.amwa.maj.io.mxf.MXFFile;
import tv.amwa.maj.io.mxf.Partition;
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
import tv.amwa.maj.model.Track;
import tv.amwa.maj.record.AUID;

public class EmbArcTest {
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
		
		for(tv.amwa.maj.model.Package p : packages) {
			if(p instanceof MaterialPackage) {
				for(Track t : p.getPackageTracks()) {
					System.out.println(t.toString());
					if(t instanceof StaticTrack) {
						StaticTrack st = (StaticTrack)t;
						Segment ts = st.getTrackSegment();
						
						ClassDefinition def = st.getObjectClass();
					}
				}
			}
			
		}
		//System.out.println(preface);
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("/users/dan/documents/loc/mxf_prefaceset.txt"));
	    writer.write(fromTheHeader.getPreface().toString());
	    writer.close();
		FooterPartition fp = mxfFile.getFooterPartition();
	}
}
