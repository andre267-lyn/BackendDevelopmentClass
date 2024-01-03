package com.ideaco.ewallet.service;

import com.ideaco.ewallet.dto.BalanceDTO;
import com.ideaco.ewallet.dto.EditEmailDTO;
import com.ideaco.ewallet.exception.UserNotFoundException;
import com.ideaco.ewallet.model.UserModel;
import com.ideaco.ewallet.repository.SetphotoRepository;
import com.ideaco.ewallet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public EditEmailDTO editUserEmail(int userId, String newEmail) throws UserNotFoundException {
        Optional<UserModel> userModelOptional = userRepository.findById(userId);
        if(userModelOptional.isEmpty()){
            throw new UserNotFoundException("User not found");
        }

        UserModel userModel = userModelOptional.get();
        userModel.setUserEmail(newEmail);

        userRepository.save(userModel);

        return convertDTO(userModel);
    }

    public EditEmailDTO convertDTO(UserModel userModel){
        EditEmailDTO editEmailDTO = new EditEmailDTO();
        editEmailDTO.setUserId(userModel.getUserId());
        editEmailDTO.setUserEmail(userModel.getUserEmail());
        return editEmailDTO;
    }

    @Autowired
    private BalanceService balanceService;
    public BalanceDTO showBalance(int userId) throws UserNotFoundException {
        Optional<UserModel> userModelOptional = userRepository.findById(userId);
        if (userModelOptional.isEmpty()) {
            throw new UserNotFoundException("User not found");
        }
        try {
            return balanceService.showBalance(userId);
        } catch (UserNotFoundException e) {
            throw new UserNotFoundException("User not found");
        }
    }

    public void setUserPhoto(int userId, String userPicture) {
        Optional<UserModel> userModelOptional = userRepository.findById(userId);
        if (userModelOptional.isPresent()) {
            UserModel userModel = userModelOptional.get();
            userModel.setUserPicture(userPicture);
            userRepository.save(userModel);
        } else {
            // Buat entitas baru jika tidak ditemukan
            UserModel newUserModel = new UserModel();
            newUserModel.setUserId(userId);
            newUserModel.setUserPicture(userPicture);
            userRepository.save(newUserModel);
        }
    }
}
