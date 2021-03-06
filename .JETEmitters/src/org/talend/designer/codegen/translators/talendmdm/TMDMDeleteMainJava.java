package org.talend.designer.codegen.translators.talendmdm;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import java.util.List;
import java.util.Map;

public class TMDMDeleteMainJava
{
  protected static String nl;
  public static synchronized TMDMDeleteMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TMDMDeleteMainJava result = new TMDMDeleteMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "                if(log.is";
  protected final String TEXT_3 = "Enabled())";
  protected final String TEXT_4 = NL + "            log.";
  protected final String TEXT_5 = "(\"";
  protected final String TEXT_6 = " - \" ";
  protected final String TEXT_7 = " + ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = ");";
  protected final String TEXT_10 = NL + "            StringBuilder ";
  protected final String TEXT_11 = " = new StringBuilder();";
  protected final String TEXT_12 = NL + "            ";
  protected final String TEXT_13 = ".append(\"Parameters:\");";
  protected final String TEXT_14 = NL + "                    ";
  protected final String TEXT_15 = ".append(\"";
  protected final String TEXT_16 = "\" + \" = \" + String.valueOf(";
  protected final String TEXT_17 = ").substring(0, 4) + \"...\");     ";
  protected final String TEXT_18 = NL + "                    ";
  protected final String TEXT_19 = ".append(\"";
  protected final String TEXT_20 = "\" + \" = \" + ";
  protected final String TEXT_21 = ");";
  protected final String TEXT_22 = NL + "                ";
  protected final String TEXT_23 = ".append(\" | \");";
  protected final String TEXT_24 = NL + "            StringBuilder ";
  protected final String TEXT_25 = " = new StringBuilder();    ";
  protected final String TEXT_26 = NL + "                    ";
  protected final String TEXT_27 = ".append(";
  protected final String TEXT_28 = ".";
  protected final String TEXT_29 = ");";
  protected final String TEXT_30 = NL + "                    if(";
  protected final String TEXT_31 = ".";
  protected final String TEXT_32 = " == null){";
  protected final String TEXT_33 = NL + "                        ";
  protected final String TEXT_34 = ".append(\"<null>\");" + NL + "                    }else{";
  protected final String TEXT_35 = NL + "                        ";
  protected final String TEXT_36 = ".append(";
  protected final String TEXT_37 = ".";
  protected final String TEXT_38 = ");" + NL + "                    }   ";
  protected final String TEXT_39 = NL + "                ";
  protected final String TEXT_40 = ".append(\"|\");";
  protected final String TEXT_41 = NL + "List<String> wsIds_";
  protected final String TEXT_42 = " = new java.util.ArrayList<String>();" + NL + "{";
  protected final String TEXT_43 = NL + "    wsIds_";
  protected final String TEXT_44 = ".add(";
  protected final String TEXT_45 = ".";
  protected final String TEXT_46 = ");";
  protected final String TEXT_47 = "};" + NL + "org.talend.mdm.webservice.WSItemPK wsPK_";
  protected final String TEXT_48 = " = new org.talend.mdm.webservice.WSItemPK(";
  protected final String TEXT_49 = ", wsIds_";
  protected final String TEXT_50 = ", dataCluster_";
  protected final String TEXT_51 = ");" + NL + "///////////////////////\t" + NL + "" + NL + "try{" + NL + "\t";
  protected final String TEXT_52 = NL + "\t\torg.talend.mdm.webservice.WSDropItem item_";
  protected final String TEXT_53 = " = new org.talend.mdm.webservice.WSDropItem();" + NL + "\t\titem_";
  protected final String TEXT_54 = ".setPartPath(";
  protected final String TEXT_55 = ");" + NL + "\t";
  protected final String TEXT_56 = NL + "\t\torg.talend.mdm.webservice.WSDeleteItem item_";
  protected final String TEXT_57 = " = new org.talend.mdm.webservice.WSDeleteItem();" + NL + "\t";
  protected final String TEXT_58 = NL + "\titem_";
  protected final String TEXT_59 = ".setWsItemPK(wsPK_";
  protected final String TEXT_60 = ");" + NL + "\titem_";
  protected final String TEXT_61 = ".setOverride(false);" + NL + "\t";
  protected final String TEXT_62 = NL + "\t\titem_";
  protected final String TEXT_63 = ".setWithReport(true);" + NL + "\t\titem_";
  protected final String TEXT_64 = ".setSource(";
  protected final String TEXT_65 = ");" + NL + "\t\titem_";
  protected final String TEXT_66 = ".setInvokeBeforeDeleting(";
  protected final String TEXT_67 = ");" + NL + "\t";
  protected final String TEXT_68 = NL + "\t\t";
  protected final String TEXT_69 = NL + "\t\tservice_";
  protected final String TEXT_70 = " .dropItem(item_";
  protected final String TEXT_71 = ");\t\t" + NL + "\t";
  protected final String TEXT_72 = NL + "\t\t";
  protected final String TEXT_73 = NL + "\t\tservice_";
  protected final String TEXT_74 = " .deleteItem(item_";
  protected final String TEXT_75 = ");\t\t";
  protected final String TEXT_76 = NL + "}catch(java.lang.Exception e){";
  protected final String TEXT_77 = NL + "\t";
  protected final String TEXT_78 = NL + "\tthrow(e);";
  protected final String TEXT_79 = NL + "\tSystem.err.println(e.getMessage());";
  protected final String TEXT_80 = NL + "}" + NL + "nb_line_";
  protected final String TEXT_81 = "++; " + NL + "" + NL + "///////////////////////    \t\t\t";
  protected final String TEXT_82 = NL + "\t";
  protected final String TEXT_83 = NL + "\torg.talend.mdm.webservice.WSWhereCondition wc_";
  protected final String TEXT_84 = " = null;" + NL + "\tjava.util.List<org.talend.mdm.webservice.WSWhereItem> conditions_";
  protected final String TEXT_85 = " = new java.util.ArrayList<org.talend.mdm.webservice.WSWhereItem>();";
  protected final String TEXT_86 = NL + "\t       wc_";
  protected final String TEXT_87 = " =new org.talend.mdm.webservice.WSWhereCondition(";
  protected final String TEXT_88 = ",org.talend.mdm.webservice.WSWhereOperator.";
  protected final String TEXT_89 = ", ";
  protected final String TEXT_90 = ", false, org.talend.mdm.webservice.WSStringPredicate.";
  protected final String TEXT_91 = ");" + NL + "\t       org.talend.mdm.webservice.WSWhereItem wsItem_";
  protected final String TEXT_92 = "_";
  protected final String TEXT_93 = "=new org.talend.mdm.webservice.WSWhereItem(null,wc_";
  protected final String TEXT_94 = ",null);" + NL + "\t       conditions_";
  protected final String TEXT_95 = ".add(wsItem_";
  protected final String TEXT_96 = "_";
  protected final String TEXT_97 = ");";
  protected final String TEXT_98 = NL + "\t    org.talend.mdm.webservice.WSWhereItem wsItem_";
  protected final String TEXT_99 = " = null;" + NL + "\t    if(conditions_";
  protected final String TEXT_100 = ".size() > 0){";
  protected final String TEXT_101 = "  " + NL + "           org.talend.mdm.webservice.WSWhereAnd whereAnd_";
  protected final String TEXT_102 = " = new org.talend.mdm.webservice.WSWhereAnd(conditions_";
  protected final String TEXT_103 = "); " + NL + "\t\t   wsItem_";
  protected final String TEXT_104 = " =new org.talend.mdm.webservice.WSWhereItem(whereAnd_";
  protected final String TEXT_105 = ",null,null);";
  protected final String TEXT_106 = NL + "            org.talend.mdm.webservice.WSWhereOr whereOr_";
  protected final String TEXT_107 = " = new org.talend.mdm.webservice.WSWhereOr(conditions_";
  protected final String TEXT_108 = "); " + NL + "\t\t    wsItem_";
  protected final String TEXT_109 = " =new org.talend.mdm.webservice.WSWhereItem(null,null,whereOr_";
  protected final String TEXT_110 = ");";
  protected final String TEXT_111 = NL + "\t   }" + NL + "\t" + NL + "\ttry{" + NL + "\t\t";
  protected final String TEXT_112 = NL + "\t\torg.talend.mdm.webservice.WSDeleteItems items_";
  protected final String TEXT_113 = " = new org.talend.mdm.webservice.WSDeleteItems(";
  protected final String TEXT_114 = ", false, ";
  protected final String TEXT_115 = ", dataCluster_";
  protected final String TEXT_116 = ", wsItem_";
  protected final String TEXT_117 = ");" + NL + "\t\tservice_";
  protected final String TEXT_118 = ".deleteItems(items_";
  protected final String TEXT_119 = ");\t\t" + NL + "\t}catch(java.lang.Exception e){" + NL + "\t";
  protected final String TEXT_120 = "\t\t" + NL + "\t\tthrow(e);";
  protected final String TEXT_121 = "\t\t" + NL + "\t\tSystem.err.println(e.getMessage());";
  protected final String TEXT_122 = NL + "\t}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
