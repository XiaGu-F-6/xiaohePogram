package com.xiaohe.shopping.domain;

import java.util.HashSet;
import java.util.Set;

/**
 *仓库的实体
 */
public class warehouse {
	  		private Integer warehouseId ;
	  		private String wh_num;
	  		private String wh_place ;
	  		private Integer wh_name;
	  		private Integer wh_size;
	  		private Integer wh_input;
	  		private Integer wh_surplus;
	  		private Integer wh_output;
	  		/**管理仓库的管理员ID
	  		 */
	  		private Integer warehouseadministratorId  ;
	  		/**
	  		 * 仓库的集合
	  		 */
	  		private Set<warehouse> warehouses=new HashSet<warehouse>();
			public Integer getWarehouseId() {
				return warehouseId;
			}
			public void setWarehouseId(Integer warehouseId) {
				this.warehouseId = warehouseId;
			}
			public String getWh_num() {
				return wh_num;
			}
			public void setWh_num(String wh_num) {
				this.wh_num = wh_num;
			}
			public String getWh_place() {
				return wh_place;
			}
			public void setWh_place(String wh_place) {
				this.wh_place = wh_place;
			}
			public Integer getWh_name() {
				return wh_name;
			}
			public void setWh_name(Integer wh_name) {
				this.wh_name = wh_name;
			}
			public Integer getWh_size() {
				return wh_size;
			}
			public void setWh_size(Integer wh_size) {
				this.wh_size = wh_size;
			}
			public Integer getWh_input() {
				return wh_input;
			}
			public void setWh_input(Integer wh_input) {
				this.wh_input = wh_input;
			}
			public Integer getWh_surplus() {
				return wh_surplus;
			}
			public void setWh_surplus(Integer wh_surplus) {
				this.wh_surplus = wh_surplus;
			}
			public Integer getWh_output() {
				return wh_output;
			}
			public void setWh_output(Integer wh_output) {
				this.wh_output = wh_output;
			}
			public Integer getWarehouseadministratorId() {
				return warehouseadministratorId;
			}
			public void setWarehouseadministratorId(Integer warehouseadministratorId) {
				this.warehouseadministratorId = warehouseadministratorId;
			}

	  		
}
