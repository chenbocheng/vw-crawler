package hunteron;

import com.github.vector4wang.VWCrawler;

/**
 * Created with IDEA
 * User: vector
 * Data: 2017/12/13
 * Time: 15:57
 * Description:
 */
public class TestMain {
	public static void main(String[] args) {
		String[] urls = new String[100];
		for (int i = 0; i < 100; i++) {
			urls[i] = "http://www.hunteron.com/elite/position/detail/" + i + ".htm";
		}

		new VWCrawler.Builder().setSeedUrl(urls).setThreadCount(5)
				.setPageParser(new HunteronCrawlerService()).setTimeOut(10000).build().start();
	}
}
