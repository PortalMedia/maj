package tv.amwa.maj.record.impl;

public interface J2KExtendedCapabilities {

	int getPcap();

	void setPcap(int pcap) throws NullPointerException;

	int getCcapi();

	void setCcapi(short[] ccapi) throws NullPointerException;

}