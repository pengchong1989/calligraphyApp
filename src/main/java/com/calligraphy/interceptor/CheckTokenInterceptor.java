package com.calligraphy.interceptor;

import com.alibaba.fastjson.JSON;
import com.calligraphy.dto.ResponseData;
import com.calligraphy.util.ContansUtil;
import com.calligraphy.util.SymmetricEncoder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class CheckTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        String check = request.getParameter("token");
        if(StringUtils.isNoneBlank(check)){
            String str = SymmetricEncoder.AESDncode(ContansUtil.aeskey,check);
            if(StringUtils.isNoneBlank(str)){
                return true;
            }
        }
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");

        PrintWriter pw = response.getWriter();
        pw.write(JSON.toJSONString(new ResponseData(false,"1",null)));
        return false;
    }
}