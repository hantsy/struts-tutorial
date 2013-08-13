<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registeration Successfully...</title>
    </head>
    <body>
        <h1>Registeration Successfully...</h1>
        <div>Thank you for registeration , <bean:write name="username"/> , your password is :
            <bean:write name="password"/>
        </div>
        <div><html:link forward="newLogon">Logon Now...</html:link></div>
    </body>
</html>
