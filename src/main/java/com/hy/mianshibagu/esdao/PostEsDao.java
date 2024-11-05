package com.hy.mianshibagu.esdao;

import com.hy.mianshibagu.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 * @from <a href="https://github.com/yanghengdaren">yanghengdaren</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}