package com.stictch.controller;

import com.stictch.config.FastDFSClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author demo
 * @title UploadController
 * @description
 * @date 2020/10/14/9:34
 */
@CrossOrigin
@RestController
public class UploadController {

    private String FILE_SERVER_URL = "http://192.168.153.102/";

    /**
     * 上传图片
     *
     * @param upfile file
     * @return map
     */
    @RequestMapping("/uploadImage")
    public Map<String, Object> uploadImage(MultipartFile upfile) {
        FastDFSClient fastDFS = null;
        Map<String, Object> result = null;
        try {
            fastDFS = new FastDFSClient("classpath:fdfs_client.conf");
            String path = fastDFS.uploadFile(upfile.getBytes(), upfile.getOriginalFilename(), upfile.getSize());
            //拼接上服务器的地址返回给前端
            String url = FILE_SERVER_URL + path;
            System.out.println(url);
            result = new HashMap<>();
            result.put("state", "SUCCESS");
            //上传文件返回文件保存的路径和文件名
            result.put("url", url);
            result.put("title", upfile.getOriginalFilename());
            result.put("original", upfile.getOriginalFilename());
            result.put("location",upfile.getOriginalFilename());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result = new HashMap<>();
            result.put("state", "Error");
            return result;
        }


    }

    @RequestMapping("uploadFile")
    public Map<String, Object> uploadFile(MultipartFile file) {
        FastDFSClient fastDFS = null;
        Map<String, Object> result = null;
        try {
            fastDFS = new FastDFSClient("classpath:fdfs_client.conf");
            //上传文件返回文件保存的路径和文件名
            String path = fastDFS.uploadFile(file.getBytes(), file.getOriginalFilename(), file.getSize());
            //拼接上服务器的地址返回给前端
            String url = FILE_SERVER_URL + path;
            result = new HashMap<>();
            result.put("state", "SUCCESS");
            result.put("url", url);
            result.put("title", file.getOriginalFilename());
            result.put("original", file.getOriginalFilename());
            return result;
        } catch (Exception e) {
            result = new HashMap<>();
            result.put("state", "ERROR");
            return result;
        }

    }


}
