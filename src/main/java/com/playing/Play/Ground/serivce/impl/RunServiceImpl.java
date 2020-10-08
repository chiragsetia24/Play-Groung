package com.playing.Play.Ground.serivce.impl;

import com.playing.Play.Ground.Entity.Play;
import com.playing.Play.Ground.controllers.PlayRunController;
import com.playing.Play.Ground.repos.PlayRepo;
import com.playing.Play.Ground.serivce.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("play")
public class RunServiceImpl implements RunService {

    @Autowired
    private PlayRepo playRepo;

    @Autowired
    private PlayRepo playRepo1;

    @Override
    public Play run(Play play) {
        System.out.println(playRepo1.findAll());
        String a = playRepo1.toString();
        String b = playRepo.toString();
        if(playRepo1.equals(playRepo)) {
            System.out.println("same");
        }
        return save(play);
    }

    private Play save(Play play) {
        return playRepo.saveAndFlush(play);
    }
}
