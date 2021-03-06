package mat.model.cql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mat.shared.CQLIdentifierObject;
import mat.shared.LibHolderObject;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CQLModel implements IsSerializable{
	//private CQLLibraryModel library;
	private String libraryName;
	private String versionUsed;
	private String qdmVersion;
	private String name;
	//private CQLDataModel usedModel;
	//private List<CQLLibraryModel> includeLibraryList = new ArrayList<CQLLibraryModel>();
	private String context;
	private List<CQLQualityDataSetDTO> valueSetList = new ArrayList<CQLQualityDataSetDTO>();
	private List<CQLQualityDataSetDTO> allValueSetList = new ArrayList<CQLQualityDataSetDTO>();
	private List<CQLParameter> cqlParameters = new ArrayList<CQLParameter>();
	private List<CQLDefinition> cqlDefinitions = new ArrayList<CQLDefinition>();
	private List<CQLFunctions> cqlFunctions = new ArrayList<CQLFunctions>();
	private List<CQLCodeSystem> codeSystemList = new ArrayList<CQLCodeSystem>();
	private List<CQLCode> codeList = new ArrayList<CQLCode>();
	private List<CQLIncludeLibrary> cqlIncludeLibrarys = new ArrayList<CQLIncludeLibrary>();
	
	/**
	 * The following 5 may not be populated all the times.	 * 
	 */
	private List<CQLIdentifierObject> includedDefNames = new ArrayList<CQLIdentifierObject>();
	private List<CQLIdentifierObject> includedFuncNames = new ArrayList<CQLIdentifierObject>();
	private List<CQLIdentifierObject> includedValueSetNames = new ArrayList<CQLIdentifierObject>();
	private List<CQLIdentifierObject> includedParamNames = new ArrayList<CQLIdentifierObject>();
	private List<CQLIdentifierObject> includedCodeNames = new ArrayList<CQLIdentifierObject>();
	
	/**
	 * This member is set programatically from some class and isnt populated by Hibernate.
	 * So it is possible it is null/empty.
	 */
	private Map<String, LibHolderObject> includedCQLLibXMLMap = new HashMap<String, LibHolderObject>();
	
	
	private int lines;
	
	/*public CQLDataModel getUsedModel() {
		return usedModel;
	}
	public void setUsedModel(CQLDataModel usedModel) {
		this.usedModel = usedModel;
	}*/
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public List<CQLQualityDataSetDTO> getValueSetList() {
		return valueSetList;
	}
	public void setValueSetList(List<CQLQualityDataSetDTO> valueSetList) {
		this.valueSetList = valueSetList;
	}
	/*public List<CQLLibraryModel> getIncludeLibraryList() {
		return includeLibraryList;
	}
	public void setIncludeLibraryList(List<CQLLibraryModel> includeLibraryList) {
		this.includeLibraryList = includeLibraryList;
	}*/
	/*public CQLLibraryModel getLibrary() {
		return library;
	}
	public void setLibrary(CQLLibraryModel library) {
		this.library = library;
	}*/
	public List<CQLParameter> getCqlParameters() {
		return cqlParameters;
	}
	public void setCqlParameters(List<CQLParameter> cqlParameters) {
		this.cqlParameters = cqlParameters;
	}
	public List<CQLDefinition> getDefinitionList() {
		return cqlDefinitions;
	}
	public void setDefinitionList(List<CQLDefinition> definitionList) {
		cqlDefinitions = definitionList;
	}
	public List<CQLFunctions> getCqlFunctions() {
		return cqlFunctions;
	}
	public void setCqlFunctions(List<CQLFunctions> cqlFunctions) {
		this.cqlFunctions = cqlFunctions;
	}
	public int getLines() {
		return lines;
	}
	public void setLines(int lines) {
		this.lines = lines;
	}
	public List<CQLCodeSystem> getCodeSystemList() {
		return codeSystemList;
	}
	public void setCodeSystemList(List<CQLCodeSystem> list) {
		this.codeSystemList = list;
	}
	public List<CQLCode> getCodeList() {
		return codeList;
	}
	public void setCodeList(List<CQLCode> codeList) {
		this.codeList = codeList;
	}
	public List<CQLQualityDataSetDTO> getAllValueSetList() {
		return allValueSetList;
	}
	public void setAllValueSetList(List<CQLQualityDataSetDTO> allValueSetList) {
		this.allValueSetList = allValueSetList;
	}
	public List<CQLIncludeLibrary> getCqlIncludeLibrarys() {
		return cqlIncludeLibrarys;
	}
	public void setCqlIncludeLibrarys(List<CQLIncludeLibrary> cqlIncludeLibrarys) {
		this.cqlIncludeLibrarys = cqlIncludeLibrarys;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getVersionUsed() {
		return versionUsed;
	}
	public void setVersionUsed(String versionUsed) {
		this.versionUsed = versionUsed;
	}
	public String getQdmVersion() {
		return qdmVersion;
	}
	public void setQdmVersion(String qdmVersion) {
		this.qdmVersion = qdmVersion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, mat.shared.LibHolderObject> getIncludedCQLLibXMLMap() {
		return includedCQLLibXMLMap;
	}
	public void setIncludedCQLLibXMLMap(Map<String, mat.shared.LibHolderObject> includedCQLLibXMLMap) {
		this.includedCQLLibXMLMap = includedCQLLibXMLMap;
	}
	public List<CQLIdentifierObject> getIncludedDefNames() {
		return includedDefNames;
	}
	public void setIncludedDefNames(List<CQLIdentifierObject> includedDefNames) {
		this.includedDefNames = includedDefNames;
	}
	public List<CQLIdentifierObject> getIncludedFuncNames() {
		return includedFuncNames;
	}
	public void setIncludedFuncNames(List<CQLIdentifierObject> includedFuncNames) {
		this.includedFuncNames = includedFuncNames;
	}
	public List<CQLIdentifierObject> getIncludedValueSetNames() {
		return includedValueSetNames;
	}
	public void setIncludedValueSetNames(List<CQLIdentifierObject> includedValueSetNames) {
		this.includedValueSetNames = includedValueSetNames;
	}
	public List<CQLIdentifierObject> getIncludedParamNames() {
		return includedParamNames;
	}
	public void setIncludedParamNames(List<CQLIdentifierObject> includedParamNames) {
		this.includedParamNames = includedParamNames;
	}
	public List<CQLIdentifierObject> getIncludedCodeNames() {
		return includedCodeNames;
	}
	public void setIncludedCodeNames(List<CQLIdentifierObject> includedCodeNames) {
		this.includedCodeNames = includedCodeNames;
	}
	
}
