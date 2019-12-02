package com.buergervereinHSH.BackendProject.auth.DataAccessLayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buergervereinHSH.BackendProject.auth.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {
    User findByEmailIdIgnoreCase(String emailId);
}
