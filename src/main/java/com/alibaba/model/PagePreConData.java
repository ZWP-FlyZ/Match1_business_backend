package com.alibaba.model;

import java.util.List;

public class PagePreConData {
		private int id;
		private String name;
		private List<ItemData> value;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<ItemData> getValue() {
			return value;
		}
		public void setValue(List<ItemData> value) {
			this.value = value;
		}
		
}
