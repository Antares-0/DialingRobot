package cn.lxm.dialingrobotweb.infrastructure.database.dataobject;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


@TableName("dialing_script_node")
public class DialingScriptNodeDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // 主键（必须加）
    @TableId(type = IdType.AUTO)
    private Long id;

    private Integer status;

    private Long scriptId;

    private Long fatherNodeId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer nodeType;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getScriptId() {
        return scriptId;
    }

    public void setScriptId(Long scriptId) {
        this.scriptId = scriptId;
    }

    public Long getFatherNodeId() {
        return fatherNodeId;
    }

    public void setFatherNodeId(Long fatherNodeId) {
        this.fatherNodeId = fatherNodeId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DialingScriptNodeDO{" +
                "id=" + id +
                ", status=" + status +
                ", scriptId=" + scriptId +
                ", fatherNodeId=" + fatherNodeId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", nodeType=" + nodeType +
                ", content='" + content + '\'' +
                '}';
    }
}
