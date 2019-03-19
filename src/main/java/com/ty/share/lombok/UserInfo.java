package com.ty.share.lombok;

import com.ty.share.websocket.WhyConcurrent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @description: 用户信息类
 * @author: 04637
 * @date: 2019/3/17
 **/
@Data
@Accessors(chain = true)
@EqualsAndHashCode
public class UserInfo {

    private String username;

    @EqualsAndHashCode.Exclude
    private String userCode;

    private String realName;
    private String qAbc;

    // todo 1. get-set
    // todo 2. 链式 set
    // todo 3. toString
    // todo 4. 重写 equals 方法  排除比较项
    // todo 5. log

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode("x5615").setUsername("jiguantong").setRealName("helll").setQAbc("hahah");
        System.out.println(userInfo);
    }

}