class BasicLogUtil{
    protected String cid  = "";
    protected org.talend.core.model.process.INode node = null;
    protected boolean log4jEnabled = false;
    private String logID = "";
    
    private BasicLogUtil(){}
    
    public BasicLogUtil(org.talend.core.model.process.INode node){
        this.node = node;
        String cidx = this.node.getUniqueName();
        if(cidx.matches("^.*?tAmazonAuroraOutput_\\d+_out$")){
             cidx = cidx.substring(0,cidx.length()-4);// 4 ==> "_out".length();
        }
        this.cid = cidx;
        this.log4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(this.node.getProcess(), "__LOG4J_ACTIVATE__"));
        this.log4jEnabled = this.log4jEnabled &&
                            this.node.getComponent().isLog4JEnabled() && !"JOBLET".equals(node.getComponent().getComponentType().toString());
        this.logID = this.cid;
    }
    
    public String var(String varName){
        return varName + "_" + this.cid;
    }
    public String str(String content){
        return "\"" + content + "\"";
    }
    
    public void info(String... message){
        log4j("info", message);
    }
    
    public void debug(String... message){
        log4j("debug", message);
    }
    
    public void warn(String... message){
        log4j("warn", message);
    }
    
    public void error(String... message){
        log4j("error", message);
    }
    
    public void fatal(String... message){
        log4j("fatal", message);
    }
    
    public void trace(String... message){
        log4j("trace", message);
    }
    java.util.List<String> checkableList = java.util.Arrays.asList(new String[]{"info", "debug", "trace"});     
    public void log4j(String level, String... messages){
        if(this.log4jEnabled){
            if(checkableList.contains(level)){
            
    stringBuffer.append(TEXT_2);
    stringBuffer.append(level.substring(0, 1).toUpperCase() + level.substring(1));
    stringBuffer.append(TEXT_3);
    
            }
            
    stringBuffer.append(TEXT_4);
    stringBuffer.append(level);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(logID);
    stringBuffer.append(TEXT_6);
    for(String message : messages){
    stringBuffer.append(TEXT_7);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    
        }
    }
    
    public boolean isActive(){
        return this.log4jEnabled;
    }
}

