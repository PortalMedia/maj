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
 * $Log: PhaseFrameType.java,v $
 * Revision 1.5  2011/02/14 22:33:03  vizigoth
 * First commit after major sourceforge outage.
 *
 * Revision 1.4  2011/01/04 10:42:32  vizigoth
 * Refactor all package names to simpler forms more consistent with typical Java usage.
 *
 * Revision 1.3  2007/12/12 12:52:27  vizigoth
 * Added documentation tag to annotations.
 *
 * Revision 1.2  2007/11/23 15:04:16  vizigoth
 * Edited javadoc comments to release standard.
 *
 * Revision 1.1  2007/11/13 22:08:08  vizigoth
 * Public release of MAJ API.
 *
 */

package tv.amwa.maj.misctype;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/** 
 * <p>Labels an integer (Java <code>int</code>) value that represents the phase within 
 * the repeating pulldown pattern of the first frame after the pulldown conversion. A value of 
 * <code>0</code> specifies that the {@linkplain tv.amwa.maj.model.Pulldown pulldown} object starts 
 * at the beginning of the pulldown pattern.</p>
 * 
 * <p>
 * Original C name: <code>aafPhaseFrame_t</code><br>
 * C base type: <code>aafInt32</code><br>
 * Java base type: <code>int</code>
 * </p>
 * 
 * @see tv.amwa.maj.model.Pulldown#getPhaseFrame()
 * @see tv.amwa.maj.industry.TypeDefinitions#PhaseFrameType
 * 
 *
 */
@Documented
@Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
public @interface PhaseFrameType { }

