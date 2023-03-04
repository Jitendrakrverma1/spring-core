package com.springcore.spel;
import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test
{
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/stereoconfig.xml");
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		
		
		/*
		 * SpelExpressionParser p1 = new SpelExpressionParser();
		 * org.springframework.expression.Expression expression=
		 * p1.parseExpression("22+44"); System.out.println(expression.getValue());
		 */
		
		
		
		
	}
}
