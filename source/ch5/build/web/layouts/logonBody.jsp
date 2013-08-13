<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<h1>Logon Page</h1>
<div id="error">
    <html:messages id="message" message="false" header="errors.header" footer="errors.footer">
        <li><bean:write name="message"/>
    </html:messages>  
</div>
<div>
    <html:form action="/logon.do" method="post">
        <div><label><bean:message key="label.userForm.username"/></label><html:text property="username"/></div>
        <div><label><bean:message key="label.userForm.password"/></label><html:password property="password"/></div>
        <div><html:submit value="Logon"/><html:reset value="Reset"/>
        <html:link forward="newRegister">Register Now...</html:link></div>
    </html:form>
</div>

