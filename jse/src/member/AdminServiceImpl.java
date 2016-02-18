package member;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AdminServiceImpl implements AdminService {

	TreeMap<String, MemberBean> memberMap;
	
	public AdminServiceImpl(){
		memberMap = new TreeMap<String, MemberBean>();
	}

	@Override
	public boolean join(MemberBean member) {
		// TODO Auto-generated method stub

		/* 중복 확인 */
		if(memberMap.get(member.getUserId()) != null) return false;

		memberMap.put(member.getUserId(), member);
		return true;
	}
	
	@Override
	public boolean join(String userId, String name, String password, String addr, int birth) {
		// TODO Auto-generated method stub
		
		/* 중복 확인 */
		if(memberMap.get(userId) != null) return false;
		
		MemberBean newBean = new MemberBean();
		newBean.setName(name);
		newBean.setPassword(password);
		newBean.setAddr(addr);
		newBean.setBirth(birth);
		memberMap.put(userId, newBean);
		
		return true;
	}

	@Override
	public MemberBean searchById(String id) {
		// TODO Auto-generated method stub
		
		/* 없을 때는 null */
		return memberMap.get(id); 
	}

	@Override
	public ArrayList<MemberBean> searchByName(String name) {
		// TODO Auto-generated method stub
		
		ArrayList<MemberBean> result = new ArrayList<MemberBean>();
		
		for(Entry<String, MemberBean> entry : memberMap.entrySet())
			if(entry.getValue().getName().equals(name))
				result.add(entry.getValue());
		
		return result;
	}

	@Override
	public boolean remove(String userId) {
		// TODO Auto-generated method stub
		
		if(memberMap.get(userId) == null)
			return false;
		
		memberMap.remove(userId);
		return true;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return memberMap.size();
	}

	@Override
	public int searchCountByName(String name) {
		// TODO Auto-generated method stub
		if(this.searchByName(name) == null) return 0;
		return this.searchByName(name).size();
	}


}
