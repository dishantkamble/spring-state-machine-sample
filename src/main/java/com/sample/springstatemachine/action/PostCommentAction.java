package com.sample.springstatemachine.action;

import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

import com.sample.springstatemachine.models.Events;
import com.sample.springstatemachine.models.States;
import com.sample.springstatemachine.service.TestService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PostCommentAction implements Action<States, Events> {

    private TestService testService;

    @Override
    public void execute(StateContext<States, Events> context) {
        // String comment = context.getMessageHeader("comment").toString();
        // String workFlowId = context.getMessageHeader("workFlowId").toString();
        this.testService.printComment(context.getSource().getId(), context.getEvent(), context.getTarget().getId());
        context.getExtendedState().getVariables().put("customType", "customValue");
    }
}