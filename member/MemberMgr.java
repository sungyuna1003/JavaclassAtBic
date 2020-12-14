package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

//DB�� ������ �ʿ��� ��� ����� ��üȭ ��Ų���� Mgr
public class MemberMgr {

	//DB ���� ��ü 10�� ����� ����.
	private DBConnectionMgr pool;
	
	public MemberMgr() {
     pool = DBConnectionMgr.getInstance();
     
	}
	//����Ʈ
	//���׸�: Vector�� ����Ǵ� Ÿ���� MemberBean ����(�ɼ�)
	public Vector<MemberBean> getListMember(){
		
		//DB���� ���� ����
		Connection con = null;  //DB���� ��ü]
		PreparedStatement pstmt = null; //sql �� ����� ��ü
		ResultSet rs = null; //select�� ���� ����� ���� ��ü
		String sql = null; 
		Vector <MemberBean> vlist  = new Vector <MemberBean>();
		try {
			//pool ��ü���� ������
			con = pool.getConnection();
			//sql�� ����
			sql = "select * from tblMember order by idx";
			//DB�� �����ϱ� ���� pstmt �� ����
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();//DB ���� �� ����� ����(DB���� �ڹٷ� ������)
			while(rs.next()/*���� Ŀ������ ���� Ŀ���� �̵�*/) {
				MemberBean bean = new MemberBean();
				bean.setIdx(rs.getInt("idx"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setTeam(rs.getString("team"));
				//���ڵ带 �����Ų ��� Vector�� ����
				vlist.addElement(bean);

			} //--While
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//con�� �ݳ�, pstmt�̶� rs�� close �ؾ���.
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//���ڵ� �Ѱ� ��������
			public   MemberBean getMemeber(int idx) {
				
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			
			MemberBean bean = new MemberBean();

			try {
				con = pool.getConnection();
				sql = "select * from tblMember where idx=?";
				//�Ű����� idx�� ù��° ����ǥ�� ����
				pstmt.setInt(1, idx); //Ŀ���� �ϼ�
				pstmt = con.prepareStatement(sql); //����
				rs = pstmt.executeQuery(); //����� ���� ����, 
				if(rs.next()) {
					bean.setIdx(rs.getInt(1));//���̺� ��Ű�� ���ؽ�
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return bean;
		}
		
		//�Է�
           public boolean insertMember(MemberBean bean) { //������ �ߵǾ��� �ȵǾ��� Ȯ���Ϸ��� �Ҹ�
        	   Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "insert into tblMember(idx,name,phone,team)"+"values(sequmember.nextval,?,?,?)"; //�̸�,����ȣ,�� ?�� ����
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getPhone());
				pstmt.setString(3, bean.getTeam());
				int cnt = pstmt.executeUpdate(); //insert,update,delete
                if(cnt==1) flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
			return flag; //������� ������ o, ������ x. ���� ��Ÿ���� ���� flag ���
           }
		//����
           public boolean updateMember(MemberBean bean) { //������ �ߵǾ��� �ȵǾ��� Ȯ���Ϸ��� �Ҹ�
        	   Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "update tblMember set name=?, phone=?, team=? "+ "where idx=?"; //team �ϰ� �ݵ�� ���� �ؾ���.
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getPhone());
				pstmt.setString(3, bean.getTeam());
				pstmt.setInt(4, bean.getIdx()); //"where idx=?"�� �����ϱ� setInt��
				int cnt = pstmt.executeUpdate(); //insert,update,delete
                if(cnt==1) flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
			return flag; //������� ������ o, ������ x. ���� ��Ÿ���� ���� flag ���
           }
           
		//����
           public boolean deleteMember(int idx) {
        	   Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "delete from tblMember where idx=?";
				pstmt = con.prepareStatement(sql);
				pstmt .setInt(1, idx);
				int cnt = pstmt.executeUpdate(); 
				
                 if(cnt==1) flag =true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
			return flag;
           }
	}

