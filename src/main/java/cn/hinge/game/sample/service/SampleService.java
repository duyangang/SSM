/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-15 
 * 
 *******************************************************************************/
package cn.hinge.game.sample.service;

import java.util.List;

import com.github.pagehelper.Page;

import cn.hinge.game.sample.model.Sample;
import cn.hinge.game.sample.model.SampleExample;

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
public interface SampleService {
	public Sample get(int id);

	public List getByCondition(SampleExample example,Page page);

	/**
	 * 方法说明：删除单条记录
	 * 
	 * @param id
	 */
	public void del(int id);

	/**
	 * 方法说明：增加
	 * 
	 * @param model
	 */
	public void add(Sample model);

	/**
	 * 方法说明：
	 * 
	 * @param model
	 */
	public void update(Sample model,SampleExample example);
}
