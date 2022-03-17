package com.training.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


	//index表示
	@RequestMapping(value = {"/"})
	public String index() {
	   return "index";
	}
	
	//コトバ供養画面表示
	@RequestMapping(value = "/guchi")
	public String guchi() {
	   return "guchiInput";
	}
	
	//お焚き上げ画面表示
	@RequestMapping(value = "/kuyou")
	public String otakiage() {
	   return "otakiage";
	}
	
	//戦争ゲーム画面表示
	@RequestMapping(value = "/war")
		public String wargame() {
		   return "wargameplay";
	}


}
