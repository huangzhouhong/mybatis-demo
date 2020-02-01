package org.hzh.mybatis.blog;

import java.util.List;

import org.hzh.mybatis.interaction.Sql;

public interface BlogMapper {
	@Sql("select * from blog where state='ACTIVE' and title=#?{title}")
	List<Blog> findActiveBlogWithTitleLike(String title);

	List<Blog> findActiveBlogLike(String title, Author author);

	List<Blog> findBlogLike(String state, String title, Author author);

	List<Post> selectPostIn(List<Integer> ids);

	int updateAuthorIfNecessary(Author author);

	@Sql("delete from author where id=#{id}")
	int delete(String id);

	int insert(Blog... blogs);
}
