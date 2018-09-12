package com.jhipcon.repository;

import com.jhipcon.domain.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Blog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {

}
