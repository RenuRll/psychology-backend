package com.example.psychologybackend.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName consultant
 */
@TableName(value ="consultant")
@Data
public class Consultant implements Serializable {
    /**
     * 
     */
    @TableId
    private String eid;

    /**
     * 
     */
    private Double avgRating;

    /**
     * 评分次数
     */
    private Integer ratingTimes;

    /**
     * 咨询次数
     */
    private Integer consultTimes;

    /**
     * 在线状态
     */
    private String status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Consultant other = (Consultant) that;
        return (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getAvgRating() == null ? other.getAvgRating() == null : this.getAvgRating().equals(other.getAvgRating()))
            && (this.getRatingTimes() == null ? other.getRatingTimes() == null : this.getRatingTimes().equals(other.getRatingTimes()))
            && (this.getConsultTimes() == null ? other.getConsultTimes() == null : this.getConsultTimes().equals(other.getConsultTimes()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getAvgRating() == null) ? 0 : getAvgRating().hashCode());
        result = prime * result + ((getRatingTimes() == null) ? 0 : getRatingTimes().hashCode());
        result = prime * result + ((getConsultTimes() == null) ? 0 : getConsultTimes().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", avgRating=").append(avgRating);
        sb.append(", ratingTimes=").append(ratingTimes);
        sb.append(", consultTimes=").append(consultTimes);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}