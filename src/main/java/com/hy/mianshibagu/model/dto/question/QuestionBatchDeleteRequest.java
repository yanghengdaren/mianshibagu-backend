package com.hy.mianshibagu.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量删除题目请求
 *
 * @author <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 * @from <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 */
@Data
public class QuestionBatchDeleteRequest implements Serializable {

    /**
     * 题目id列表
     */
    private List<Long> questionIdList;


    private static final long serialVersionUID = 1L;
}