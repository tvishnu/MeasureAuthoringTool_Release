package mat.model.cql;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The Class CQLIncludeLibrary.
 */
public class CQLIncludeLibrary implements IsSerializable {

	/** The id. */
	private String id;

	/** The Alias name. */
	private String aliasName;

	/** The cql library id. */
	private String cqlLibraryId;

	/** The version. */
	private String version;
	
	private String cqlLibraryName;
	
	private String qdmVersion;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the alias name.
	 *
	 * @return the alias name
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * Sets the alias name.
	 *
	 * @param aliasName
	 *            the new alias name
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	/**
	 * Gets the cql library id.
	 *
	 * @return the cql library id
	 */
	public String getCqlLibraryId() {
		return cqlLibraryId;
	}

	/**
	 * Sets the cql library id.
	 *
	 * @param cqlLibraryId
	 *            the new cql library id
	 */
	public void setCqlLibraryId(String cqlLibraryId) {
		this.cqlLibraryId = cqlLibraryId;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	public String getCqlLibraryName() {
		return cqlLibraryName;
	}

	public void setCqlLibraryName(String cqlLibraryName) {
		this.cqlLibraryName = cqlLibraryName;
	}
	
	public String getQdmVersion() {
		return qdmVersion;
	}

	public void setQdmVersion(String qdmVersion) {
		this.qdmVersion = qdmVersion;
	}

	@Override
	public boolean equals(Object arg0) {
		CQLIncludeLibrary cqlIncludeLibrary = (CQLIncludeLibrary)arg0;
		
		if(cqlIncludeLibrary == null){
			System.out.println("equals falseee");
			return false;
		}
		
		if(cqlIncludeLibrary.cqlLibraryId.equals(cqlLibraryId) && 
			cqlIncludeLibrary.aliasName.equals(aliasName) && 
			cqlIncludeLibrary.cqlLibraryName.equals(cqlLibraryName) && 
			cqlIncludeLibrary.version.equals(version)
			){
			
			System.out.println(cqlIncludeLibrary.cqlLibraryId + " == " + cqlLibraryId);
			System.out.println(cqlIncludeLibrary.aliasName + " == " + aliasName);
			System.out.println(cqlIncludeLibrary.cqlLibraryName + " == " + cqlLibraryName);
			System.out.println(cqlIncludeLibrary.version + " == " + version);
			System.out.println(cqlIncludeLibrary.qdmVersion + " == " + qdmVersion);
			
			System.out.println("equals true");
			
			return true;
		}
		System.out.println("equals false");
		return false;
	}
	
		
	/**
	 * The Class Comparator.
	 */
	public static class Comparator implements java.util.Comparator<CQLIncludeLibrary>, IsSerializable {

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(CQLIncludeLibrary o1, CQLIncludeLibrary o2) {
			return o1.getAliasName().compareTo(o2.getAliasName());
		}

	}
	
	public String toString(){
		return this.id + "|" + this.cqlLibraryId + "|" + this.cqlLibraryName + "|" + this.aliasName + "|" + this.version; 
	}

}
