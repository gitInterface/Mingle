package com.ispan.mingle.projmingle.controller;
    
    



import java.lang.Integer;

import com.ispan.mingle.projmingle.entity.Work;
import com.ispan.mingle.projmingle.service.WorkService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 控制层
 *
 * @author makejava
 * @since 2024-01-08 17:05:37
 */
@RestController
@RequestMapping("/work")
@AllArgsConstructor
public class WorkController {

	private WorkService workService;

	/**
	 * 获取列表(分页)
	 */
	@GetMapping("/list")
	public Page<Work> list(Pageable page) {
		return null;
	}

	/**
	 * 获取
	 */
	@GetMapping("/get")
	public Work get(Integer id) {
		return workService.findById(id);
	}

	/**
	 * 添加
	 */
	@PostMapping("/add")
	public void add(@RequestBody Work work) {
		workService.save(work);
	}


	/**
	 * 修改
	 */
	@PostMapping("/update")
	public void update(@RequestBody Work work) {
		workService.save(work);
	}

	/**
	 * 删除
	 */
	@PostMapping("/delete")
	public Boolean delete(Integer id) {
		return workService.deleteById(id);
	}

}

