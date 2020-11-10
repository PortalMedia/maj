package tv.amwa.maj.model;

import tv.amwa.maj.exception.PropertyNotPresentException;
import tv.amwa.maj.model.impl.CryptographicContext;
import tv.amwa.maj.record.AUID;

public interface CryptographicFramework extends DescriptiveFramework{

	void setCryptographicContextObject(CryptographicContext cryptographicContextObject);

	CryptographicContext getCryptographicContextObject() throws PropertyNotPresentException;


}