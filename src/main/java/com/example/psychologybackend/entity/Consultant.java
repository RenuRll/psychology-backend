package com.example.psychologybackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
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
public class Consultant implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "eid", type = IdType.AUTO)
    private Integer eid;

    private String password;

    private String name;

    private String avatarUrl;

    private Integer idNumber;

    private String gender;

    private String phone;

    private String email;

    private String avatatUrl;

    private Double avgRating;

    private Integer ratingTimes;

    private Integer consultTimes;

    private String status;


}
