package br.com.bettatit.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bettatit.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
