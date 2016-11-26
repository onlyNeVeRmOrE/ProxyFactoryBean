package dev.edu.javaee.spring.aop.support;

import java.util.List;

import dev.edu.javaee.spring.aop.Advice;
import dev.edu.javaee.spring.aop.ClassFilter;
import dev.edu.javaee.spring.aop.Pointcut;

public class NameMatchMethodPointcutAdvisor extends AbstractPointcutAdvisor{

	private final NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
	private List<String> mappedNames;
	private Advice advice;
	@Override
	
	public Pointcut getPointcut() {
		return this.pointcut;
	}

	public void setClassFilter(ClassFilter classFilter) {
		this.pointcut.setClassFilter(classFilter);
	}
	
	/*public void setMappedName(String mappedName) {
		this.pointcut.setMappedName(mappedName);
	}
	*/
	public void setMappedNames( List<String> names) {
		this.pointcut.setMappedNames(names);
	}
}
