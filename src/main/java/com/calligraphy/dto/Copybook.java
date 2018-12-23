package com.calligraphy.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * copybook
 * @author 
 */
public class Copybook implements Serializable {
    private Integer id;

    /**
     * 横数
     */
    private Integer columnnum;

    /**
     * 竖数
     */
    private Integer rownum;

    /**
     * 方格背景
     */
    private Integer backtype;

    private String name;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建人
     */
    private Integer createby;

    /**
     * 字帖url
     */
    private String copybookurl;

    /**
     * 用户id
     */
    private String userId;

    private List<String> urls;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getColumnnum() {
        return columnnum;
    }

    public void setColumnnum(Integer columnnum) {
        this.columnnum = columnnum;
    }

    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    public Integer getBacktype() {
        return backtype;
    }

    public void setBacktype(Integer backtype) {
        this.backtype = backtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public String getCopybookurl() {
        return copybookurl;
    }

    public void setCopybookurl(String copybookurl) {
        this.copybookurl = copybookurl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Copybook other = (Copybook) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getColumnnum() == null ? other.getColumnnum() == null : this.getColumnnum().equals(other.getColumnnum()))
            && (this.getRownum() == null ? other.getRownum() == null : this.getRownum().equals(other.getRownum()))
            && (this.getBacktype() == null ? other.getBacktype() == null : this.getBacktype().equals(other.getBacktype()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getCopybookurl() == null ? other.getCopybookurl() == null : this.getCopybookurl().equals(other.getCopybookurl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getColumnnum() == null) ? 0 : getColumnnum().hashCode());
        result = prime * result + ((getRownum() == null) ? 0 : getRownum().hashCode());
        result = prime * result + ((getBacktype() == null) ? 0 : getBacktype().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getCopybookurl() == null) ? 0 : getCopybookurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", columnnum=").append(columnnum);
        sb.append(", rownum=").append(rownum);
        sb.append(", backtype=").append(backtype);
        sb.append(", name=").append(name);
        sb.append(", createtime=").append(createtime);
        sb.append(", createby=").append(createby);
        sb.append(", copybookurl=").append(copybookurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}