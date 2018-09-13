package sm.service;

import sm.entity.Staff;

/**
 * Created by chao on 2018/9/13.
 */

public interface SelfService {
    Staff login(String account, String password);
    void changePassword(Integer id,String password);
}
