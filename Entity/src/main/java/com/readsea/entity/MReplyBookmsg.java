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
@TableName("m_replyBookmsg")
public class MReplyBookmsg extends Model<MReplyBookmsg> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer bid;
	private Integer bmid;
	private Integer replytype;
	private String msg;
	private Integer fromuid;
	private Integer touid;


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

	public Integer getBmid() {
		return bmid;
	}

	public void setBmid(Integer bmid) {
		this.bmid = bmid;
	}

	public Integer getReplytype() {
		return replytype;
	}

	public void setReplytype(Integer replytype) {
		this.replytype = replytype;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getFromuid() {
		return fromuid;
	}

	public void setFromuid(Integer fromuid) {
		this.fromuid = fromuid;
	}

	public Integer getTouid() {
		return touid;
	}

	public void setTouid(Integer touid) {
		this.touid = touid;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
