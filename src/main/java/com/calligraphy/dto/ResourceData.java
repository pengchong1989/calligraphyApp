package com.calligraphy.dto;

public class ResourceData {
    private String picurl;

    private Object videourl;

    public ResourceData(String picurl, Object videourl) {
        this.picurl = picurl;
        this.videourl = videourl;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public Object getVideourl() {
        return videourl;
    }

    public void setVideourl(Object videourl) {
        this.videourl = videourl;
    }
}
