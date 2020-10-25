package com.stictch.controller;

import com.stictch.entity.EnterpriseJobPublish;
import com.stictch.entity.RespBean;
import com.stictch.service.EnterpriseJobPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author demo
 * @title EnterpriseJobController
 * @description
 * @date 2020/10/25/10:26
 */

@CrossOrigin
@RestController
@RequestMapping("job")
public class EnterpriseJobController {

    EnterpriseJobPublishService service;

    @Autowired
    public void setService(EnterpriseJobPublishService service) {
        this.service = service;
    }

    @PostMapping("addJobPublish")
    public RespBean addJobPublish(@RequestBody EnterpriseJobPublish jobPublish) {
        Long id = null;
        Integer insert = 0;
        insert = service.insert(jobPublish);
        EnterpriseJobPublish job = new EnterpriseJobPublish();
        job.setPublishTitle(jobPublish.getPublishTitle());
        List<EnterpriseJobPublish> enterpriseJobPublishes = service.queryAll(job);
        if (insert > 0) {
            for (EnterpriseJobPublish i : enterpriseJobPublishes) {
                id = i.getPublishId();
            }
            return RespBean.ok("ok", id);
        } else {
            return RespBean.error("出错了");
        }

    }

    @DeleteMapping("deleteJobPublish")
    public Integer deleteJobPublish(Long publishId) {
        return service.deleteById(publishId);
    }

    @GetMapping("allJobPublish")
    public List<EnterpriseJobPublish> findAll() {
        return service.queryAll();
    }

    @GetMapping("/total")
    public Integer getCount() {
        return service.getCount();
    }
}
