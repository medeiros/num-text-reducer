package com.arneam.numtextreducer.application;

import com.arneam.numtextreducer.domain.TextReducer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reduce")
public class TextReducerController {

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public int reduceToNumber(@PathVariable String name) {
    return TextReducer.instance().reduceToNumber(name);
  }

}
