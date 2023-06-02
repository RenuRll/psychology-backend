package com.example.psychologybackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

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

    @TableId(value = "vid", type = IdType.ASSIGN_ID)
    private Long vid;

    @NotBlank
    private String openId;


    @NotBlank
    @Length(min = 2,max = 32,message = "长度应该为2-32")
    private String name;

    @Pattern(regexp= "^1[345678]\\d{9}$")
    private String phone;

    @NotBlank
    @Length(min = 2,max = 32,message = "长度应该为2-32")
    private String emgCtName;

    @Pattern(regexp= "^1[345678]\\d{9}$")
    private String emgCtPhone;

    private String avatarUrl;

    private String status;


}
