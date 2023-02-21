package 주식정보시스템;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=003490#");
		
		Document doc = null;
		try {
			doc = con.get();
			Elements codeList = doc.select("span.f_up");
			
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println(code);
			
			Elements codeList1 = doc.select(".sptxt.sp_txt10");
			
			System.out.println(codeList1.size());
			Element tag1 = codeList1.get(0);
			String code1 = tag1.text();
			System.out.println(code1);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(doc);
	}

}
