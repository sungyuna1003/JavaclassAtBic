package member;

//������̹� : ���̺��+Bean
//���� : ���ڵ�(����) ������ ������ ���
public class MemberBean {

	private int idx;
	private String name;
	private String phone;
	private String team;
	
	                 //getXxx
	public int getIdx() {
		return idx;
	}                 
	                   //setXxx(Ÿ�� �÷���)
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
