package com.ideaco.ewallet.repository;

import com.ideaco.ewallet.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetphotoRepository extends JpaRepository<UserModel, Integer> {
    static UserModel findByUserId(int userId) {
        return null;
    }
}