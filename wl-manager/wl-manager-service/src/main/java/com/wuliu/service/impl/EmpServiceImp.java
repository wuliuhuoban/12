package com.wuliu.service.impl;

import com.wuliu.common.dto.Order;
import com.wuliu.common.dto.Page;
import com.wuliu.common.dto.Result;
import com.wuliu.dao.TbEmpMapper;
import com.wuliu.dao.TbEmpMapperPage;
import com.wuliu.pojo.po.TbEmp;
import com.wuliu.pojo.po.TbEmpExample;
import com.wuliu.pojo.vo.EmpQuery;
import com.wuliu.pojo.vo.TbEmpPage;
import com.wuliu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/6 0006.
 */
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private TbEmpMapper tbEmpMapper;

    @Autowired
    private TbEmpMapperPage tbEmpMapperPage;
    @Override
    public Result<TbEmpPage> getList(Page page, Order order, EmpQuery empQuery) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",page);
        map.put("order",order);
        map.put("empQuery",empQuery);
        List<TbEmpPage> list = tbEmpMapperPage.selectEmpByPage(map);
        long total = tbEmpMapperPage.selectTotal(map);
        Result<TbEmpPage> result = new Result<>();
        result.setRows(list);
        result.setTotal(total);
        return result;
    }

    @Override
    public int updateEmpsByIds(List<Integer> ids) {

        TbEmp record = new TbEmp();
        record.setFlag("2");
        TbEmpExample example = new TbEmpExample();
        TbEmpExample.Criteria criteria=example.createCriteria();
        criteria.andIdIn(ids);

        return tbEmpMapper.updateByExampleSelective(record,example);

    }
}
