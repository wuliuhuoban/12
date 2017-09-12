package com.wuliu.service;

import com.wuliu.common.dto.Order;
import com.wuliu.common.dto.Page;
import com.wuliu.common.dto.Result;
import com.wuliu.pojo.vo.EmpQuery;
import com.wuliu.pojo.vo.TbEmpPage;

import java.util.List;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
public interface EmpService {
    //查询一页数据
    Result<TbEmpPage> getList(Page page,Order order,EmpQuery empQuery);
    //删除制定的id,其实是修改状态
    int updateEmpsByIds(List<Integer> ids);
}
