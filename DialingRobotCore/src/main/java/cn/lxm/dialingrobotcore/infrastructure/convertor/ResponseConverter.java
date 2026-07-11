package cn.lxm.dialingrobotcore.infrastructure.convertor;

import cn.lxm.dialingrobotcommon.base.adapter.BaseResponse;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallResponseVO;
import cn.lxm.dialingrobotcommon.base.domain.BaseResp;
import cn.lxm.dialingrobotcore.domain.dto.response.DialingResultDTO;

public class ResponseConverter {

    public static void buildBaseResponseFromBaseResp(BaseResp resp, BaseResponse baseResponse) {
        baseResponse.setErrorCode(resp.getErrorCode());
        baseResponse.setErrorMessage(resp.getErrorMessage());
        baseResponse.setLogID(resp.getLogID());
    }

    public static BaseResponse<DialingInviteCallResponseVO> convertDialingResultDTO2DialingInviteCallResponseDTO(DialingResultDTO resultDTO) {
        BaseResponse<DialingInviteCallResponseVO> baseResponse = new BaseResponse<>();
        buildBaseResponseFromBaseResp(resultDTO.getBaseResp(), baseResponse);
        DialingInviteCallResponseVO dialingInviteCallResponseVO = new DialingInviteCallResponseVO();
        dialingInviteCallResponseVO.setStatus(resultDTO.getStatus());
        baseResponse.setData(dialingInviteCallResponseVO);
        return baseResponse;
    }

}
