package com.example.app.internal;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.example.app.domain.VilageFcstDTO;

@Controller
public class GetVilageFcst {
	
	@GetMapping("/")
	public String mainPage() {
		System.out.println("메인페이지 요청 들어옴 : ");
		return "main";
	}
	
	
	// POST요청 시 공공데이터포털의 API를 호출하여 바로 DB에 적재
	@PostMapping("/getVilageFcst")
	public void getVilageFcst(VilageFcstDTO vilageFcstDTO, List<VilageFcstDTO> vilageFcstDTOs, RestTemplate restTemplate) {
		System.out.println("공공데이터 포탈 요청 들어옴");
		vilageFcstDTO.setSeviceKey("AYe0OJDFU%2B0xe1b0zlK9zXFd%2Fxc0WgFnNw7%2FtRcRBvSJDiGYL0e9%2B5MBP5oVcLz0DKpKon%2Fwpfqh5dmWFOTwqg%3D%3D");
		vilageFcstDTO.setPageNo(0);
		restTemplate.getForObject("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst", String.class, vilageFcstDTO.toString());
		System.out.println(vilageFcstDTOs);
	}
	
	//GET요청 시 DB에 저장된 데이터를 조회한다. 단, 데이터가 없을 경우 Http status 204오류를 응답해야 함
}
