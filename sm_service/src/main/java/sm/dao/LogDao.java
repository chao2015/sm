package sm.dao;

import org.springframework.stereotype.Repository;
import sm.entity.Log;

import java.util.List;

/**
 * Created by chao on 2018/9/13.
 */

@Repository("logDao")
public interface LogDao {
    void insert(Log log);
    List<Log> selectByType(String type);
}
