package org.talend.designer.codegen.translators.bigdata.marklogic;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;

public class TMarkLogicCloseMainJava
{
  protected static String nl;
  public static synchronized TMarkLogicCloseMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TMarkLogicCloseMainJava result = new TMarkLogicCloseMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "    com.marklogic.client.DatabaseClient conn_";
  protected final String TEXT_3 = " = (com.marklogic.client.DatabaseClient)globalMap.get(\"";
  protected final String TEXT_4 = "\");" + NL + "    if(conn_";
  protected final String TEXT_5 = " != null){" + NL + "        conn_";
  protected final String TEXT_6 = ".release();" + NL + "    }";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
    INode node = (INode)codeGenArgument.getArgument();
    String cid = node.getUniqueName();

    String connection = ElementParameterParser.getValue(node,"__CONNECTION__");
    String conn = "conn_" + connection;

    stringBuffer.append(TEXT_2);
    stringBuffer.append( cid );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(conn);
    stringBuffer.append(TEXT_4);
    stringBuffer.append( cid );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( cid );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
