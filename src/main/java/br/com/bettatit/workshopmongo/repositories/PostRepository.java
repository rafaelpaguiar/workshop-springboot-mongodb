package br.com.bettatit.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bettatit.workshopmongo.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}