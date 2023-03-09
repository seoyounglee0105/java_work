package ex04;

import java.util.ArrayList;

public interface IBuyDAO {
	
	ArrayList<BuyDTO> select();
	
	int insert(BuyDTO buyDTO);
	
	int update(BuyDTO buyDTO, String targetUserName, String targetProductName);
	
	// 구매 테이블은 참조되지 않아 삭제 여부 결과를 알아볼 필요가 없음
	void delete(String targetUserName);

}
