package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 13.04.2020
 * created ChuckNorrisJokeServiceImpl in guru.springframework.joke.services
 * in project spring5-jokes-app
 */

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
