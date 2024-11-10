
package com.hy.mianshibagu.esdao;

import com.hy.mianshibagu.model.dto.post.PostEsDTO;
import com.hy.mianshibagu.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao
        extends ElasticsearchRepository<QuestionEsDTO, Long> {

}
