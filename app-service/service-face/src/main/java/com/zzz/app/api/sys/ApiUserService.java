package com.zzz.app.api.sys;

import com.zzz.app.domain.sys.User;
import com.zzz.app.result.EntryResult;

/**
 * Created by dell_2 on 2016/9/1.
 */
public interface ApiUserService {

    EntryResult add(User user);
}
