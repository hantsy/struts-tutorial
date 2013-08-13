/*
 * LogonAction.java
 *
 * Created on May 15, 2007, 10:15 PM
 */

package com.myapp.web;

import com.myapp.domain.UserManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
/**
 *
 * @author hantsy
 * @version
 */

public class LogonAction extends Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "index";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm  form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        System.out.println("enter LogonAction...");
        UserForm logonForm=(UserForm)form;
        String username=logonForm.getUsername();
        String password=logonForm.getPassword();
        System.out.println("username is #"+username);
        System.out.println("password is #"+password);
        
        ActionMessages errors=new ActionMessages();
        
        UserManager mgr=new UserManager(); 
        if(!mgr.authenticateUser(username,password)){
            System.out.println("authication failed!");
            errors.add(ActionMessages.GLOBAL_MESSAGE,new ActionMessage("error.authenticated.failed"));
            saveErrors(request,errors);
            return mapping.getInputForward();       
        }
        
        
        request.getSession().setAttribute("username",username);
        return mapping.findForward(SUCCESS);
        
    }
}
