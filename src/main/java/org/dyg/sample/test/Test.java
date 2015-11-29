/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-15 
 * 
 *******************************************************************************/
package org.dyg.sample.test;

import org.dyg.sample.service.SampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <pre>
 * 业务名:
 * 功能说明: 
 * 编写日期:	2014-7-15
 * 作者:	duyangang
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：
 * </pre>
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		SampleService sampleService = (SampleService) context
				.getBean("sampleService");
		System.out.println(sampleService.get(1));
	}
}
