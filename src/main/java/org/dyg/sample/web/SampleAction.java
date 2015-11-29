/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-15 
 * 
 *******************************************************************************/
package org.dyg.sample.web;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.apache.struts2.ServletActionContext;
import org.dyg.sample.model.Sample;
import org.dyg.sample.model.SampleExample;
import org.dyg.sample.service.SampleService;
import org.dyg.utils.base.action.BaseAction;
import org.dyg.utils.poi.ExportExcel;

import com.github.pagehelper.Page;
import com.opensymphony.xwork2.ActionContext;

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
@Controller
@Scope("prototype")
public class SampleAction extends BaseAction {
	@Resource
	private SampleService sampleService;
	private Sample model;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sample getModel() {
		return model;
	}

	public void setModel(Sample model) {
		this.model = model;
	}

	@Override
	public String execute() throws Exception {
		ActionContext.getContext().put("message", "what a big suprise!");
		System.out.print("name==" + name);
		return null;
	}

	/**
	 * 方法说明：前往列表页
	 * 
	 * @return
	 */
	public String toIndex() {
		@SuppressWarnings("unchecked")
		String currPage = request.getParameter("curPage");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		Page<Sample> page = new Page<Sample>(StringUtils.isNotBlank(currPage) ? Integer.valueOf(currPage) : 1, 2);
		SampleExample example = new SampleExample();
		if (StringUtils.isNotBlank(id)) {
			example.createCriteria().andIdEqualTo(Integer.valueOf(id));
		}
		if (StringUtils.isNotBlank(name)) {
			example.createCriteria().andNameEqualTo(name);
		}
		List<Sample> result = sampleService.getByCondition(example, page);
		ActionContext.getContext().put("list", result);
		request.setAttribute("pageNum", page.getPageNum());
		request.setAttribute("pages", page.getPages());
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		return "toIndex";
	}

	/**
	 * 导出Excel文件
	 */
	public void exportExcel() {
		File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg");
		Page<Sample> page = new Page<Sample>(1, 2);
		SampleExample example = new SampleExample();
		List<Sample> dataset = sampleService.getByCondition(example, page);
		response.setContentType("octets/stream");
		response.addHeader("Content-Disposition", "attachment;filename=test.xls");
		ExportExcel<Sample> ex = new ExportExcel<Sample>();
		String[] headers = { "Id", "名字", "年龄" };
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			byte[] buf = new byte[bis.available()];
			while ((bis.read(buf)) != -1) {
				// 将图片数据存放到缓冲数组中
			}
			OutputStream out = response.getOutputStream();
			ex.exportExcel(headers, dataset, out);
			out.close();
			System.out.println("excel导出成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 方法说明：删除
	 * 
	 * @return
	 */
	public String del() {
		sampleService.del(this.model.getId());
		return "redIndex";
	}

	public String toAdd() {
		return "toAdd";
	}

	public String toUpdate() {
		model = sampleService.get(model.getId());
		return "toUpdate";
	}

	public String saveOrUpdate() {
		if (model.getId() == 0) {
			// 增加
			sampleService.add(model);
		} else {
			// 修改
			sampleService.update(model, new SampleExample());
		}
		return "redIndex";
	}

	public String writeMsg() throws IOException {
		System.out.println("nihao,shjie!");
		response.getWriter().write("{\"msg\":123}");
		return null;
	}

	public String freemarkerTest() {
		HttpServletRequest request = ServletActionContext.getRequest();

		return "fmTest";
	}
}
