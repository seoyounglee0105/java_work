package ex04;

import java.util.ArrayList;

public interface IBuyDAO {
	
	// 결과 집합을 반환함
	ArrayList<BuyDTO> select();
	
	// 적용된 레코드 수를 반환함
	int insert(BuyDTO buyDTO);
	
	// 적용된 레코드 수를 반환함
	int update(BuyDTO buyDTO, String targetUserName, String targetProductName);
	
	void delete(String targetUserName);

}
