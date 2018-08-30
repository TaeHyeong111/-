package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.domain.ArticleDTO;
@Repository
public interface BoardMapper {
	public void add(ArticleDTO p);
	public List<?> selectList(Map<?,?>p); 
	public List<?> selectSome(Map<?,?>p); 
	public ArticleDTO selectOne(ArticleDTO p); 
	public int count(Map<?,?>p);
	public void update(ArticleDTO p);
	public void delete(ArticleDTO p);
	public ArticleDTO login(ArticleDTO p);
	public int countPaging();
	public ArticleDTO listCriteria();
	public List<ArticleDTO> listSearch();
}
