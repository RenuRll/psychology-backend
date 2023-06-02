package com.example.psychologybackend.service;

import com.example.psychologybackend.entity.Visitor;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.psychologybackend.utils.R;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author renu
 * @since 2023-05-26
 */
public interface VisitorService extends IService<Visitor> {

    R wxLogin(String openid, String session_key);
}
