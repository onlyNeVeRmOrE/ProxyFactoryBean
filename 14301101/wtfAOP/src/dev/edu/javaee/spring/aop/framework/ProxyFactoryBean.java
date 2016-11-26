package dev.edu.javaee.spring.aop.framework;

import dev.edu.javaee.spring.aop.Advice;
import dev.edu.javaee.spring.aop.Advisor;
import dev.edu.javaee.spring.aop.framework.AdvisedSupport;
import dev.edu.javaee.spring.aop.framework.JdkDynamicAopProxy;



public class ProxyFactoryBean {
	
    private Object target;//对谁增强
	
	private String proxyInterfaces;//接口

    private Advisor interceptorNames;//切面  把pointcut与advice结合
    
    private AdvisedSupport AS = new AdvisedSupport();//AdvisedSupport
    
    //private JdkDynamicAopProxy fuck = new JdkDynamicAopProxy(AS);
	
	public String getProxyInterfaces() {
		return proxyInterfaces;
	}
	public void setProxyInterfaces(String proxyInterfaces) {
		this.proxyInterfaces = proxyInterfaces;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	
	public Advisor getInterceptorNames() {
		return interceptorNames;
	}
	public void setInterceptorNames(Advisor advisor) {
		this.interceptorNames = advisor;
	}
	public Object getProxy() {
		
		AS.setAdvisor(interceptorNames);
        Class<?>[] interfaces = target.getClass().getInterfaces();
        
        for(int i = 0 ; i <target.getClass().getInterfaces().length;i++){
        		AS.setInterfaces(interfaces[i]);
        }
       
        AS.setInterfaces(target.getClass().getInterfaces()[0]);
        AS.setTarget(target);	
        
        return new JdkDynamicAopProxy(AS).getProxy();
	}
	
	

}
