package com.example.app.domain;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

// 기상정보 열람시 필요한 DTO
@Data
public class VilageFcstDTO {
	private String seviceKey;	// API키
	private int numOfRows;		// 한 페이지에 보여줄 개수
	private int pageNo;			// 페이지 번호
	private String dataType;	// 데이터 형식
	private Date base_date;		// 연 월 일
	private Time base_time;		// 시 분 초
	private int nx;				// 위도
	private int ny;				// 경도
}
