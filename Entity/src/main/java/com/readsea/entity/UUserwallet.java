package com.readsea.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChaiRZ
 * @since 2019-03-25
 */
@TableName("u_userwallet")
public class UUserwallet extends Model<UUserwallet> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer totalcoins;
	private Integer readcoins;
	private Integer losemoney;
	private Integer totalpass;
	private Integer losepass;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalcoins() {
		return totalcoins;
	}

	public void setTotalcoins(Integer totalcoins) {
		this.totalcoins = totalcoins;
	}

	public Integer getReadcoins() {
		return readcoins;
	}

	public void setReadcoins(Integer readcoins) {
		this.readcoins = readcoins;
	}

	public Integer getLosemoney() {
		return losemoney;
	}

	public void setLosemoney(Integer losemoney) {
		this.losemoney = losemoney;
	}

	public Integer getTotalpass() {
		return totalpass;
	}

	public void setTotalpass(Integer totalpass) {
		this.totalpass = totalpass;
	}

	public Integer getLosepass() {
		return losepass;
	}

	public void setLosepass(Integer losepass) {
		this.losepass = losepass;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
