package org.hzh.mybatis.blog;

import javax.annotation.Generated;

public class Blog {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.371+08:00", comments="Source field: blog.blog_id")
    private Long blogId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.state")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.38+08:00", comments="Source field: blog.author_name")
    private String authorName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.378+08:00", comments="Source field: blog.blog_id")
    public Long getBlogId() {
        return blogId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.blog_id")
    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.state")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.379+08:00", comments="Source field: blog.state")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.38+08:00", comments="Source field: blog.author_name")
    public String getAuthorName() {
        return authorName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.38+08:00", comments="Source field: blog.author_name")
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.38+08:00", comments="Source Table: blog")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", blogId=").append(blogId);
        sb.append(", title=").append(title);
        sb.append(", state=").append(state);
        sb.append(", authorName=").append(authorName);
        sb.append("]");
        return sb.toString();
    }
}