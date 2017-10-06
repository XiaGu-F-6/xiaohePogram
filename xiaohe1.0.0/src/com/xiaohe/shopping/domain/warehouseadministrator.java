package com.xiaohe.shopping.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 仓库管理员实体
 */
public class warehouseadministrator {
						private Integer warehouseadministratorId  ;
						private String wha_name;
						private Integer wha_phone ;
						private Integer wha_age;
						/**仓库管理员管理的仓库ID
						 */
						private Integer warehouseId ;
						
						private Set<warehouseadministrator> warehouseadministrator=new HashSet<warehouseadministrator>();
						public Integer getWarehouseId() {
							return warehouseId;
						}
						public void setWarehouseId(Integer warehouseId) {
							this.warehouseId = warehouseId;
						}
						public Integer getWarehouseadministratorId() {
							return warehouseadministratorId;
						}
						public void setWarehouseadministratorId(Integer warehouseadministratorId) {
							this.warehouseadministratorId = warehouseadministratorId;
						}
						public String getWha_name() {
							return wha_name;
						}
						public void setWha_name(String wha_name) {
							this.wha_name = wha_name;
						}
						public Integer getWha_phone() {
							return wha_phone;
						}
						public void setWha_phone(Integer wha_phone) {
							this.wha_phone = wha_phone;
						}
						public Integer getWha_age() {
							return wha_age;
						}
						public void setWha_age(Integer wha_age) {
							this.wha_age = wha_age;
						}
}
