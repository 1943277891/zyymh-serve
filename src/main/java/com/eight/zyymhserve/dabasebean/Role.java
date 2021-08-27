package com.eight.zyymhserve.dabasebean;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-27 11:42:58
 * @Version 1.0
 */
public class Role {
	// 自增id
	private Long itemID;
	// 唯一标识UUID
	private String itemCode;
	// 角色名称
	private String ROLE_NAME;
	// 角色说明
	private String ROLE_DESCRIPTION;
	// 应用id
	private String APP_CODE;
	// 类型（0：普通，1：管理员）
	private Integer ROLE_TYPE;
	// CREATER ：
	private String CREATER;
	// itemCreateAt ：
	private Timestamp itemCreateAt;
	// UPDATER ：
	private String UPDATER;
	// itemUpdateAt ：
	private Timestamp itemUpdateAt;

	// 无参构造器
	public Role() {
	}

	// 有参构造器，进行属性值的初始化
	public Role(Long itemID, String itemCode, String ROLE_NAME, String ROLE_DESCRIPTION, String APP_CODE, Integer ROLE_TYPE, String CREATER, Timestamp itemCreateAt, String UPDATER, Timestamp itemUpdateAt) {
		this.itemID = itemID;
		this.itemCode = itemCode;
		this.ROLE_NAME = ROLE_NAME;
		this.ROLE_DESCRIPTION = ROLE_DESCRIPTION;
		this.APP_CODE = APP_CODE;
		this.ROLE_TYPE = ROLE_TYPE;
		this.CREATER = CREATER;
		this.itemCreateAt = itemCreateAt;
		this.UPDATER = UPDATER;
		this.itemUpdateAt = itemUpdateAt;
	}

	// 获取 自增id 的属性值
	public Long getItemID() {
		return itemID;
	}

	// 设置 自增id 的属性值
	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	// 获取 唯一标识UUID 的属性值
	public String getItemCode() {
		return itemCode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	// 获取 角色名称 的属性值
	public String getROLE_NAME() {
		return ROLE_NAME;
	}

	// 设置 角色名称 的属性值
	public void setROLE_NAME(String ROLE_NAME) {
		this.ROLE_NAME = ROLE_NAME;
	}

	// 获取 角色说明 的属性值
	public String getROLE_DESCRIPTION() {
		return ROLE_DESCRIPTION;
	}

	// 设置 角色说明 的属性值
	public void setROLE_DESCRIPTION(String ROLE_DESCRIPTION) {
		this.ROLE_DESCRIPTION = ROLE_DESCRIPTION;
	}

	// 获取 应用id 的属性值
	public String getAPP_CODE() {
		return APP_CODE;
	}

	// 设置 应用id 的属性值
	public void setAPP_CODE(String APP_CODE) {
		this.APP_CODE = APP_CODE;
	}

	// 获取 类型（0：普通，1：管理员） 的属性值
	public Integer getROLE_TYPE() {
		return ROLE_TYPE;
	}

	// 设置 类型（0：普通，1：管理员） 的属性值
	public void setROLE_TYPE(Integer ROLE_TYPE) {
		this.ROLE_TYPE = ROLE_TYPE;
	}

	// 获取 CREATER 的属性值
	public String getCREATER() {
		return CREATER;
	}

	// 设置 CREATER 的属性值
	public void setCREATER(String CREATER) {
		this.CREATER = CREATER;
	}

	// 获取 itemCreateAt 的属性值
	public Timestamp getItemCreateAt() {
		return itemCreateAt;
	}

	// 设置 itemCreateAt 的属性值
	public void setItemCreateAt(Timestamp itemCreateAt) {
		this.itemCreateAt = itemCreateAt;
	}

	// 获取 UPDATER 的属性值
	public String getUPDATER() {
		return UPDATER;
	}

	// 设置 UPDATER 的属性值
	public void setUPDATER(String UPDATER) {
		this.UPDATER = UPDATER;
	}

	// 获取 itemUpdateAt 的属性值
	public Timestamp getItemUpdateAt() {
		return itemUpdateAt;
	}

	// 设置 itemUpdateAt 的属性值
	public void setItemUpdateAt(Timestamp itemUpdateAt) {
		this.itemUpdateAt = itemUpdateAt;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Role {" + 
				", itemID='" + itemID + '\'' + 
				", itemCode='" + itemCode + '\'' + 
				", ROLE_NAME='" + ROLE_NAME + '\'' + 
				", ROLE_DESCRIPTION='" + ROLE_DESCRIPTION + '\'' + 
				", APP_CODE='" + APP_CODE + '\'' + 
				", ROLE_TYPE='" + ROLE_TYPE + '\'' + 
				", CREATER='" + CREATER + '\'' + 
				", itemCreateAt='" + itemCreateAt + '\'' + 
				", UPDATER='" + UPDATER + '\'' + 
				", itemUpdateAt='" + itemUpdateAt + '\'' + 
				"}";
	}
}