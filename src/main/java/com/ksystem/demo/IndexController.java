package com.ksystem.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 顧客画面のコントローラクラス。
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

  /**
   * 一覧画面
   *
   * @param model モデル
   * @return 遷移先
   */
  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String index(Model model) {
    return "index";
  }
}