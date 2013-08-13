<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registeration Page</title>
    </head>
    <body>
        
        
        
        <div id="error">
            <html:messages id="message" message="false" header="errors.header" footer="errors.footer">
                <li><bean:write name="message"/>
            </html:messages>  
        </div>
        
        <div>
            <html:form action="/register.do" method="post">
                <div><label>Username</label><html:text property="username"/></div>
                <div><label>Password</label><html:password property="password"/></div>
                <div><label>Confirm Password</label><html:password property="confirmPassword"/></div>
                <div><label>Email</label><html:text property="email"/></div>         
                <div><html:submit value="Save"/> <html:reset value="Reset"/></div>
            </html:form>
        </div>
        <html:javascript formName="UserForm"
                         dynamicJavascript="true"
                         staticJavascript="false"/>
        <script language="Javascript1.1"  src="<html:rewrite page="/staticJavascript.jsp" />"/>
    </body>
</html>
