package com.zzz.app.api.impl.sys;

import com.zzz.app.api.sys.ApiUserService;
import com.zzz.app.domain.sys.User;
import com.zzz.app.inner.service.UserService;
import com.zzz.app.result.EntryResult;
import com.zzz.app.result.ResultStatus;
import org.springframework.dao.DataAccessException;

/**
 * Created by dell_2 on 2016/9/1.
 */
public class ApiUserServiceImpl implements ApiUserService {

    private UserService userService;

    public EntryResult add(User user) {
        EntryResult entryResult = new EntryResult();
        try {
            userService.addUser(user);
            entryResult.setStauts(ResultStatus.SUCCESS);
            entryResult.setMessage("添加用户成功!");
        }catch (DataAccessException e){
            entryResult.setStauts(ResultStatus.FAIL);
            entryResult.setMessage("添加用户失败,数据库错误!"+e.toString());
        }catch (Exception e){
            entryResult.setStauts(ResultStatus.FAIL);
            entryResult.setMessage("添加用户失败!"+e.toString());
        }
        return entryResult;
    }
}
