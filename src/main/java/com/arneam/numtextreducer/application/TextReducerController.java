package com.arneam.numtextreducer.application;

import com.arneam.numtextreducer.domain.TextReducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reduce")
@Slf4j
public class TextReducerController {

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public int reduceToNumber(@PathVariable String name) {
    log.info("calling 'TextReducer#reduceToNumber' with parameter: " + name);
    return TextReducer.instance().reduceToNumber(name);
  }

}
