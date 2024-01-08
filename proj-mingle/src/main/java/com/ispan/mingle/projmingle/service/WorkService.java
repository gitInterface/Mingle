package com.ispan.mingle.projmingle.service;
    
    


import java.lang.Integer;
import com.ispan.mingle.projmingle.entity.Work;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Collection;
import java.util.List;


/**
 * 业务层
 *
 * @author makejava
 * @since 2024-01-08 17:05:37
 */
public interface WorkService {

    void save(Work work);

    Boolean deleteById(Integer id);

    Work findById(Integer id);

    List<Work> findById(Collection<Integer> ids);

    Page<Work> list(Pageable page);

}

