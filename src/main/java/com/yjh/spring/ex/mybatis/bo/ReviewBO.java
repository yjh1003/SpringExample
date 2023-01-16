package com.yjh.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjh.spring.ex.mybatis.dao.ReviewDAO;
import com.yjh.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	// 파라미터로 전달 받은 id 데이터 조회
	public Review getReview(int id) {
		Review review = reviewDAO.selectReview(id);
		return review;
	}
	
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
		
	}
	
	public int addReviewByObject(Review review) {
	
		return reviewDAO.insertReviewByObject(review);
	}
}
