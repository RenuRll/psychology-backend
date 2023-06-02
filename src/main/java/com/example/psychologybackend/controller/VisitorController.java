package com.example.psychologybackend.controller;


import cn.hutool.core.bean.BeanUtil;
import com.example.psychologybackend.dto.VisitorLoginDTO;
import com.example.psychologybackend.dto.VisitorLoginReturnDTO;
import com.example.psychologybackend.entity.Visitor;
import com.example.psychologybackend.service.VisitorService;
import com.example.psychologybackend.utils.R;
import com.example.psychologybackend.utils.WxUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author renu
 * @since 2023-05-26
 */

@Slf4j
@RestController
@RequestMapping("/visitor")
public class VisitorController {


    @Autowired
    private VisitorService visitorService;

    @Value("${wxmini.appid}")
    private String appid;
    @Value("${wxmini.secret}")
    private String secret;

    @GetMapping("/profile")
    public R profile(@RequestParam("visitorId") Integer visitorId) {
        Visitor visitor = visitorService.getById(visitorId);

        return R.ok(visitor);
    }

    @GetMapping("/hello")
    public R hello() {

        return R.ok("hello");
    }


    @PostMapping("/login")
    public R login(@RequestBody VisitorLoginDTO visitorLoginDto) {
        Map<String, Object> sessionKeyAndOpenId = WxUtils.getSessionKeyAndOpenId(visitorLoginDto.getCode(), appid, secret);
        log.info("sessionKeyAndOpenId:[{}]", sessionKeyAndOpenId);
        if (sessionKeyAndOpenId.get("openid") == null) {
            log.warn("login error:{}", (String) sessionKeyAndOpenId.get("errmsg"));
            return R.error((Integer) (sessionKeyAndOpenId.get("errcode")),
                    (String) sessionKeyAndOpenId.get("errmsg"));
        }

        visitorService.wxLogin((String) sessionKeyAndOpenId.get("openid"),
                (String) sessionKeyAndOpenId.get("session_key"));
        return R.ok();
    }

    @PostMapping("/register")
    public R register(@RequestBody @Validated Visitor visitor){
        visitorService.save(visitor);
        if (visitor.getVid() == null){
            return R.error("注册失败");
        }

        VisitorLoginReturnDTO visitorLoginReturnDTO = new VisitorLoginReturnDTO();
        BeanUtil.copyProperties(visitor,visitorLoginReturnDTO);
        // todo
        visitorLoginReturnDTO.setSessionKey("");
        visitorLoginReturnDTO.setToken("xxxx");

        return R.ok(visitorLoginReturnDTO);
    }


    @PutMapping("/modify-profile")
    public R modifyProfile(@RequestBody @Validated Visitor visitor){
        // todo
        if (!StringUtils.isEmpty(visitor.getOpenId())){
            return R.error("不允许修改openid");
        }
        Long visitorId = 23423L;
        visitor.setVid(visitorId);
        boolean bool = visitorService.updateById(visitor);
        if (!bool){
            return R.error("更新失败");
        }
        return R.ok();
    }











}

