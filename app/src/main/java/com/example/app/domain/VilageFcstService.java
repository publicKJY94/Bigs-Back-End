package com.example.app.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VilageFcstService {
	public List<VilageFcstDTO> selectAll();
}
