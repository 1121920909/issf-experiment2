package com.zyp.issf.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author ZYP
 */
@Controller
@Scope("prototype")
public class TestAction extends ActionSupport {
  @Override
  public String execute() throws Exception {
    System.out.println("test");
    return SUCCESS;
  }

  public String test() throws Exception{
    System.out.println("test");
    return SUCCESS;
  }
}
