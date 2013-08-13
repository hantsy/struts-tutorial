<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logon Page</title>
    </head>
    <body>

        <div id="error">
            <html:messages id="message" message="false" header="errors.header" footer="errors.footer">
                <li><bean:write name="message"/>
            </html:messages>  
        </div>
        <div>
            <html:form action="/logon.do" method="post">
                <div><label>Username</label><html:text property="username"/></div>
                <div><label>Password</label><html:password property="password"/></div>
                <div><html:submit value="Logon"/><html:reset value="Reset"/>
                <html:link forward="newRegister">Register Now...</html:link></div>
            </html:form>
        </div>
        
    </body>
</html>
