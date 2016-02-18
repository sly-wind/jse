package member;

import java.util.ArrayList;

public interface AdminService {

	public boolean join(String userId, String name, String password, String addr, int birth);
	public boolean join(MemberBean member);
	
	public MemberBean searchById(String userId);
	public ArrayList<MemberBean> searchByName(String name);
	public boolean remove(String userId);
	public int countAll();
	public int searchCountByName(String name);
	
}
