package com.ispan.mingle.projmingle.repository;
    
    


import java.lang.Integer;
import java.util.Collection;

import com.ispan.mingle.projmingle.entity.Work;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.*;


/**
 * 持久层
 *
 * @author makejava
 * @since 2024-01-08 17:05:37
 */
public interface WorkRepository extends Repository<Work, Integer> {

    void save(Work work);

    Boolean delete(Integer id);

    Work findOne(Integer id);

    Iterable<Work> findAll(Collection<Integer> ids);

    Page<Work> findAll(Pageable page);
}

