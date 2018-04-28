package com.zyp.issf.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.print.attribute.standard.NumberUp;

/**
 * @author ZYP
 */
@Controller
@Scope("prototype")
public class StudentInfoAction extends ActionSupport {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String execute() throws Exception {
    return SUCCESS;
  }
}
