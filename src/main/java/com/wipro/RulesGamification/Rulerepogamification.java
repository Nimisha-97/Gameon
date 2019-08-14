package com.wipro.RulesGamification;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rulerepogamification extends MongoRepository<Rulegamification,String>{
	Rulegamification findBy_id(ObjectId _id);

}
