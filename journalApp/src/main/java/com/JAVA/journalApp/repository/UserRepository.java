package com.JAVA.journalApp.repository;
import com.JAVA.journalApp.entity.JournalEntry;
import com.JAVA.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, ObjectId>{

    User findByUserName(String username);
}
