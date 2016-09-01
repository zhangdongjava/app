package com.zzz.app.app.controller.sys;

import com.alibaba.fastjson.JSON;
import com.zzz.app.api.sys.ApiUserService;
import com.zzz.app.domain.sys.User;
import com.zzz.app.result.EntryResult;
import com.zzz.app.result.ResultStatus;
import com.zzz.app.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dell_2 on 2016/9/1.
 */
@Controller
public class UserController {

    @Autowired
    private ApiUserService apiUserService;

    @RequestMapping("/add")
    @ResponseBody
    public Object add(User user){
        Response res = new Response(true);
        try {
            EntryResult result = apiUserService.add(user);
            res.setSuccess(ResultStatus.SUCCESS.equals(result.getStauts()));
            res.setMessage(result.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            res.setMessage(e.toString());
        }
        return res;
    }
}
