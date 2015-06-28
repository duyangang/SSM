/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-15 
 * 
 *******************************************************************************/
package cn.hinge.game.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.hinge.game.sample.dao.SampleMapper;
import cn.hinge.game.sample.model.Sample;
import cn.hinge.game.sample.model.SampleExample;
import cn.hinge.game.sample.service.SampleService;

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