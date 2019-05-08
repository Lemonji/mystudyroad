package com.meng.study.utils;

import com.meng.study.bean.User;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.util.UUID;

public class slatUtil {

    /**
     * 工具类
     *
     * @author itdragon
     */

    private static final String ALGORITHM_NAME = "MD5";
    private static final Integer HASH_ITERATIONS = 1024;

    public static void entryptPassword(User user) {
        String salt = UUID.randomUUID().toString();
        String temPassword = user.getUserPassword();
        Object md5Password = new SimpleHash(ALGORITHM_NAME, temPassword, ByteSource.Util.bytes(salt), HASH_ITERATIONS);
        user.setSalt(salt);
        user.setUserPassword(md5Password.toString());
    }

}
