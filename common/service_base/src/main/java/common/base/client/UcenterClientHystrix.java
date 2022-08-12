package common.base.client;

import com.comon_utils.Result;
import com.zh.oes.common.base.exception.OESException;
import com.zh.oes.model.vo.edu.user.MemberVO;
import common.base.exception.OESException;
import org.springframework.stereotype.Component;

@Component
public class UcenterClientHystrix implements UcenterClient {
    @Override
    public MemberVO remoteGetUser(Long userId) {
        throw new OESException("Ucenter服务器宕机");
    }

    @Override
    public Result remoteRegisterCount(String day) {
        return Result.failure().message("Ucenter服务器宕机");
    }
}
