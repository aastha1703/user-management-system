package com.example.ing.usermanagementsystem.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<User> data;
    private Support support;

    public static class Support {
        private String url;
        private String text;
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
    }

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPer_page() {
		return per_page;
	}

	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}
}