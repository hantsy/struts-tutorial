<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
    <head><title>HomePage </title></head>
    <body>
        Welcome,
        <logic:notPresent name="username" scope="session">
            Guest !<html:link forward="newLogon">Logon </html:link> or 
            <html:link forward="newRegister">Register Now...</html:link>
        </logic:notPresent>
        <logic:present name="username" scope="session">
            <bean:write name="username" scope="session"/>, 
            <html:link forward="logout">Log Out..</html:link>
        </logic:present>
    </body>
</html>