class LogUtil extends BasicLogUtil{
    
    private LogUtil(){
    }
    
    public LogUtil(org.talend.core.model.process.INode node){
        super(node);
    }
    
    public void startWork(){
        info(str("Start to work."));
    }
    
    public void endWork(){
        info(str("Done."));
    }
    
    public void logIgnoredException(String exception){
        warn(exception);
    }
    
    public void logPrintedException(String exception){
        error(exception);
    }
    
    public void logException(String exception){
        fatal(exception);
    }
    
    public void logCompSetting(){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_10);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_13);
    
            java.util.Set<org.talend.core.model.process.EParameterFieldType> ignoredParamsTypes = new java.util.HashSet<org.talend.core.model.process.EParameterFieldType>(); 
            ignoredParamsTypes.addAll(
                java.util.Arrays.asList(
                    org.talend.core.model.process.EParameterFieldType.SCHEMA_TYPE,
                    org.talend.core.model.process.EParameterFieldType.LABEL,
                    org.talend.core.model.process.EParameterFieldType.EXTERNAL,
                    org.talend.core.model.process.EParameterFieldType.MAPPING_TYPE,
                    org.talend.core.model.process.EParameterFieldType.IMAGE,
                    org.talend.core.model.process.EParameterFieldType.TNS_EDITOR,
                    org.talend.core.model.process.EParameterFieldType.WSDL2JAVA,
                    org.talend.core.model.process.EParameterFieldType.GENERATEGRAMMARCONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.GENERATE_SURVIVORSHIP_RULES_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.REFRESH_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.BROWSE_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.PALO_DIM_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.GUESS_SCHEMA,
                    org.talend.core.model.process.EParameterFieldType.MATCH_RULE_IMEX_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.MEMO_PERL,
                    org.talend.core.model.process.EParameterFieldType.DBTYPE_LIST,
                    org.talend.core.model.process.EParameterFieldType.VERSION,
                    org.talend.core.model.process.EParameterFieldType.TECHNICAL,
                    org.talend.core.model.process.EParameterFieldType.ICON_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.JAVA_COMMAND,
                    org.talend.core.model.process.EParameterFieldType.TREE_TABLE,
                    org.talend.core.model.process.EParameterFieldType.VALIDATION_RULE_TYPE,
                    org.talend.core.model.process.EParameterFieldType.DCSCHEMA,
                    org.talend.core.model.process.EParameterFieldType.SURVIVOR_RELATION,
                    org.talend.core.model.process.EParameterFieldType.REST_RESPONSE_SCHEMA_TYPE
                    )
            );
            for(org.talend.core.model.process.IElementParameter ep : org.talend.core.model.utils.NodeUtil.getDisplayedParameters(node)){
                if(!ep.isLog4JEnabled() || ignoredParamsTypes.contains(ep.getFieldType())){
                    continue;
                }
                String name = ep.getName();
                if(org.talend.core.model.process.EParameterFieldType.PASSWORD.equals(ep.getFieldType())){
                    String epName = "__" + name + "__";
                    String password = "";
                    if(org.talend.core.model.process.ElementParameterParser.canEncrypt(node, epName)){
                        password = org.talend.core.model.process.ElementParameterParser.getEncryptedValue(node, epName);
                    }else{
                        String passwordValue = org.talend.core.model.process.ElementParameterParser.getValue(node, epName);
                        if (passwordValue == null || "".equals(passwordValue.trim())) {// for the value which empty
                            passwordValue = "\"\"";
                        } 
                        password = "routines.system.PasswordEncryptUtil.encryptPassword(" + passwordValue + ")";
                    } 
                    
    stringBuffer.append(TEXT_14);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(password);
    stringBuffer.append(TEXT_17);
    
                }else{
                    String value = org.talend.core.model.utils.NodeUtil.getNormalizeParameterValue(node, ep);
                    
    stringBuffer.append(TEXT_18);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(value);
    stringBuffer.append(TEXT_21);
    
                }   
                
    stringBuffer.append(TEXT_22);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_23);
    
            }
        }
        debug(var("log4jParamters"));
    }
    
    //no use for now, because we log the data by rowStruct
    public void traceData(String rowStruct, java.util.List<org.talend.core.model.metadata.IMetadataColumn> columnList, String nbline){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_24);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_25);
    
            for(org.talend.core.model.metadata.IMetadataColumn column : columnList){
                org.talend.core.model.metadata.types.JavaType javaType = org.talend.core.model.metadata.types.JavaTypesManager.getJavaTypeFromId(column.getTalendType());
                String columnName = column.getLabel();
                boolean isPrimit = org.talend.core.model.metadata.types.JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable());
                if(isPrimit){
                
    stringBuffer.append(TEXT_26);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_29);
    
                }else{
                
    stringBuffer.append(TEXT_30);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_38);
    
                }
                
    stringBuffer.append(TEXT_39);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_40);
    
            }
        }
        trace(str("Content of the record "), nbline, str(": "), var("log4jSb"));
        
    
    }
}

