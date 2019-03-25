package com.chairz.entity;

import java.util.Date;
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
@TableName("m_commentmsg")
public class MCommentmsg extends Model<MCommentmsg> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer uid;
	private Integer bid;
	private String usermsg;
	private String wmsg;
	private Date createtime;


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

	public String getUsermsg() {
		return usermsg;
	}

	public void setUsermsg(String usermsg) {
		this.usermsg = usermsg;
	}

	public String getWmsg() {
		return wmsg;
	}

	public void setWmsg(String wmsg) {
		this.wmsg = wmsg;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
