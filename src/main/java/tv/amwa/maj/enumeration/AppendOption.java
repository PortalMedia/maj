/* 
 **********************************************************************
 *
 * $Id: AppendOption.java,v 1.4 2009/12/18 17:55:59 vizigoth Exp $
 *
 * The contents of this file are subject to the AAF SDK Public
 * Source License Agreement (the "License"); You may not use this file
 * except in compliance with the License.  The License is available in
 * AAFSDKPSL.TXT, or you may obtain a copy of the License from the AAF
 * Association or its successor.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.  See
 * the License for the specific language governing rights and 
 * limitations under the License.
 *
 * The Original Code of this file is Copyright 2007, Licensor of the
 * AAF Association.
 *
 * The Initial Developer of the Original Code of this file and the 
 * Licensor of the AAF Association is Richard Cartwright.
 * All rights reserved.
 *
 * Contributors and Additional Licensors of the AAF Association:
 * Avid Technology, Metaglue Corporation, British Broadcasting Corporation
 *
 **********************************************************************
 */

/*
 * $Log: AppendOption.java,v $
 * Revision 1.4  2009/12/18 17:55:59  vizigoth
 * Interim check in to help with some training activities. Early support for reading Preface objects from MXF files.
 *
 * Revision 1.3  2009/03/30 09:05:04  vizigoth
 * Refactor to use SMPTE harmonized names and add early KLV file support.
 *
 * Revision 1.2  2008/01/08 17:01:53  vizigoth
 * Edited Javadoc comments to release standard and removed unused enumerations.
 *
 * Revision 1.1  2007/11/13 22:14:15  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.enumeration;

import tv.amwa.maj.industry.MediaEnumerationValue;
import tv.amwa.maj.integer.Int64;

/** 
 * <p>Specifies whether a file writing operation should append to or overwrite existing data.</p>
 * 
 * <p>Original C name aafAppendOption_e.<br>
 * 
 * @author <a href="mailto:richard@portability4media.com">Richard Cartwright</a>
 */

public enum AppendOption 
	implements MediaEnumerationValue {

	/** <p>Append to existing data.</p> */            
	Append (0), 
    /** <p>Forcefully overwrite existing data.</p> */ 
	ForceOverwrite (1), 
    ;

    private final int value;

    AppendOption (int value) { this.value = value; }

    @Int64 public long value() { return (long) value; }

    public String symbol() { return name(); }
}