/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.studentiejb;

import java.util.logging.Logger;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggerInterceptor {
    
   //@Inject @Default
   //private Logger logger;
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
        System.out.println(ic.getTarget().getClass().getName()+" "+ic.getMethod().getName());
        try{
             return ic.proceed();
        }finally{
            System.out.println(ic.getTarget().getClass().getName()+" "+ic.getMethod().getName());
        }
    }

}
