package Mx.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Meng Xin
 * @Date 2020/7/26 15:23
 */
public class DBUtilTest {
    @Test
    public void testConnection() {
        Assert.assertNotNull(DBUtil.getConnection());
    }
}
