package com.chairz.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("b_bookdata")
public class BBookdata extends Model<BBookdata> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer bid;
	private Integer passnum;
	private Integer totalreadcoins;
	private Integer click;
	private Integer totalwords;
	private Integer collectionnum;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getPassnum() {
		return passnum;
	}

	public void setPassnum(Integer passnum) {
		this.passnum = passnum;
	}

	public Integer getTotalreadcoins() {
		return totalreadcoins;
	}

	public void setTotalreadcoins(Integer totalreadcoins) {
		this.totalreadcoins = totalreadcoins;
	}

	public Integer getClick() {
		return click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	public Integer getTotalwords() {
		return totalwords;
	}

	public void setTotalwords(Integer totalwords) {
		this.totalwords = totalwords;
	}

	public Integer getCollectionnum() {
		return collectionnum;
	}

	public void setCollectionnum(Integer collectionnum) {
		this.collectionnum = collectionnum;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
