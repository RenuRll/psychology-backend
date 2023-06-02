package com.example.psychologybackend.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName supervisor
 */
@TableName(value ="supervisor")
@Data
public class Supervisor implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer eid;

    /**
     * 
     */
    private String qualification;

    /**
     * 
     */
    private String qualificationId;

    /**
     * 
     */
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", qualification=").append(qualification);
        sb.append(", qualificationId=").append(qualificationId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}