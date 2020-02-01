package org.hzh.mybatis.blog;

import javax.annotation.Generated;

public class Post {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source field: post.post_id")
    private Long postId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.393+08:00", comments="Source field: post.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.392+08:00", comments="Source field: post.post_id")
    public Long getPostId() {
        return postId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.393+08:00", comments="Source field: post.post_id")
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.393+08:00", comments="Source field: post.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.393+08:00", comments="Source field: post.name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-31T22:23:17.393+08:00", comments="Source Table: post")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}