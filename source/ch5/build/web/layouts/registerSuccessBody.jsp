<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<h1>Registeration Successfully...</h1>
<div>Thank you for registeration , <bean:write name="username"/> , your password is :
    <bean:write name="password"/>
    Gender value is #
    <bean:write name="gender"/>
    Is agree to public#<bean:write name="agreeToPublic"/>
</div>
<div><html:link forward="newLogon">Logon Now...</html:link></div>

