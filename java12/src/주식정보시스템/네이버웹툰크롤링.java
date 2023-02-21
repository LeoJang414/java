package 주식정보시스템;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null;
		try {
			doc = con.get();
			Elements list = doc.select(".menu span");
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(doc);
	}

}
