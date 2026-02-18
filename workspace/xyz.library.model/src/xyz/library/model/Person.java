package xyz.library.model;

public class Person implements java.io.Serializable {

	private static final long serialVersionUID = 2443780218298939513L;

	private String name;
	private String contactInfo;

	public Person(String name) {
		this.name = name;
		this.contactInfo = null;
	}

	public Person(String name, String contactInfo) {
		this.name = name;
		this.contactInfo = contactInfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		// A person name can change
		this.name = name;
	}

	public String getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		// A person' address, etc. can change
		this.contactInfo = contactInfo;
	}

}
