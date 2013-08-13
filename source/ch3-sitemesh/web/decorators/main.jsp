<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<html>
    <head>
        <title>Demo-<decorator:title default="Struts Sitemesh Demo..." /></title>
        <!--link href="<%= request.getContextPath() %>/decorators/main.css" rel="stylesheet" type="text/css"-->
        <decorator:head />
    </head>
    
    <body>
        <div>
            <table width="100%">
                <tr>
                    <td id="pageTitle">
                        <h1> <decorator:title /></h1>
                    </td>
                </tr>
                <tr>
                    <td valign="top" height="100%">
                        <decorator:body />
                    </td>
                </tr>
                <tr>
                    <td id="footer">
                        <page:applyDecorator page="/footer.html" name="panel" />
                    </td>
                </tr>
            </table>
        </div>
        
    </body>
</html>