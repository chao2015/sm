package sm.service;

import sm.entity.Log;

import java.util.List;

/**
 * Created by chao on 2018/9/13.
 */
public interface LogService {
    void addSystemLog(Log log);
    void addLoginLog(Log log);
    void addOperationLog(Log log);

    List<Log> getSystemLog();
    List<Log> getLoginLog();
    List<Log> getOperationLog();
}
