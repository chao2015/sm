package sm.dao;

import org.springframework.stereotype.Repository;
import sm.entity.Staff;

/**
 * Created by chao on 2018/9/13.
 */

@Repository("selfDao")
public interface SelfDao {
    Staff selectByAccount(String account);
}
