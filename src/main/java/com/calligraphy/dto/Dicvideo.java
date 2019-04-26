package com.calligraphy.dto;

public class Dicvideo {
    private String id;
    private String num;		// 视频编号
    private String dicname;		// 所属字
    private String name;		// 视频名称
    private String calligraphydic;		// 字体
    private String videotype;		// 视频分类
    private String pinyin;		// 拼音
    private String code;		// 笔顺编码
    private String videourl;		// 视频url

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDicname() {
        return dicname;
    }

    public void setDicname(String dicname) {
        this.dicname = dicname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalligraphydic() {
        return calligraphydic;
    }

    public void setCalligraphydic(String calligraphydic) {
        this.calligraphydic = calligraphydic;
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
}
