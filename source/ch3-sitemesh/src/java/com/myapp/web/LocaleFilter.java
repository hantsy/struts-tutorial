/*
 *$Id:$
 * LocaleFilter.java
 * Created on 
 */

package com.myapp.web;

import java.io.*;
import java.util.Locale;
import javax.servlet.http.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.struts.Globals;

/**
 *
 * @author  hantsy
 * @version
 */

public class LocaleFilter implements Filter {
    private String defaultLocale;
    public void init(FilterConfig filterConfig) throws ServletException {
        defaultLocale = filterConfig.getInitParameter("defaultLocale");
        System.out.println("set default locale init parameter #"+defaultLocale);
    }
    
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("....................enter LocaleFilter::doFilter().....................");
        HttpServletRequest request =(HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        
        Locale localeInSession =(Locale)request.getSession().getAttribute(Globals.LOCALE_KEY);
        System.out.println("locale in session #"+localeInSession);
        
        String localeString = request.getParameter("locale");
        System.out.println("set locale to #"+localeString);
        if(localeString!=null&&!"".equals(localeString)){
            try {
                request.getSession().setAttribute(Globals.LOCALE_KEY,setLocale(localeString));
            } catch(Exception e) {
                System.err.println("set locale error#"+e);
                if(localeInSession!=null&&defaultLocale!=null){
                    request.getSession().setAttribute(Globals.LOCALE_KEY,setLocale(defaultLocale));
                }
            }
        }
        filterChain.doFilter(request, response);
    }
    
    public void destroy() {
    }
    
    private Locale setLocale(String locale){
        String[] localeArrays=locale.split("_");
        if(localeArrays.length==1){
            return new Locale(localeArrays[0]);
        }else if (localeArrays.length==2){
            return new Locale(localeArrays[0],localeArrays[1]);
        }else if (localeArrays.length==3){
            return new Locale(localeArrays[0],localeArrays[1],localeArrays[2]);
        }
        return new Locale(locale);
    }
    
    
}


