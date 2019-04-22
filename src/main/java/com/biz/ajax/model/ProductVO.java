package com.biz.ajax.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * @Data는 가급적 쓰지말자. vo가 무거워지는 느낌
 */
@Setter
@Getter
@NoArgsConstructor	//super생성자
@AllArgsConstructor //member생성자
@ToString			
public class ProductVO {
	
	private String p_ccode;
	private String p_cname;
	private int p_vat;
	private int p_iprice;
	private int p_oprice;
	
	
}
