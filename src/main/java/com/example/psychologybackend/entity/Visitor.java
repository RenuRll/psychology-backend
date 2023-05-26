package com.example.psychologybackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author renu
 * @since 2023-05-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Visitor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vid", type = IdType.AUTO)
    private Integer vid;

    private String openId;

    private String name;

    private String phone;

    private String emgCtName;

    private String emgCtPhone;

    private String avatarUrl;

    private String status;


}
