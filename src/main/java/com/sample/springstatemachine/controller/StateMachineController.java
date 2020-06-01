package com.sample.springstatemachine.controller;

import com.sample.springstatemachine.models.Events;
import com.sample.springstatemachine.service.StateMachineService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@AllArgsConstructor
@Slf4j
public class StateMachineController {

  private StateMachineService stateMachineService;

  @GetMapping("/start")
  public void startFlow() {
    log.info("Starting Flow");
    this.stateMachineService.startState(Events.READ_MODEL);
  }
}