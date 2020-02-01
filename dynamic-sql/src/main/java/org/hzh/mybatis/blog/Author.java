package org.hzh.mybatis.blog;

import javax.annotation.Generated;

public class Author {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.39+08:00", comments="Source field: author.author_id")
    private Long authorId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.39+08:00", comments="Source field: author.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source field: author.mobile")
    private String mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.39+08:00", comments="Source field: author.author_id")
    public Long getAuthorId() {
        return authorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.39+08:00", comments="Source field: author.author_id")
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.391+08:00", comments="Source field: author.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source field: author.mobile")
    public String getMobile() {
        return mobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source field: author.mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source Table: author")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorId=").append(authorId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append("]");
        return sb.toString();
    }
}