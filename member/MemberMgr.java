package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

//DB와 연동에 필요한 모든 기능을 객체화 시킨것이 Mgr
public class MemberMgr {

	//DB 연결 객체 10개 만들어 놓음.
	private DBConnectionMgr pool;
	
	public MemberMgr() {
     pool = DBConnectionMgr.getInstance();
     
	}
	//리스트
	//제네릭: Vector에 저장되는 타입을 MemberBean 지정(옵션)
	public Vector<MemberBean> getListMember(){
		
		//DB연결 실행 공식
		Connection con = null;  //DB연결 객체]
		PreparedStatement pstmt = null; //sql 문 만드는 객체
		ResultSet rs = null; //select문 실행 결과값 리턴 객체
		String sql = null; 
		Vector <MemberBean> vlist  = new Vector <MemberBean>();
		try {
			//pool 객체에서 빌려옴
			con = pool.getConnection();
			//sql문 선언
			sql = "select * from tblMember order by idx";
			//DB에 실행하기 위해 pstmt 문 생성
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();//DB 실행 후 결과값 리턴(DB값을 자바로 가져옴)
			while(rs.next()/*현재 커서에서 다음 커서로 이동*/) {
				MemberBean bean = new MemberBean();
				bean.setIdx(rs.getInt("idx"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setTeam(rs.getString("team"));
				//레코드를 저장시킨 빈즈를 Vector에 저장
				vlist.addElement(bean);

			} //--While
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//con은 반납, pstmt이랑 rs는 close 해야함.
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	//레코드 한개 가져오기
			public   MemberBean getMemeber(int idx) {
				
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			
			MemberBean bean = new MemberBean();

			try {
				con = pool.getConnection();
				sql = "select * from tblMember where idx=?";
				//매개변수 idx를 첫번째 물음표에 셋팅
				pstmt.setInt(1, idx); //커리문 완성
				pstmt = con.prepareStatement(sql); //실행
				rs = pstmt.executeQuery(); //실행된 값을 받음, 
				if(rs.next()) {
					bean.setIdx(rs.getInt(1));//테이블 스키마 인텍스
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt, rs);
			}
			return bean;
		}
		
		//입력
           public boolean insertMember(MemberBean bean) { //저장이 잘되었나 안되었나 확인하려고 불린
        	   Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "insert into tblMember(idx,name,phone,team)"+"values(sequmember.nextval,?,?,?)"; //이름,폰번호,팀 ?을 각각
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
			return flag; //제어권이 있으면 o, 없으면 x. 뜻을 나타내기 위해 flag 사용
           }
		//수정
           public boolean updateMember(MemberBean bean) { //저장이 잘되었나 안되었나 확인하려고 불린
        	   Connection con = null;
			PreparedStatement pstmt = null;
			String sql = null;
			boolean flag = false;
			try {
				con = pool.getConnection();
				sql = "update tblMember set name=?, phone=?, team=? "+ "where idx=?"; //team 하고 반드시 띄어씌기 해야함.
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, bean.getName());
				pstmt.setString(2, bean.getPhone());
				pstmt.setString(3, bean.getTeam());
				pstmt.setInt(4, bean.getIdx()); //"where idx=?"은 정수니까 setInt로
				int cnt = pstmt.executeUpdate(); //insert,update,delete
                if(cnt==1) flag = true;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pool.freeConnection(con, pstmt);
			}
			return flag; //제어권이 있으면 o, 없으면 x. 뜻을 나타내기 위해 flag 사용
           }
           
		//삭제
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

