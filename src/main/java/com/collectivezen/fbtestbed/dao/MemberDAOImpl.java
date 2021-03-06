package com.collectivezen.fbtestbed.dao;

import org.springframework.stereotype.Repository;

import com.collectivezen.fbtestbed.dao.interfaces.MemberDAO;
import com.collectivezen.fbtestbed.hb.Member;

/**
 * <p>
 * The @Repository allows Spring to recognize this as a managed component (so we
 * don't need to specify it in XML) and also tells spring to do DAO exception
 * translation to the Spring exception hierarchy.
 * 
 * 
 */
@Repository
public class MemberDAOImpl extends BaseDAO<Member, Long> implements MemberDAO
{

}
