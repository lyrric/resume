package com.web.freemarker.demo.service;

import com.github.pagehelper.PageInfo;
import com.web.freemarker.demo.entity.ResumeTpl;
import com.web.freemarker.demo.util.JsonResult;

public interface ResumeTplService {

    PageInfo<ResumeTpl> page(int pageNo, int pageSize);

    JsonResult create(int userId, int resumeTplId);
}
