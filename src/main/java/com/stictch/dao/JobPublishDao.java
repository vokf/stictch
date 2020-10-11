package com.stictch.dao;

import com.stictch.entity.JobPublish;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author demo
 * @title JobPublishDao
 * @description
 * @date 2020/10/10/18:44
 */
@Repository
@Mapper
public interface JobPublishDao {
    /**
     * 添加
     * @param jobPublish job
     * @return job
     */
    JobPublish addJob(JobPublish jobPublish);

    /**
     * select
     * @param jobPublish
     * @return
     */
    JobPublish findAllJob(JobPublish jobPublish);

    /**
     * update
     * @param jobPublish
     * @return
     */
    JobPublish updateJob(JobPublish jobPublish);

    /**
     * delete
     * @param id
     * @return
     */
    int deleteJob(Integer id);
}
