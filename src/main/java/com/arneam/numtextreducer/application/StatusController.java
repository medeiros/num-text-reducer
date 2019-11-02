package com.arneam.numtextreducer.application;

import java.lang.management.ManagementFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("status")
public class StatusController {

  @Autowired
  private Environment env;

  @GetMapping("check")
  @ResponseStatus(HttpStatus.OK)
  public String check() {
    return "port " + env.getProperty("local.server.port") + " ==> " +
        ManagementFactory.getRuntimeMXBean().getName();
  }

}
