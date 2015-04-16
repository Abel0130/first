/**
 * 
 */
package com.fuiou;

import java.io.Serializable;
import java.util.Date;

/**
 * @project fuIstreet (富友智慧街二期)
 * @description 论坛板块,论坛文章表
 * @author lizhensh
 * @creation 2014-5-26
 * @email lizhensh@fuiou.com
 * @version 1.1.0
 */
public class IsAwardBean implements Serializable{
	
	private static final long serialVersionUID = -4412537488813699799L;
	
	private String id;						//活动Id
	private String operatorId;				//运营商Id
	private String streetId;				//街区Id
	private String shopId;					//店铺Id
	private String nameCn;					//店铺Id
	private String nameEn;					//店铺Id
	private Date startTm;					//店铺Id
	private Date endTm;						//店铺Id
	private String awardUrl;				//活动Url
	private String imgUrl;					//活动图片Url
	private String awardSt;					//活动状态
	private int attendAm;					//参与人数
	private String reserve1;				//预留字段
	private String reserve2;				//预留字段
	private String reserve3;				//预留字段
	private String creator;					//创建人
	private Date createTm;					//创建时间
	private String createIp;				//创建IP
	private String updater;					//更改人
	private Date updateTm;					//更改时间
	private String updateIp;				//更改IP
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getStreetId() {
		return streetId;
	}
	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getNameCn() {
		return nameCn;
	}
	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public Date getStartTm() {
		return startTm;
	}
	public void setStartTm(Date startTm) {
		this.startTm = startTm;
	}
	public Date getEndTm() {
		return endTm;
	}
	public void setEndTm(Date endTm) {
		this.endTm = endTm;
	}
	public String getAwardUrl() {
		return awardUrl;
	}
	public void setAwardUrl(String awardUrl) {
		this.awardUrl = awardUrl;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getAwardSt() {
		return awardSt;
	}
	public void setAwardSt(String awardSt) {
		this.awardSt = awardSt;
	}
	public int getAttendAm() {
		return attendAm;
	}
	public void setAttendAm(int attendAm) {
		this.attendAm = attendAm;
	}
	public String getReserve1() {
		return reserve1;
	}
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	public String getReserve2() {
		return reserve2;
	}
	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}
	public String getReserve3() {
		return reserve3;
	}
	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateTm() {
		return createTm;
	}
	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public Date getUpdateTm() {
		return updateTm;
	}
	public void setUpdateTm(Date updateTm) {
		this.updateTm = updateTm;
	}
	public String getUpdateIp() {
		return updateIp;
	}
	public void setUpdateIp(String updateIp) {
		this.updateIp = updateIp;
	}
	
}
