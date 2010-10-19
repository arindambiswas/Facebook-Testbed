package com.collectivezen.fbtestbed.remote;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.collectivezen.fbtestbed.hb.Member;
import com.collectivezen.fbtestbed.service.MemberService;
import com.trg.search.Search;

@Transactional
public class HibernateService
{

	private SessionFactory sessionFactory;
	MemberService memberService;

	@Autowired
	public void setMemberService(MemberService memberService)
	{
		this.memberService = memberService;
	}

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	public String helloWorld()
	{
		return "Hello World!";
	}

	public String sayHello(String name)
	{
		return "Hello " + name + "!";
	}

	public Member getMember()
	{
		Search search = new Search();
		search.addFilterEqual("memberId", "-100");
		Member member = memberService.searchUnique(search);
		 
		return member;
	}
	
}
