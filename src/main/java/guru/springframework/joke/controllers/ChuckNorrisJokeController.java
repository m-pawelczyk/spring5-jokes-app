package guru.springframework.joke.controllers;

import guru.springframework.joke.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created ChuckNorrisJokeController in guru.springframework.joke.controllers
 * in project spring5-jokes-app
 */
@Controller
public class ChuckNorrisJokeController {

    private ChuckNorrisJokeService chuckNorrisJokeService;

    @Autowired
    public ChuckNorrisJokeController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    String showJoke(Model model){
        model.addAttribute("joke", chuckNorrisJokeService.getJoke());

        return "chucknorris";
    }
}
