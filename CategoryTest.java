package com.example.zmall2;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

import com.example.zmall2.domain.product.entity.*;

@SpringBootTest
public class CategoryTest {
	@Autowired
	private CategoryRepository dao;
	
	@Test
	public void insertTest2() {
		Category c1 = new Category("1", "PC주요부품", null, null);
		Category c2 = new Category("2", "PC저장장치", null, null);
		
		Category c11 = Category.builder().categoryCode("11").categoryName("CPU").build();
		Category c12 = Category.builder().categoryCode("12").categoryName("그래픽 카드").build();
		c1.addCategory(c11);
		c1.addCategory(c12);
		
		Category c21 = Category.builder().categoryCode("21").categoryName("SSD").build();
		Category c22 = Category.builder().categoryCode("22").categoryName("하드디스크").build();
		c2.addCategory(c21);
		c2.addCategory(c22);
		
		Category c111 = Category.builder().categoryCode("111").categoryName("인텔").build();
		Category c112 = Category.builder().categoryCode("112").categoryName("라이젠").build();
		c11.addCategory(c111);
		c11.addCategory(c112);
		
		Category c121 = Category.builder().categoryCode("121").categoryName("nVidia").build();
		Category c122 = Category.builder().categoryCode("122").categoryName("AMD").build();
		c12.addCategory(c121);
		c12.addCategory(c122);
		
		Category c211 = Category.builder().categoryCode("211").categoryName("마이크론").build();
		Category c212 = Category.builder().categoryCode("212").categoryName("삼성").build();
		c21.addCategory(c211);
		c21.addCategory(c212);
		
		Category c221 = Category.builder().categoryCode("221").categoryName("Seagate").build();
		Category c222 = Category.builder().categoryCode("222").categoryName("도시바").build();
		c22.addCategory(c221);
		c22.addCategory(c222);
		
		
		
		dao.save(c1);
		dao.save(c2);
	}
}
