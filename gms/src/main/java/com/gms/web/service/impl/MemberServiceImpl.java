package com.gms.web.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gms.web.domain.MemberDTO;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.mapper.MemberMapper;
import com.gms.web.service.MemberService;

@Service /*@Service싱글톤임*/
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper memberMapper;
	@Override
	public void add(MemberDTO p) {
		int stf = Integer.valueOf(new SimpleDateFormat("yyyy").format(new Date()))+1-1900;
        String ssn = p.getSsn();
        String gender = "";
        int a = stf - Integer.parseInt(ssn.substring(0,2));
        gender=(ssn.substring(7,8).equals("1"))? "man":"woman" ;
        p.setAge(String.valueOf(stf - Integer.parseInt(ssn.substring(0,2))));
        p.setGender(gender);
	memberMapper.add(p);
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		return memberMapper.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MemberDTO p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(MemberDTO p) {
		System.out.println("서비스의 p : "+p);
		return memberMapper.login(p)!=null;
	}
	
}
