package com.calligraphy.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * calligraphydic
 * @author 
 */
public class Calligraphydic implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 书法字典类型
     */
    private Integer calligraphydic;

    /**
     * 字典Url
     */
    private String dicurl;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 创建人
     */
    private Integer createby;

    /**
     * 字的名字
     */
    private String wordname;

    /**
     * 阅读次数
     */
    private Integer readnum;

    /**
     * 拼音
     */
    private String pinyin;

    /**
     * 解释
     */
    private String explanation;

    /**
     * 编码
     */
    private String code;

    private String source;
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCalligraphydic() {
        return calligraphydic;
    }

    public void setCalligraphydic(Integer calligraphydic) {
        this.calligraphydic = calligraphydic;
    }

    public String getDicurl() {
        return dicurl;
    }

    public void setDicurl(String dicurl) {
        this.dicurl = dicurl;
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

    public String getWordname() {
        return wordname;
    }

    public void setWordname(String wordname) {
        this.wordname = wordname;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
        Calligraphydic other = (Calligraphydic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCalligraphydic() == null ? other.getCalligraphydic() == null : this.getCalligraphydic().equals(other.getCalligraphydic()))
            && (this.getDicurl() == null ? other.getDicurl() == null : this.getDicurl().equals(other.getDicurl()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getWordname() == null ? other.getWordname() == null : this.getWordname().equals(other.getWordname()))
            && (this.getReadnum() == null ? other.getReadnum() == null : this.getReadnum().equals(other.getReadnum()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getExplanation() == null ? other.getExplanation() == null : this.getExplanation().equals(other.getExplanation()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCalligraphydic() == null) ? 0 : getCalligraphydic().hashCode());
        result = prime * result + ((getDicurl() == null) ? 0 : getDicurl().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getWordname() == null) ? 0 : getWordname().hashCode());
        result = prime * result + ((getReadnum() == null) ? 0 : getReadnum().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getExplanation() == null) ? 0 : getExplanation().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", calligraphydic=").append(calligraphydic);
        sb.append(", dicurl=").append(dicurl);
        sb.append(", createtime=").append(createtime);
        sb.append(", createby=").append(createby);
        sb.append(", wordname=").append(wordname);
        sb.append(", readnum=").append(readnum);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", explanation=").append(explanation);
        sb.append(", code=").append(code);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}