package org.hzh.mybatis;

import java.util.Arrays;
import java.util.List;

import org.hzh.mybatis.blog.Author;
import org.hzh.mybatis.blog.Blog;
import org.hzh.mybatis.blog.BlogMapper;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class BlogMapperTests {
	private static final Logger log = LoggerFactory.getLogger(BlogMapperTests.class);
	@Autowired
	BlogMapper blogMapper;

	@Test
	void findActiveBlogWithTitleLikeTest() {
		log.debug("start");
		List<Blog> blogs = blogMapper.findActiveBlogWithTitleLike("test");
		System.out.println(blogs);
	}

	@Test
	void findActiveBlogLikeTest() {
		log.debug("start");
		Author author = null;
		List<Blog> blogs = blogMapper.findActiveBlogLike("test", author);
		author = new Author();
		blogs = blogMapper.findActiveBlogLike("test", author);
		author.setUserName("san");
		blogs = blogMapper.findActiveBlogLike("test", author);
		System.out.println(blogs);
	}

	@Test
	void findBlogLike() {
		log.debug("start");
		Author author = new Author();
		author.setUserName("san");
		List<Blog> blogs = blogMapper.findBlogLike(null, "test", author);
		System.out.println(blogs);
	}

	@Test
	void selectPostIn() {
		log.debug("start");
		blogMapper.selectPostIn(Arrays.asList(1,2,3));
	}

	@Test
	void updateAuthorIfNecessary() {
		log.debug("start");
		Author author =new Author();
		author.setAuthorId((long)1);
		author.setUserName("san");
		blogMapper.updateAuthorIfNecessary(author);
	}
	
	@Test
	@Transactional
	@Rollback
	void insertTest() {
		log.debug("start");
		Blog blog1=new Blog();
		blog1.setBlogId((long)10);
		blog1.setTitle("blog1 title");
		
		blogMapper.insert(blog1);
	}
	
	@Test
	@Transactional
	@Rollback
	void insertBatchTest() {
		log.debug("start");
		Blog blog1=new Blog();
		blog1.setBlogId((long)10);
		blog1.setTitle("blog1 title");
		
		Blog blog2=new Blog();
		blog2.setBlogId((long)11);
		blog2.setTitle("blog2 title");
		
		blogMapper.insert(blog1,blog2);
	}
}
