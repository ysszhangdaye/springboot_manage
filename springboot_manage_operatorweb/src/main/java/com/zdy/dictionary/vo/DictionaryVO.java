package com.zdy.dictionary.vo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zdy.biz.dictionary.model.Dictionary;
import com.zdy.util.Page;

public class DictionaryVO extends Page implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id db_column: id
	 */
	private Long id;
	/**
	 * dictionaryKey db_column: dictionary_key
	 */
	private String dictionaryKey;
	/**
	 * dictionartDesc db_column: dictionart_desc
	 */
	private String dictionartDesc;
	/**
	 * createTime db_column: create_time
	 */
	private Date createTime;
	/**
	 * createUser db_column: create_user
	 */
	private Long createUser;
	/**
	 * operTime db_column: oper_time
	 */
	private Date operTime;

	private Long[] ids;

	public DictionaryVO() {
	}

	public DictionaryVO(Long id) {
		this.id = id;
	}

	public DictionaryVO(DictionaryVO dictionary) {
		if (null != dictionary) {
			this.setId(dictionary.getId());
			this.setDictionaryKey(dictionary.getDictionaryKey());
			this.setDictionartDesc(dictionary.getDictionartDesc());
			this.setCreateTime(dictionary.getCreateTime());
			this.setCreateUser(dictionary.getCreateUser());
			this.setOperTime(dictionary.getOperTime());
		}
	}

	public Dictionary toDictionary() {
		Dictionary dictionary = new Dictionary();
		dictionary.setId(this.id);
		dictionary.setDictionaryKey(this.dictionaryKey);
		dictionary.setDictionartDesc(this.dictionartDesc);
		dictionary.setCreateUser(this.createUser);
		dictionary.setIds(this.ids);
		return dictionary;
	}

	public Map<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", this.id);
		map.put("dictionaryKey", this.dictionaryKey);
		map.put("dictionartDesc", this.dictionartDesc);
		map.put("createTime", this.createTime);
		map.put("createUser", this.createUser);
		map.put("operTime", this.operTime);
		return map;
	}

	public void setId(Long value) {
		this.id = value;
	}

	public Long getId() {
		return this.id;
	}

	public void setDictionaryKey(String value) {
		this.dictionaryKey = value;
	}

	public String getDictionaryKey() {
		return this.dictionaryKey;
	}

	public void setDictionartDesc(String value) {
		this.dictionartDesc = value;
	}

	public String getDictionartDesc() {
		return this.dictionartDesc;
	}

	public void setCreateTime(Date value) {
		this.createTime = value;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateUser(Long value) {
		this.createUser = value;
	}

	public Long getCreateUser() {
		return this.createUser;
	}

	public void setOperTime(Date value) {
		this.operTime = value;
	}

	public Date getOperTime() {
		return this.operTime;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	public Long[] getIds() {
		return this.ids;
	}
}
