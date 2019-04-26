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

    private Coursetype coursetype;		// 二级课程分类id

    private String cover;		// 课程封面
    private String url1;		// 课程图片1
    private String video1;		// 视频1
    private String url2;		// 课程图片2
    private String video2;		// 视频2
    private String url3;		// 课程图片3
    private String video3;		// 视频3
    private String url4;		// 课程图片4
    private String video4;		// 视频4
    private String url5;		// 课程图片5
    private String video5;		// 视频5
    private String url6;		// 课程图片6
    private String video6;		// 视频6
    private String url7;		// 课程图片7
    private String video7;		// 视频7
    private String url8;		// 课程图片8
    private String video8;		// 视频8
    private String url9;		// 课程图片9
    private String video9;		// 视频9
    private String url10;		// 课程图片10
    private String video10;		// 视频10
    private String url11;		// 课程图片11
    private String video11;		// 视频11
    private String url12;		// 课程图片12
    private String video12;		// 视频12
    private String url13;		// 课程图片13
    private String video13;		// 视频13
    private String url14;		// 课程图片14
    private String video14;		// 视频14
    private String url15;		// 课程图片15
    private String video15;		// 视频15
    private String status ="1";		// 课程状态

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

    public Coursetype getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(Coursetype coursetype) {
        this.coursetype = coursetype;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getVideo1() {
        return video1;
    }

    public void setVideo1(String video1) {
        this.video1 = video1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getVideo2() {
        return video2;
    }

    public void setVideo2(String video2) {
        this.video2 = video2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getVideo3() {
        return video3;
    }

    public void setVideo3(String video3) {
        this.video3 = video3;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }

    public String getVideo4() {
        return video4;
    }

    public void setVideo4(String video4) {
        this.video4 = video4;
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5;
    }

    public String getVideo5() {
        return video5;
    }

    public void setVideo5(String video5) {
        this.video5 = video5;
    }

    public String getUrl6() {
        return url6;
    }

    public void setUrl6(String url6) {
        this.url6 = url6;
    }

    public String getVideo6() {
        return video6;
    }

    public void setVideo6(String video6) {
        this.video6 = video6;
    }

    public String getUrl7() {
        return url7;
    }

    public void setUrl7(String url7) {
        this.url7 = url7;
    }

    public String getVideo7() {
        return video7;
    }

    public void setVideo7(String video7) {
        this.video7 = video7;
    }

    public String getUrl8() {
        return url8;
    }

    public void setUrl8(String url8) {
        this.url8 = url8;
    }

    public String getVideo8() {
        return video8;
    }

    public void setVideo8(String video8) {
        this.video8 = video8;
    }

    public String getUrl9() {
        return url9;
    }

    public void setUrl9(String url9) {
        this.url9 = url9;
    }

    public String getVideo9() {
        return video9;
    }

    public void setVideo9(String video9) {
        this.video9 = video9;
    }

    public String getUrl10() {
        return url10;
    }

    public void setUrl10(String url10) {
        this.url10 = url10;
    }

    public String getVideo10() {
        return video10;
    }

    public void setVideo10(String video10) {
        this.video10 = video10;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl11() {
        return url11;
    }

    public void setUrl11(String url11) {
        this.url11 = url11;
    }

    public String getVideo11() {
        return video11;
    }

    public void setVideo11(String video11) {
        this.video11 = video11;
    }

    public String getUrl12() {
        return url12;
    }

    public void setUrl12(String url12) {
        this.url12 = url12;
    }

    public String getVideo12() {
        return video12;
    }

    public void setVideo12(String video12) {
        this.video12 = video12;
    }

    public String getUrl13() {
        return url13;
    }

    public void setUrl13(String url13) {
        this.url13 = url13;
    }

    public String getVideo13() {
        return video13;
    }

    public void setVideo13(String video13) {
        this.video13 = video13;
    }

    public String getUrl14() {
        return url14;
    }

    public void setUrl14(String url14) {
        this.url14 = url14;
    }

    public String getVideo14() {
        return video14;
    }

    public void setVideo14(String video14) {
        this.video14 = video14;
    }

    public String getUrl15() {
        return url15;
    }

    public void setUrl15(String url15) {
        this.url15 = url15;
    }

    public String getVideo15() {
        return video15;
    }

    public void setVideo15(String video15) {
        this.video15 = video15;
    }
}