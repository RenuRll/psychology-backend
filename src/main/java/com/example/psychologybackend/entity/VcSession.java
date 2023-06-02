package com.example.psychologybackend.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName vc_session
 */
@TableName(value ="vc_session")
@Data
public class VcSession implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer vcId;

    /**
     * 
     */
    private Integer vid;

    /**
     * 
     */
    private Integer eid;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Integer duration;

    /**
     * 
     */
    private Integer rating;

    /**
     * 
     */
    private String comment4c;

    /**
     * 
     */
    private String diagnosis4v;

    /**
     * 用用会话id
     */
    private Integer sId;

    /**
     * 
     */
    private Date beginTime;

    /**
     * 
     */
    private Date endTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vcId=").append(vcId);
        sb.append(", vid=").append(vid);
        sb.append(", eid=").append(eid);
        sb.append(", type=").append(type);
        sb.append(", duration=").append(duration);
        sb.append(", rating=").append(rating);
        sb.append(", comment4c=").append(comment4c);
        sb.append(", diagnosis4v=").append(diagnosis4v);
        sb.append(", sId=").append(sId);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}