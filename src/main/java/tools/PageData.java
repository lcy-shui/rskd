package tools;

import java.util.List;

public class PageData<T> {

	private List<T> data;// 存储的分页的数据 ,List<NewsType> List<News> List<Users>
	private int page;// 当前页
	private int totalCount;// 总记录数    91 
	private int pageSize;// 每页的记录数   10 
	private int totalPage;// 总页数     总页数   ？

	public PageData() {
		// TODO Auto-generated constructor stub
	}

	public PageData(List<T> data, int page, int totalCount, int pageSize) {
		super();
		this.data = data;
		this.page = page;
		this.totalCount = totalCount;
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 总页数判断
	 * 
	 * @return
	 */
	public int getTotalPage() {
		// 这里得到总页数?
		int total = 0;

		// 注意执行这个方法之前确保我们的 totalCount有值
		if (totalCount % pageSize == 0) {  //91%10 ==0
			total = totalCount / pageSize;
		} else {
			total = totalCount / pageSize + 1;
		}
		return total;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}