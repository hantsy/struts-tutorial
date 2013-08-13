/*
 * RegisterAction.java
 *
 * Created on May 15, 2007, 11:11 PM
 */
package com.myapp.web;

import com.myapp.domain.DummyUserManagerImpl;
import com.myapp.domain.User;
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
public class RegisterAction extends Action {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm registerationForm = (UserForm) form;
        ActionMessages errors = new ActionMessages();


        String username = registerationForm.getUsername();
        String password = registerationForm.getPassword();
        String confirmPasswod = registerationForm.getConfirmPassword();
        String email = registerationForm.getEmail();
        if (!password.equals(confirmPasswod)) {
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("error.password.mismatch"));
            saveErrors(request, errors);
            return mapping.getInputForward();
        }

        UserManager mgr = new DummyUserManagerImpl();
        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        try {
            mgr.registerUser(user);
        } catch (Exception e) {
            errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("error.register.failed"));
            saveErrors(request, errors);
            return mapping.getInputForward();
        }


        request.setAttribute("username", username);
        request.setAttribute("password", password);
        return mapping.findForward(SUCCESS);

    }
}
