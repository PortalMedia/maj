/* 
 **********************************************************************
 *
 * $Id: ParameterDescription.java,v 1.5 2011/01/13 17:44:26 vizigoth Exp $
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
 * $Log: ParameterDescription.java,v $
 * Revision 1.5  2011/01/13 17:44:26  vizigoth
 * Major refactor of the industrial area and improved front-end documentation.
 *
 * Revision 1.4  2011/01/04 10:43:58  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.3  2008/10/16 16:52:01  vizigoth
 * First early release 0.1.
 *
 * Revision 1.2  2007/12/12 12:29:54  vizigoth
 * Added to and edited document comments to a release level.
 *
 * Revision 1.1  2007/11/13 22:12:35  vizigoth
 * Public release of MAJ API.
 */

package tv.amwa.maj.constant;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * <p>Labels an {@linkplain tv.amwa.maj.record.AUID AUID} that is a unique identifier for a 
 * {@linkplain tv.amwa.maj.model.Parameter parameter}
 * to an {@linkplain tv.amwa.maj.model.OperationDefinition operation}. The additional metadata provided by this
 * annotation can be used in combination with the identifier to create a 
 * {@linkplain tv.amwa.maj.model.ParameterDefinition parameter definition}. </p>
 * 
 * <p>See the <a href="package-summary.html#managingDefinitions">description of managing definitions</a> 
 * in the package summary for more details of how to use these constants and dynamically extend the range 
 * of supported parameters.</p>
 * 
 * @see ParameterConstant
 * @see tv.amwa.maj.model.ParameterDefinition
 * @see tv.amwa.maj.model.Parameter
 * 
 * @author <a href="mailto:richard@portability4media.com">Richard Cartwright</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ParameterDescription {

	/**
	 * <p>A brief description of the operation parameter.</p>
	 */
	String description() default "";
	
	/**
	 * <p>A list of alternative names that can be used as aliases for the parameter.</p>
	 */
	String[] aliases() default { };
	
	/**
	 * <p>The name of the AAF data type for all values of the parameter.</p>
	 * 
	 * @see tv.amwa.maj.industry.Warehouse#lookForType(String)
	 * @see tv.amwa.maj.util.LookupTable
	 */
	String typeName();

	/**
	 * <p>An optional string of characters to display next to a value of the parameter to indicate its type,
	 * eg. "fps" for <em>frames per second</em>.</p> 
	 */
	String displayUnits() default "";
}