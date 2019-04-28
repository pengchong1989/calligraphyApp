package com.calligraphy.service.impl;

import com.calligraphy.dao.CopybookMapper;
import com.calligraphy.dto.Copybook;
import com.calligraphy.dto.Copybookurls;
import com.calligraphy.service.CopybookSevice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CopybookSevice")
public class CopybookSeviceImpl implements CopybookSevice {
    @Resource
    CopybookMapper copybookMapper;

    @Override
    public List<Copybook> myCopybook(String userId,Integer pageSize,Integer pageNum) {
        List<Copybook> copybooks = copybookMapper.myCopybook(userId,(pageNum-1)*pageSize,pageNum*pageSize);
        List<Copybook> data = new ArrayList<>();
        Map<Integer,Copybook> map = new HashMap<>();
        for(int i=0;i<copybooks.size();i++){
            if(map.get(copybooks.get(i).getId()) == null){
                Copybook copybook = copybooks.get(i);
                List<String> urls = new ArrayList<>();
                urls.add(copybook.getCopybookurl());
                copybook.setUrls(urls);
                data.add(copybook);
                map.put(copybooks.get(i).getId(),copybooks.get(i));
            }else{
                map.get(copybooks.get(i).getId()).getUrls().add(copybooks.get(i).getCopybookurl());
            }
        }
        return data;
    }

    @Override
    public Integer myCopybookCount(String userId) {
        return copybookMapper.myCopybookCount(userId);
    }

    @Override
    public void addCopybook(Copybook copybook) {
        copybookMapper.insert(copybook);
        Integer copybookId = copybook.getId();
        String[] urls = copybook.getCopybookurl().split(",");
        List<Copybookurls> cs = new ArrayList<>();
        for(int i = 0;i<urls.length;i++){
            Copybookurls copybookurls = new Copybookurls();
            copybookurls.setCopybookId(copybookId);
            copybookurls.setSort(i);
            copybookurls.setUrl(urls[i]);
            cs.add(copybookurls);
        }
        copybookMapper.insertBatch(cs);
    }

    @Override
    public Integer deletemy(Integer id, String userId) {
        return copybookMapper.deletemy(id,userId);
    }
}
