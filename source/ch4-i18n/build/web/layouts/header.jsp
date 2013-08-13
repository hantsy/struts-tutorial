<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<div><h1>Struts Demo Application</h1></div>
<div><html:link action="/locale.do?language=zh&country=CN"><bean:message key="lang.chinese"/></html:link>|<html:link action="/locale.do?language=en&country=US"><bean:message key="lang.english"/></html:link></div>