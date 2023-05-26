package com.example.psychologybackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import java.time.LocalDateTime;
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
public class VcSession implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "vc_id", type = IdType.AUTO)
    private Integer vcId;

    private Integer vid;

    private Integer eid;

    private LocalDateTime date;

    private String type;

    private Integer duration;

    private Integer rating;

    private String comment4c;

    private String diagnosis4v;

    private String content;


}
