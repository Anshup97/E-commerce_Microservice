package com.communitycart.reviewservice.repository;

import com.communitycart.reviewservice.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    public List<Review> findByProductId(Long productId);

    public Review findByReviewId(Long reviewId);

    public List<Review> findByProductIdAndCustomerId(Long productId, Long customerId);
}
