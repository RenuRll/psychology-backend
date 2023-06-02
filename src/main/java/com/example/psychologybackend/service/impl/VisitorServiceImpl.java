package com.example.psychologybackend.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.psychologybackend.dto.VisitorLoginReturnDTO;
import com.example.psychologybackend.entity.Visitor;
import com.example.psychologybackend.mapper.VisitorMapper;
import com.example.psychologybackend.service.VisitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.psychologybackend.utils.R;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author renu
 * @since 2023-05-26
 */
@Service
public class VisitorServiceImpl extends ServiceImpl<VisitorMapper, Visitor> implements VisitorService {


    @Autowired
    private VisitorMapper visitorMapper;
    @Override
    public R wxLogin(String openid, String session_key) {

        LambdaQueryWrapper<Visitor> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Visitor::getOpenId,openid);
        Visitor visitor =visitorMapper.selectOne(lqw);

        if (visitor ==null){
            HashMap<String, String> openId = new HashMap<>();
            openId.put("openid",openid);
            openId.put("session_key",session_key);
            return R.error(HttpStatus.SC_UNAUTHORIZED,"请先注册",openid);
        }

        VisitorLoginReturnDTO visitorLoginReturnDTO = new VisitorLoginReturnDTO();
        BeanUtil.copyProperties(visitor,visitorLoginReturnDTO);
        // todo
        visitorLoginReturnDTO.setSessionKey("xxx");
        visitorLoginReturnDTO.setSessionKey(session_key);

        return R.ok(visitorLoginReturnDTO);
    }
}
