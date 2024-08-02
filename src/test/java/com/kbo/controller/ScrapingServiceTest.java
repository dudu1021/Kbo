//package com.kbo.service;
//
//import org.jsoup.Connection;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.io.IOException;
//
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//public class ScrapingServiceTest {
//
//    @Autowired
//    private ScrapingService scrapingService;
//
//    @Test
//    public void testScrapeBaseballRankings() throws IOException {
//        // Connection과 Document를 모킹
//        Connection mockConnection = mock(Connection.class);
//        Document mockDoc = Jsoup.parse("<html><body><div class='tmp_wrap'><div class='tabgroup3'>Ranking Info</div></div></body></html>");
//
//        // Jsoup의 static 메서드 connect를 모킹하고, 연결 및 문서 객체를 반환하도록 설정
//        Mockito.mockStatic(Jsoup.class).when(() -> Jsoup.connect(anyString())).thenReturn(mockConnection);
//        when(mockConnection.userAgent(anyString())).thenReturn(mockConnection);
//        when(mockConnection.get()).thenReturn(mockDoc);
//
//        // 실제 크롤링 메서드 실행
//        scrapingService.scrapeBaseballRankings();
//
//        // 결과 출력 검증
//        verify(mockConnection).get(); // get()이 호출되었는지 확인
//    }
//}