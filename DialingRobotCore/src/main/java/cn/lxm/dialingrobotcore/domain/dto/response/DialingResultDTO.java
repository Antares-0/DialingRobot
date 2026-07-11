package cn.lxm.dialingrobotcore.domain.dto.response;

import cn.lxm.dialingrobotcommon.base.domain.BaseResp;

public class DialingResultDTO {

    private BaseResp baseResp;

    private Integer status;

    public BaseResp getBaseResp() {
        return baseResp;
    }

    public void setBaseResp(BaseResp baseResp) {
        this.baseResp = baseResp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
