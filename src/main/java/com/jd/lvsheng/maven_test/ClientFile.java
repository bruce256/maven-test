package com.jd.lvsheng.maven_test;

import java.io.Serializable;
import java.sql.Date;

public class ClientFile implements Serializable {

	/**
     * 
     */
	private static final long	serialVersionUID	= 2827437195918657572L;

	private int					id;
	private String				client_type;
	private String				file_type;
	private Integer				upgrade_code;
	private String				jss_url;
	private String				ver_num;
	private Long				size;
	private String				new_feature;
	private String				target_ver;
	private Integer				abt_per;
	private Integer				quiet;
	private Integer				rand_num;
	private Date				created;
	private Date				modified;
	private String				creater;
	private String				modifier;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClient_type() {
		return client_type;
	}

	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public Integer getUpgrade_code() {
		return upgrade_code;
	}

	public void setUpgrade_code(Integer upgrade_code) {
		this.upgrade_code = upgrade_code;
	}

	public String getJss_url() {
		return jss_url;
	}

	public void setJss_url(String jss_url) {
		this.jss_url = jss_url;
	}

	public String getVer_num() {
		return ver_num;
	}

	public void setVer_num(String ver_num) {
		this.ver_num = ver_num;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getNew_feature() {
		return new_feature;
	}

	public void setNew_feature(String new_feature) {
		this.new_feature = new_feature;
	}

	public String getTarget_ver() {
		return target_ver;
	}

	public void setTarget_ver(String target_ver) {
		this.target_ver = target_ver;
	}

	public Integer getAbt_per() {
		return abt_per;
	}

	public void setAbt_per(Integer abt_per) {
		this.abt_per = abt_per;
	}

	public Integer getQuiet() {
		return quiet;
	}

	public void setQuiet(Integer quiet) {
		this.quiet = quiet;
	}

	public Integer getRand_num() {
		return rand_num;
	}

	public void setRand_num(Integer rand_num) {
		this.rand_num = rand_num;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
}