class LogHelper{
    
    java.util.Map<String, String> pastDict = null;
    
    public LogHelper(){
        pastDict = new java.util.HashMap<String, String>();
        pastDict.put("insert", "inserted");
        pastDict.put("update", "updated");
        pastDict.put("delete", "deleted");
        pastDict.put("upsert", "upserted");
    }   
    
    public String upperFirstChar(String data){ 
        return data.substring(0, 1).toUpperCase() + data.substring(1);
    }
    
    public String toPastTense(String data){
        return pastDict.get(data);
    }
}
LogHelper logHelper = new LogHelper();

LogUtil log = null;

    
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
    INode node = (INode)codeGenArgument.getArgument();
    LogUtil logUtil = new LogUtil(node);
    String cid = node.getUniqueName();
    
    boolean isDropItem = ("true").equals(ElementParameterParser.getValue(node,"__USE_DROP_ITEM__"));
    String partPath = ElementParameterParser.getValue(node,"__PART_PATH__");
    
    boolean dieOnError = ("true").equals(ElementParameterParser.getValue(node,"__DIE_ON_ERROR__"));
    
    String dataModel = ElementParameterParser.getValue(node, "__CONCEPT__");
    List<Map<String,String>> keyValues = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__KEYS__");
    
    boolean useMultConditions = ("true").equals(ElementParameterParser.getValue(node, "__USE_ITEMS__"));
    List<Map<String, String>> operations = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__OPERATIONS__");
    String spellThrehold = ElementParameterParser.getValue(node, "__SPELLTHREHOLD__");
    
    boolean isStaging = "STAGING".equalsIgnoreCase(ElementParameterParser.getValue(node, "__CONTAINER_TYPE__"));
    boolean withReport = ("true").equals(ElementParameterParser.getValue(node,"__WITHREPORT__"));
    String sourceName = ElementParameterParser.getValue(node,"__SOURCE__");
    String needCheck = ElementParameterParser.getValue(node,"__ISINVOKE__");

    if(spellThrehold==null || ("").equals(spellThrehold)){
    	spellThrehold = "0";
    } 
    List<IMetadataTable> metadatas = node.getMetadataList();
    if ((metadatas!=null)&&(metadatas.size()>0)) {//1
        IMetadataTable metadata = metadatas.get(0);
        if (metadata!=null) {//2
    
        	List< ? extends IConnection> conns = node.getIncomingConnections();
        	for (IConnection conn : conns) {//3
        		if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {//4
        			if(!useMultConditions){//5

    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    
			    for(int i=0;i<keyValues.size();i++){
			    	String columnName=keyValues.get(i).get("KEY");

    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_44);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(columnName );
    stringBuffer.append(TEXT_46);
    
}

    stringBuffer.append(TEXT_47);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_48);
    stringBuffer.append(dataModel );
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    
	if(isDropItem){
	
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_53);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_54);
    stringBuffer.append(partPath );
    stringBuffer.append(TEXT_55);
    
	}else{
	
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_57);
    
	}
	
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_59);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_60);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_61);
    
	if (!isStaging && withReport) {
	
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_64);
    stringBuffer.append(sourceName);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_66);
    stringBuffer.append(needCheck);
    stringBuffer.append(TEXT_67);
    
	}
	if(isDropItem){
	
    stringBuffer.append(TEXT_68);
     logUtil.debug("\"Dropping item: \"", logUtil.var("item"),"\".\"");
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_71);
    
	}else{
	
    stringBuffer.append(TEXT_72);
     logUtil.debug("\"Deleting item: \"", logUtil.var("item"),"\".\"");
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_74);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    
    }
    
    stringBuffer.append(TEXT_76);
    
