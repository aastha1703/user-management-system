package com.example.ing.usermanagementsystem.entity;

import org.springframework.stereotype.Component;

@Component
public class SingleUserResponse {
    private User data;
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

	public User getData() {
		return data;
	}

	public void setData(User data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}
}
