package mat.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * 
 * @author jmeyer
 *
 * Data Container for storing an identifier.
 */
public class CQLIdentifierObject implements IsSerializable {
	
	/**
	 * The alias name of the identifier
	 */
	private String aliasName; 
	private String id;
	
	/**
	 * The identifier
	 */
	private String identifier;

	public CQLIdentifierObject(String aliasName, String identifier, String id) {
		this.aliasName = aliasName;
		this.identifier = identifier;
		this.id = id;
	}
	public CQLIdentifierObject(String aliasName, String identifier) {
		this.aliasName = aliasName;
		this.identifier = identifier;
	}

	public CQLIdentifierObject() {
		
	}

	public String getAliasName() {
		return aliasName;
	}


	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}


	public String getIdentifier() {
		return identifier;
	}


	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	} 
	
	
	@Override
	public String toString() {
		if(aliasName != null && !aliasName.isEmpty()) {
			return aliasName + "." + "\"" + identifier + "\"";
		}
		
		else {
			return "\"" + identifier + "\"";
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
