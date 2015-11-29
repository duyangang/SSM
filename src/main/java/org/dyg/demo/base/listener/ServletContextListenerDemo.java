package org.dyg.demo.base.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author dyg
 * 
 *         当程序再启动的时候想执行些操作（一般都是初始化资源）或者在程序结束的时候结束的时候释放一些资源的时候
 *         可以考虑使用ServletContextListener
 * 
 * 
 *
 */
public class ServletContextListenerDemo implements ServletContextListener {

	/**
	 * 当Servlet 容器终止Web 应用时调用该方法。在调用该方法之前，容器会先销毁所有的Servlet 和Filter 过滤器
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// 程序结束时执行
		System.out.println("=============ServletContextListener 程序结束时执行。。。。。。");

	}

	/**
	 * 当Servlet 容器启动Web 应用时调用该方法。在调用完该方法之后，容器再对Filter 初始化，并且对那些在Web
	 * 应用启动时就需要被初始化的Servlet 进行初始化。
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 程序启动执行
		sce.getServletContext().setAttribute("ctx", sce.getServletContext().getContextPath());
		System.out.println("==========ServletContextListener 程序启动执行。。。。。。");
	}

}
