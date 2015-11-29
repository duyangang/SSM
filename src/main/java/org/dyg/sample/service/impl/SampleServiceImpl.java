/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-15 
 * 
 *******************************************************************************/
package org.dyg.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dyg.sample.dao.SampleMapper;
import org.dyg.sample.model.Sample;
import org.dyg.sample.model.SampleExample;
import org.dyg.sample.service.SampleService;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

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
@Service
public class SampleServiceImpl implements SampleService {
	@Resource
	private SampleMapper sampleMapper;

	@Override
	public Sample get(int id) {
		return sampleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List getByCondition(SampleExample example,Page page) {
		PageHelper.startPage(page.getPageNum(), page.getPageSize());
		
		List list = sampleMapper.selectByExample(example);
		return list;
	}

	@Override
	public void del(int id) {
		sampleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void add(Sample model) {
		sampleMapper.insert(model);
	}

	@Override
	public void update(Sample model,SampleExample example) {
		sampleMapper.updateByExample(model, example);
	}

}
