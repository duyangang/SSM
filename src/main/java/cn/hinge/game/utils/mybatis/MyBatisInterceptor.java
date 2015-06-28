package cn.hinge.game.utils.mybatis;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;


@Intercepts(@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}))
public class MyBatisInterceptor implements Interceptor{

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		invocation.proceed();
		System.out.println("===intercept");
		return null;
	}

	@Override
	public Object plugin(Object target) {
		Plugin.wrap(target, this); 
		System.out.println("===plugin");
		return null;
	}

	@Override
	public void setProperties(Properties properties) {
		System.out.println("===setProperties");
	}

}
