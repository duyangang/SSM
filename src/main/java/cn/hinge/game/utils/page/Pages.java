/*******************************************************************************
 * Copyright (c) 2014 by baidu Software Corporation all right reserved.
 * 2014-7-16 
 * 
 *******************************************************************************/
package cn.hinge.game.utils.page;

/**
 * <pre>
 * 业务名: 分页对象
 * 功能说明: 分页过程中始终使用Pages这个对象对分页的数据进行操作
 * 编写日期:	2014-7-16
 * 作者:	duyangang
 * 
 * 历史记录
 * 1、修改日期：
 *    修改人：
 *    修改内容：
 * </pre>
 */
public class Pages {
	/**
	 * 当前页
	 */
	private int curPage = 1;

	/**
	 * 总页数
	 */
	private int totalPages;

	/**
	 * 每页显示条数
	 */
	private int preSize = 5;

	/**
	 * 首记录(mySql第一条数据默认从0开始索引 )
	 */
	private int firstRecord = 0;

	/**
	 * 总条数
	 */
	private int totalCount;

	/**
	 * 分页数据
	 */
	private Object pageInfo;

	/**
	 * 方法说明：获得当前页
	 * 
	 * @return
	 */
	public int getCurPage() {
		if (curPage < 0) {
			curPage = 0;
		} else if (curPage >= totalPages) {
			curPage = totalPages;
		}
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	/**
	 * 方法说明：获得首记录数
	 * 
	 * @return
	 */
	public int getFirstRecord() {
		return (curPage - 1) * preSize;
	}

	public void setFirstRecord(int firstRecord) {
		this.firstRecord = firstRecord;
	}

	/**
	 * 方法说明：获得总页数
	 * 
	 * @return
	 */
	public int getTotalPage() {
		return (int) Math.ceil(Double.valueOf(totalCount / preSize));
	}

	public void setTotalPage(int totalPage) {
		this.totalPages = totalPage;
	}

	/**
	 * 方法说明：获得每页条数
	 * 
	 * @return
	 */
	public int getPreSize() {
		return preSize;
	}

	public void setPreSize(int preSize) {
		this.preSize = preSize;
	}

	/**
	 * 方法说明：获得总条数
	 * 
	 * @return
	 */
	public int getTotalCount() {
		return totalCount < 0 ? 0 : totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}
