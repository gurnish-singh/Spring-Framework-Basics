package com.gurnish.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
///hard-wiring not using controllers at this point
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
