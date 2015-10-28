/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diego.supplierejb;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggerInterceptor {
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
       try{
           System.out.println("Entering:"+ic.getTarget().getClass().getSimpleName()+", method:"+ic.getMethod().getName());
           return ic.proceed();
       }catch(Exception e){
           System.err.println("Errore nel metodo:"+e.getMessage());
       }finally{
           System.out.println("Exiting:"+ic.getTarget().getClass().getSimpleName()+", method:"+ic.getMethod().getName());
       }
       return ic.getTarget();
    }

}
