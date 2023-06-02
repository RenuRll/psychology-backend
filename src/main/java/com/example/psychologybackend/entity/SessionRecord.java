package com.example.psychologybackend.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName session_record
 */
@TableName(value ="session_record")
@Data
public class SessionRecord implements Serializable {
    /**
     * 聊天记录id
     */
    @TableId
    private Integer rId;

    /**
     * 
     */
    private Integer sId;

    /**
     * 
     */
    private Integer fromId;

    /**
     * 
     */
    private Integer toId;

    /**
     * 
     */
    private Integer msgSeq;

    /**
     * 
     */
    private String msgBoby;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", sId=").append(sId);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", msgSeq=").append(msgSeq);
        sb.append(", msgBoby=").append(msgBoby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}