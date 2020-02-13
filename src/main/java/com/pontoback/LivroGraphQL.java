package com.pontoback;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pontoback.model.Livro;
import com.pontoback.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class LivroGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private LivroService livroService;

    public Optional<Livro> findLivro(String isbn) {
        return livroService.findLivro(isbn);
    }

    public Livro createLivro(Livro livro, String email) {
        return livroService.create(livro, email);
    }

}