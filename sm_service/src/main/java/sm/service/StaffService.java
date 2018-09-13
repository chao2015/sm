package sm.service;

import sm.entity.Staff;

import java.util.List;

/**
 * Created by chao on 2018/9/13.
 */

public interface StaffService {
    void add(Staff staff);
    void remove(Integer id);
    void edit(Staff staff);
    Staff get(Integer id);
    List<Staff> getAll();
}
