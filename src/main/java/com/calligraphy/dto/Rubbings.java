package com.calligraphy.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * rubbings
 * @author 
 */
public class Rubbings implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 时期
     */
    private Integer typetime;

    /**
     * 来源
     */
    private String source;

    /**
     * 碑帖url
     */
    private String rubbingsurl;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建者
     */
    private Integer createby;

    /**
     * 碑帖名称
     */
    private String name;

    /**
     * 阅读次数
     */
    private Integer readnum;

    /**
     * 收藏次数
     */
    private Integer collectionnum;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTypetime() {
        return typetime;
    }

    public void setTypetime(Integer typetime) {
        this.typetime = typetime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRubbingsurl() {
        return rubbingsurl;
    }

    public void setRubbingsurl(String rubbingsurl) {
        this.rubbingsurl = rubbingsurl;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getCollectionnum() {
        return collectionnum;
    }

    public void setCollectionnum(Integer collectionnum) {
        this.collectionnum = collectionnum;
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
        Rubbings other = (Rubbings) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypetime() == null ? other.getTypetime() == null : this.getTypetime().equals(other.getTypetime()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getRubbingsurl() == null ? other.getRubbingsurl() == null : this.getRubbingsurl().equals(other.getRubbingsurl()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getReadnum() == null ? other.getReadnum() == null : this.getReadnum().equals(other.getReadnum()))
            && (this.getCollectionnum() == null ? other.getCollectionnum() == null : this.getCollectionnum().equals(other.getCollectionnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypetime() == null) ? 0 : getTypetime().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getRubbingsurl() == null) ? 0 : getRubbingsurl().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getReadnum() == null) ? 0 : getReadnum().hashCode());
        result = prime * result + ((getCollectionnum() == null) ? 0 : getCollectionnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typetime=").append(typetime);
        sb.append(", source=").append(source);
        sb.append(", rubbingsurl=").append(rubbingsurl);
        sb.append(", createtime=").append(createtime);
        sb.append(", createby=").append(createby);
        sb.append(", name=").append(name);
        sb.append(", readnum=").append(readnum);
        sb.append(", collectionnum=").append(collectionnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}