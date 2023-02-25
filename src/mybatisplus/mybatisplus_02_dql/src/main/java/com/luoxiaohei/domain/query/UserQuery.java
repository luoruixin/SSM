package com.luoxiaohei.domain.query;

import com.luoxiaohei.domain.User;
import lombok.Data;

@Data  //这是lombok
public class UserQuery extends User {
    //只有age有可能有上下限
    private Integer age2;//专门描述年龄的上限
}
