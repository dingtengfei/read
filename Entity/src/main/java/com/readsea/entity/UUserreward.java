package com.readsea.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChaiRZ
 * @since 2019-03-25
 */
@TableName("u_userreward")
public class UUserreward extends Model<UUserreward> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer uid;
	private Integer bid;
	private Integer readcoins;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getReadcoins() {
		return readcoins;
	}

	public void setReadcoins(Integer readcoins) {
		this.readcoins = readcoins;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
