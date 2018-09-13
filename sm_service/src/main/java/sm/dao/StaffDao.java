package sm.dao;

import org.springframework.stereotype.Repository;
import sm.entity.Staff;

import java.util.List;

/**
 * Created by chao on 2018/9/13.
 */

@Repository("staffDao")
public interface StaffDao {
    void insert(Staff staff);
    void delete(Integer id);
    void update(Staff staff);
    Staff selectById(Integer id);
    List<Staff> selectAll();
}
