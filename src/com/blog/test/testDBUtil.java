package com.blog.test;

import com.blog.dao.db.DBUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class testDBUtil {

        @Test
        public void testDBUtil() throws SQLException {
            Connection conn = DBUtil.getConnection();

            System.out.println(conn);




        }


}
