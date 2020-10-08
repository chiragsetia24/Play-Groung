package com.playing.Play.Ground.controllers;

import com.playing.Play.Ground.Entity.Play;
import com.playing.Play.Ground.common.UriEndpoints;
import com.playing.Play.Ground.serivce.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UriEndpoints.PLAY_BASE_URI)
public class PlayRunController {

    @Autowired
    @Qualifier(value = "play")
    private RunService runService;

    @Autowired
    @Qualifier(value = "play")
    private final RunService runService1;

    public PlayRunController(RunService runService1) {
        this.runService1 = runService1;
    }

    @GetMapping(UriEndpoints.RUN_PLAY)
    public Play runPlay() {
        if(runService.equals(runService1)) {
            System.out.println("same service");
        }
        return runService1.run(new Play());
    }
}
