package com.kbo.controller;

import com.kbo.dto.MemberDTO;
import com.kbo.dto.PlayerDTO;
import com.kbo.service.PlayerService;
import com.kbo.service.TeamService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
public class ScrapingController {
    @Autowired
    private TeamService teamService;
    @Autowired
    private PlayerService playerService;

    @RequestMapping("/players")
    public String players(HttpSession session, Model model,
                          @RequestParam(value = "position", required = false, defaultValue = "null") String pos) {
        MemberDTO dto = (MemberDTO) session.getAttribute("login");
        if (dto == null) {
            return "redirect:/login"; // 로그인 페이지로 리디렉트
        }
        int myTeam = dto.getTeam_code();
        String selectedTeam = teamService.team_name(myTeam);
        model.addAttribute("myTeam", selectedTeam);
        HashMap<String, String> map = new HashMap<>();
        map.put("team", selectedTeam);
        map.put("pos", pos);
        List<PlayerDTO> list = playerService.find_Allplayer(map);
        model.addAttribute("list", list);
        return "/team/players";
    }

//    @GetMapping("/playerInfo")
//    public String playerInfo(String player, String team, Model model) {
//
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("team", team);
//        map.put("player", player);
//        PlayerDTO dto = playerService.find_player(map);
//        model.addAttribute("dto", dto);
//
//        return "/team/playerInfo";
//    }
}