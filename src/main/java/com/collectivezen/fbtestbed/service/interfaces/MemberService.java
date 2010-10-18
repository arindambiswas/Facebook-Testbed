package com.collectivezen.fbtestbed.service.interfaces;

import java.util.List;

import com.collectivezen.fbtestbed.dao.interfaces.MemberDAO;
import com.collectivezen.fbtestbed.hb.Member;
import com.trg.search.ISearch;
import com.trg.search.SearchResult;

public interface MemberService
{

	public void save(Member member);

	public void delete(Long id);

	public List<Member> findAll();

	public List<Member> search(ISearch search);

	public Member searchUnique(ISearch search);

	public SearchResult<Member> searchAndCount(ISearch search);

	public Member findById(Long id);

	public Member findByGuid(String guid);

	public Member findByName(String name);

	public MemberDAO getDao();

	public void flush();
}