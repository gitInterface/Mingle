package com.ispan.mingle.projmingle.service.impl;
    
    


import java.lang.Integer;

import com.ispan.mingle.projmingle.entity.Work;
import com.ispan.mingle.projmingle.service.WorkService;
import com.ispan.mingle.projmingle.repository.WorkRepository;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


/**
 * 业务层
 *
 * @author makejava
 * @since 2024-01-08 17:05:37
 */
@Service
public class WorkServiceImpl implements WorkService {

	@Resource
    private WorkRepository workRepository;

    @Override
    public void save(Work work) {
        workRepository.save(work);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return workRepository.delete(id);
    }

    @Override
    public Work findById(Integer id) {
        return workRepository.findOne(id);
    }

    @Override
    public List<Work> findById(Collection<Integer> ids) {
        Iterable<Work> iterable = workRepository.findAll(ids);
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Page<Work> list(Pageable page) {
        return workRepository.findAll(page);
    }

}