if(dieOnError){

    stringBuffer.append(TEXT_77);
     logUtil.error("\"Die on error:\"+e.getMessage()");
    stringBuffer.append(TEXT_78);
    
}else{

    stringBuffer.append(TEXT_79);
    
}

    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_81);
    
				}
    		}//4
    	}//3
    }//2
}//1

    
	if(useMultConditions){

    stringBuffer.append(TEXT_82);
     logUtil.debug("\"Use multi condition to delete records.\"");
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_85);
    
		boolean isOnlyOrPredicate=true;
		for(int i=0; i < operations.size(); i++){
			Map<String, String> map= operations.get(i);
			String xpath=map.get("XPATH");
			String operator=map.get("FUNCTION");
			String value = map.get("VALUE");
			String predicate = map.get("PREDICATE");
			if((i < operations.size()-1) && (!"OR".equals(predicate))){
				isOnlyOrPredicate = false;
			}

    stringBuffer.append(TEXT_86);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_87);
    stringBuffer.append(xpath );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(operator );
    stringBuffer.append(TEXT_89);
    stringBuffer.append("EMPTY_NULL".equals(operator)? null:value );
    stringBuffer.append(TEXT_90);
    stringBuffer.append(predicate );
    stringBuffer.append(TEXT_91);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_92);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_93);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_97);
    
		}//for

    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_99);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_100);
    
		   if(!isOnlyOrPredicate){

    stringBuffer.append(TEXT_101);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_102);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_103);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_105);
    
		}else{

    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    
		}

    stringBuffer.append(TEXT_111);
     logUtil.debug("\"Deleting records.\"");
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    stringBuffer.append(dataModel );
    stringBuffer.append(TEXT_114);
    stringBuffer.append(spellThrehold);
    stringBuffer.append(TEXT_115);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_116);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_119);
     logUtil.error("\"Unexpected error:\"+e.getMessage()");
    
		if(dieOnError){

    stringBuffer.append(TEXT_120);
    
		}else{

    stringBuffer.append(TEXT_121);
    
		}

    stringBuffer.append(TEXT_122);
    
	}

    return stringBuffer.toString();
  }
}
