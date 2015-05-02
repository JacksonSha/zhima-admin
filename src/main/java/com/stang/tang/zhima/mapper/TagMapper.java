package com.stang.tang.zhima.mapper;

import java.util.List;

import com.stang.tang.zhima.entity.Tag;

public interface TagMapper {

	public void createTag(Tag tag);

	public List<Tag> getTags();

	public int getTagsNum();

}
