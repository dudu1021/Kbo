//package com.kbo.controller;
//
//import com.kbo.domain.Post;
//import com.kbo.repository.PostRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class PostControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @BeforeEach // 테스트 메소드들이 실행되기 전에 항상 수행되도록 보장해주는 메소드
//    void clean(){
//        postRepository.deleteAll();
//    }
//
//
//    @Test
//    @DisplayName("/posts 요청시 Hello World를 출력한다.")
//    void test() throws Exception {
//        // expected
//        mockMvc.perform(post("/posts")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"title\" : \"제목입니다.\", \"content\": \"내용입니다.\"}")
//                )
//                .andExpect(status().isOk())
//                .andExpect(content().string(""))
//                .andDo(print());
//        // db -> post 1개 등록
//    }
//
//    @Test
//    @DisplayName("/posts 요청시 title값은 필수다.")
//    void test2() throws Exception {
//        // expected
//        mockMvc.perform(post("/posts")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"title\" : null, \"content\": \"내용입니다.\"}")
//                )
//                .andExpect(status().isBadRequest())
//                .andExpect(jsonPath("$.code").value("400"))
//                .andExpect(jsonPath("$.message").value("잘못된 요청입니다"))
//                .andExpect(jsonPath("$.validation.title").value("타이틀을 입력하세요."))
//                .andDo(print());
//
//    }
//
//    @Test
//    @DisplayName("/posts 요청시 DB에 값이 저장된다.")
//    void test3() throws Exception {
//        // before
//        postRepository.deleteAll();
//        // when
//        mockMvc.perform(post("/posts")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"title\" : null, \"content\": \"내용입니다.\"}")
//                )
//                .andExpect(status().isOk())
//                .andDo(print());
//        // db -> post 1개 등록 : Test3만 실행했을때
//        // then
//        assertEquals(1L, postRepository.count()); // 하나의 값이 있을 거라고 기대
//        // db -> post 2개 등록 - 전체를 실행했을떄
//
//        Post post = postRepository.findAll().get(0);
//        assertEquals("제목입니다.", post.getTitle());
//        assertEquals("내용입니다.", post.getContent());
//    }
//}
//
