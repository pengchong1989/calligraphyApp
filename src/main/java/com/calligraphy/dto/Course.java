package com.calligraphy.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * course
 * @author 
 */
public class Course implements Serializable {
    private String id;

    /**
     * 课程名称
     */
    private String coursename;

    /**
     * 一级课程分类id
     */
    private String fristtypeid;

    /**
     * 二级课程分类id
     */
    private String secondtypeid;

    /**
     * 课程编号
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 课程封面
     */
    private String cover;

    private List<String> urls;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getFristtypeid() {
        return fristtypeid;
    }

    public void setFristtypeid(String fristtypeid) {
        this.fristtypeid = fristtypeid;
    }

    public String getSecondtypeid() {
        return secondtypeid;
    }

    public void setSecondtypeid(String secondtypeid) {
        this.secondtypeid = secondtypeid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
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
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCoursename() == null ? other.getCoursename() == null : this.getCoursename().equals(other.getCoursename()))
            && (this.getFristtypeid() == null ? other.getFristtypeid() == null : this.getFristtypeid().equals(other.getFristtypeid()))
            && (this.getSecondtypeid() == null ? other.getSecondtypeid() == null : this.getSecondtypeid().equals(other.getSecondtypeid()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCoursename() == null) ? 0 : getCoursename().hashCode());
        result = prime * result + ((getFristtypeid() == null) ? 0 : getFristtypeid().hashCode());
        result = prime * result + ((getSecondtypeid() == null) ? 0 : getSecondtypeid().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", coursename=").append(coursename);
        sb.append(", fristtypeid=").append(fristtypeid);
        sb.append(", secondtypeid=").append(secondtypeid);
        sb.append(", sort=").append(sort);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}